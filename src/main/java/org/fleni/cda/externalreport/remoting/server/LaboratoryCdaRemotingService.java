package org.fleni.cda.externalreport.remoting.server;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.fleni.cda.common.remoting.IntegrationResponseCode;
import org.fleni.cda.common.utils.ParametricData;
import org.fleni.cda.externalreport.model.entity.CdaErrorBackup;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;
import org.fleni.cda.externalreport.model.service.ICdaErrorBackupService;
import org.fleni.cda.externalreport.model.service.IExternalReportDataService;
import org.fleni.cda.externalreport.model.service.IExternalReportInfoService;
import org.fleni.cda.externalreport.remoting.dto.ExternalReportResponse;
import org.fleni.cda.oid.model.entity.CodeSystem;
import org.fleni.cda.oid.model.entity.ConvertMasterType;
import org.fleni.cda.oid.model.entity.EpisodeType;
import org.fleni.exception.IdReportRequiredException;
import org.fleni.exception.WrongFormatDateException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.w3c.dom.Node;

//EndPoint : http://localhost:8080/cda-mais-integration/ws/LaboratoryCdaRemotingService?wsdl
@Service("laboratoryCdaRemotingService")
public class LaboratoryCdaRemotingService implements ILaboratoryCdaRemotingService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LaboratoryCdaRemotingService.class);
	@Autowired
	private IExternalReportInfoService externalReportInfoService;
	@Autowired
	private IExternalReportDataService externalReportDataService;
	@Autowired
	private ICdaErrorBackupService cdaErrorBackupService;
	/**
	 * 
	 */
	private CdaErrorBackup cdaMessage;
	/**
	 * 
	 */
	@Override
	public ExternalReportResponse sendCDALaboratory(String cda) {
		cdaMessage = new CdaErrorBackup();
		cdaMessage.setMessageCdaData(cda.getBytes());
		cdaMessage.setStatus(0L);
		Integer response = 0;
		String message = "";
			try {
				createExternalReportInfo(cda);
			} catch (WrongFormatDateException e) {
				response = 3;
				message = e.getMessage();
				LOGGER.error(e.getMessage(), e);
			} catch (IdReportRequiredException e) {
				response = 1;
				message = e.getMessage();
				LOGGER.error(e.getMessage(), e);
			} catch (Exception e) {
				cdaErrorBackupService.createOrUpdate(cdaMessage);
				LOGGER.error(e.getMessage(), e);
			}
		return createResponseReport(response, message);
	}

	/**
	 * @param externalReportInformation
	 * @return
	 * @throws WrongFormatDateException 
	 * @throws IdReportRequiredException 
	 */
	private ExternalReportInfo createExternalReportInfo(String cda) throws WrongFormatDateException, IdReportRequiredException, Exception {
		ExternalReportInfo externalReportInfo = new ExternalReportInfo();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = null;
		String typeEpisodeCode = "";
		EpisodeType episodeTypes = null;
		CodeSystem codeSystem = null;
		DocumentBuilderFactory domFactory = null;
		DocumentBuilder builder = null;
		Document dDoc = null;
		XPath xPath = null;
		try {
			domFactory = DocumentBuilderFactory.newInstance();
			builder = domFactory.newDocumentBuilder();
			InputStream stream = new ByteArrayInputStream(cda.getBytes());
			dDoc = builder.parse(stream);
			xPath = XPathFactory.newInstance().newXPath();
			
			Node reportId = (Node) xPath.evaluate("/ClinicalDocument/setId/@extension", dDoc, XPathConstants.NODE);
			
			if(reportId.getNodeValue() != null && !reportId.getNodeValue().equals("")){
				externalReportInfo.setReportId(reportId.getNodeValue());
			}else{
				throw new IdReportRequiredException("/ClinicalDocument/setId/@extension ir required.");
			}
			Node effectiveTime = (Node) xPath.evaluate("/ClinicalDocument/effectiveTime/@value", dDoc,
					XPathConstants.NODE);
			String d = effectiveTime.getNodeValue();
			try {
			    @SuppressWarnings("unused")
				Date dat = new SimpleDateFormat("yyyyMMdd HH:mm:ss").parse(d);
			    d = new StringBuilder(d).insert(4, "/").insert(7, "/").toString();
	            effectiveTime.setNodeValue(d);
				date = formatter.parse(d);
				externalReportInfo.setCreationDate(date);
				externalReportInfo.setReportDate(date);
			} catch (ParseException e) {
				throw new WrongFormatDateException("/ClinicalDocument/effectiveTime/@value wrong format, should be YYYYMMDD HH:MM:SS .");
			}
			
			TransformerFactory transformerFactory = TransformerFactory.newInstance();
    		Transformer transformer = transformerFactory.newTransformer();
    		DOMSource source = new DOMSource(dDoc);
    		StringWriter writer = new StringWriter();
    		transformer.transform(source, new StreamResult(writer));
    		cda = writer.toString();

			Node nhc = (Node) xPath.evaluate("/ClinicalDocument/recordTarget/patientRole/id[3]/@extension",
					dDoc, XPathConstants.NODE);
			externalReportInfo.setNhc(nhc.getNodeValue() != null ? nhc.getNodeValue() :"");

			Node episodeNumber = (Node) xPath.evaluate(
					"/ClinicalDocument/componentOf/encompassingEncounter/id/@extension", dDoc, XPathConstants.NODE);
			externalReportInfo.setEpisodeNumber(episodeNumber.getNodeValue() != null ? episodeNumber.getNodeValue() :"");

			Node typeEpisode = (Node) xPath.evaluate(
					"/ClinicalDocument/componentOf/encompassingEncounter/code/@code", dDoc, XPathConstants.NODE);
			typeEpisodeCode = typeEpisode.getNodeValue();

			
			for (CodeSystem c : ParametricData.LST_CODE_SYSTEM) {
				if (c.getCode().equals(typeEpisodeCode)) {
					codeSystem = c;
				}
			}

			for (ConvertMasterType c : ParametricData.LST_CONVERT_MASTER_TYPE) {
				if (c instanceof EpisodeType) {
					if (c.getCodeSystem().getId().intValue() == codeSystem.getId().intValue()) {
						episodeTypes = (EpisodeType) c;
					}
				}
			}
			externalReportInfo.setTypeEpisode(episodeTypes != null ? episodeTypes.getTypeMasterSystemExternal():"");
			externalReportInfo.setExternalReportType(
					ParametricData.MAP_EXTERNAL_REPORT_TYPE.get("INFORME DE ESTUDIO LABORATORIO"));
			externalReportInfoService.createOrUpdateNative(externalReportInfo);
			
			createExternalReportData(cda,externalReportInfo);
			
		} catch (IdReportRequiredException e) {
			throw new IdReportRequiredException(e.getMessage());
		} catch (WrongFormatDateException e) {
			throw new WrongFormatDateException(e.getMessage());
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		return externalReportInfo;
	}
	/**
	 * @param externalReportInformation
	 * @param externalReportInfo
	 */
	private void createExternalReportData(String cda, ExternalReportInfo externalReportInfo) {
		ExternalReportData externalReportData = new ExternalReportData();
		externalReportData.setCreationDate(externalReportInfo.getReportDate());
		externalReportData.setMessageCdaData(cda.getBytes());
		externalReportData.setExternalReportInfo(externalReportInfo);		
		externalReportDataService.createOrUpdateNative(externalReportData);
	}
	/**
	 * @param code
	 * @param messageXmlDatas
	 * @return
	 */
	private ExternalReportResponse createResponseReport(Integer code,String message) {
		ExternalReportResponse intReportResp = new ExternalReportResponse();
		intReportResp.setCode(code.toString());
		String description = IntegrationResponseCode.getDescriptionByCode(code);
		if(!message.isEmpty()){
			description += " " + message;
		}
		intReportResp.setDescription(description);
		return intReportResp;
	}

}
