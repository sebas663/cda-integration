package org.fleni.cda.externalreport.remoting.server;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.http.conn.ConnectTimeoutException;
import org.fleni.cda.common.remoting.IntegrationResponseCode;
import org.fleni.cda.common.xml.ReportConstant;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;
import org.fleni.cda.externalreport.model.entity.ExternalReportType;
import org.fleni.cda.externalreport.model.service.IExternalReportInfoService;
import org.fleni.cda.externalreport.remoting.dto.DocumentCdaCandidates;
import org.fleni.cda.externalreport.remoting.dto.DocumentCdaInformation;
import org.fleni.cda.externalreport.remoting.rest.server.ICarestreamTokenRestService;
import org.fleni.cda.externalreport.remoting.utils.DocumentCdaType;
import org.fleni.cda.json.mapper.report.ReportIntegration;
import org.fleni.cda.process.manager.service.IManagerDocumentCdaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import redis.clients.jedis.Jedis;

//EndPoint : http://localhost:8080/cda-mais-integration/ws/DocumentCdaRemotingService?wsdl

@Service("documentCdaRemotingService")
public class DocumentCdaRemotingService implements IDocumentCdaRemotingService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(DocumentCdaRemotingService.class);
	
	@Autowired
	private  ICarestreamTokenRestService carestreamTokenRestService;
	
	@Autowired
	private IExternalReportInfoService externalReportInfoService;
	
	@Autowired
	private IManagerDocumentCdaService managerDocumentCdaService;
	
	@Value("${redis.cache.expire.time}")
	private  String expireTime;
	
	@Value("${redis.cache.host}")
	private  String host;
	
	@Value("${redis.cache.port}")
	private  String port;
	
	@Value("${redis.cache.pass}")
	private  String passRedis;
	
	/* (non-Javadoc)
	 * @see org.fleni.cda.externalreport.remoting.server.IDocumentCdaRemotingService#findDocumentCda(org.fleni.cda.externalreport.remoting.dto.DocumentCdaInformation)
	 */
	@Override
	public DocumentCdaCandidates findDocumentCda(DocumentCdaInformation documentCdaInformation) {
		// TODO Auto-generated method stub
		List<String> messageXmlDatas = null;
		Integer response = validateInformation(documentCdaInformation);		
		if (response == 0) {
			try {
				messageXmlDatas = findDocumentsXmlCdaData(documentCdaInformation);
				if(messageXmlDatas.size() == 0){
					response = IntegrationResponseCode.DATA_NOT_FOUND.getCode();
				}
			} catch (Exception e) {
				response = IntegrationResponseCode.DATA_NOT_FOUND.getCode();
				LOGGER.error(e.getMessage(), e);
			}
		}				
		return createResponseReport(response, messageXmlDatas);
	}

	/**
	 * @param documentCdaInformation
	 * @return
	 * @throws Exception 
	 */
	private List<String> findDocumentsXmlCdaData(DocumentCdaInformation documentCdaInformation) throws Exception {
		List<String> xmlDatas = new ArrayList<>();
		
//		long initALL = System.currentTimeMillis();
		// Getting: ExternalReportInfo
		List<ExternalReportInfo> lst = externalReportInfoService.findListExternalReportInfoByParameter(
				documentCdaInformation.getDocumentId(), 
				documentCdaInformation.getDocumentName(),
				documentCdaInformation.getNhc(),		
				documentCdaInformation.getEpisodeNumber(),
				documentCdaInformation.getFromDate(),
				documentCdaInformation.getToDate());
//		long finALL = System.currentTimeMillis(); // Instante final del procesamiento
//		String tiempo = "Tiempo total findListExternalReportInfoByParameter: " + (finALL - initALL) / 1000 + " Segundos";
//		System.out.println(tiempo);
		
		if(lst != null){
			Jedis jedis = null;
			try {
				Long port = Long.parseLong(this.port.trim());
				jedis = new Jedis(this.host,port.intValue());
				jedis.auth(this.passRedis);
			} catch (Exception e) {
				LOGGER.error("[ NO SE PUEDE CONECTAR A REDIS ] " + e.getMessage(), e);
			}
			Collections.sort(lst,new ExternalReportInfoComparatorDesc());
			for(ExternalReportInfo externalReportInfo:lst){
				
				// Setting: XmlCdaData
				Long id = externalReportInfo.getExternalReportType().getId();
				boolean isImageReport = false;
				boolean generateCda = false;
				if(id == DocumentCdaType.REPORT_IMAGES.getCode().longValue()){
					isImageReport = true;
				}
				
				for (ExternalReportData externalReportData : externalReportInfo.getExternalReportDatas()) {
					
					if (externalReportData.getMessageCdaData() == null || externalReportData.getMessageCdaData().length == 0) {
						generateCda = true;
					}
					if (generateCda) {
						ExternalReportData aux = builderXmlCdaData(externalReportData,externalReportInfo.getExternalReportType());
						xmlDatas.add(getStringFromBytes(aux.getMessageCdaData()));
					} else {
						if(isImageReport){
							if(jedis.isConnected()){
				            	String cacheKey = buildCacheKey(externalReportInfo,externalReportData);
				            	
				    			Long resp = jedis.ttl(cacheKey);
				    			// -2 cache expired 
				    			// -1 cache no expire 
				    			// > 0 cache valid
				    			if(resp.intValue() == -2){
				    				ExternalReportData aux = builderXmlCdaData(externalReportData,externalReportInfo.getExternalReportType());
				    				String cache = getStringFromBytes(aux.getMessageCdaData());
				    				jedis.set(cacheKey,cache);
				    				Long time = Long.parseLong(expireTime.trim());
									jedis.expire(cacheKey,time.intValue());
									xmlDatas.add(cache);
				    			}else{
				    				xmlDatas.add(jedis.get(cacheKey));
				    			}
							}else{
								xmlDatas.add(getStringFromBytes(externalReportData.getMessageCdaData()));
							}
						}else{
							xmlDatas.add(getStringFromBytes(externalReportData.getMessageCdaData()));
						}
					}
				}
			}
		}
		return xmlDatas;
	}
	/**
	 * 
	 * @param externalReportInfo
	 * @param externalReportData
	 * @return
	 */
	private String buildCacheKey(ExternalReportInfo externalReportInfo, ExternalReportData externalReportData) {
		String key = externalReportInfo.getId() + "-" 
					+ externalReportInfo.getReportId() + "-" 
					+ externalReportData.getId();
		return key;
	}
	/**
	 * 
	 * @param bytes
	 * @return
	 * @throws Exception
	 */
	private String getStringFromBytes(byte[] bytes) throws Exception {
		return new String(bytes,ReportConstant.DEFAULT_ENCODING);
	}
	/**
	 * @param externalReportInfo
	 * @throws Exception
	 */
	private void builderXmlCdaData(ExternalReportInfo externalReportInfo) throws Exception {
		Long id = externalReportInfo.getExternalReportType().getId();
		boolean isImageReport = false;
		boolean generateCda = false;
		if(id == DocumentCdaType.REPORT_IMAGES.getCode().longValue()){
			isImageReport = true;
		}
		for (ExternalReportData externalReportData : externalReportInfo.getExternalReportDatas()) {
			if (externalReportData.getMessageCdaData() == null || externalReportData.getMessageCdaData().length == 0) {
				generateCda = true;
			}
			if (isImageReport || generateCda) {
				// Getting: ReportIntegration
				ReportIntegration reportIntegration = managerDocumentCdaService.builderReportIntegration(externalReportData);
				Assert.notNull(reportIntegration, "The ReportIntegration must not be null");

				// Getting: XML
				String xml = managerDocumentCdaService.builderXmlCdaClinicalDocument(reportIntegration, externalReportInfo.getExternalReportType());
				Assert.notNull(xml, "The xml must not be null");
				LOGGER.info("[ builderXmlCdaData ]" + xml);
				externalReportData.setMessageCdaData(xml.getBytes());
				// Save: ExternalReportData
				managerDocumentCdaService.saveExternalReportCdaData(externalReportData);
			}
		}
	}
	
	/**
	 * @param externalReportInfo
	 * @throws Exception
	 */
	private ExternalReportData builderXmlCdaData(ExternalReportData externalReportData,ExternalReportType externalReportType)
			throws Exception {

		// Getting: ReportIntegration
		ReportIntegration reportIntegration = managerDocumentCdaService.builderReportIntegration(externalReportData);
		Assert.notNull(reportIntegration, "The ReportIntegration must not be null");

		// Getting: XML
		String xml = managerDocumentCdaService.builderXmlCdaClinicalDocument(reportIntegration,externalReportType);
		Assert.notNull(xml, "The xml must not be null");
		LOGGER.info("[ builderXmlCdaData ]" + xml);
		externalReportData.setMessageCdaData(xml.getBytes());
		// Save: ExternalReportData
		managerDocumentCdaService.saveExternalReportCdaData(externalReportData);
		return externalReportData;
	}
	
	
	/**
	 * @param code
	 * @param messageXmlDatas
	 * @return
	 */
	private DocumentCdaCandidates createResponseReport(Integer code, List<String> messageXmlDatas) {
		DocumentCdaCandidates intReportResp = new DocumentCdaCandidates();
		intReportResp.setCode(code.toString());
		intReportResp.setDescription(IntegrationResponseCode.getDescriptionByCode(code));
		intReportResp.setCdaDocuments(messageXmlDatas);		
		return intReportResp;
	}
	/**
	 * @param code
	 * @param messageXmlDatas
	 * @return
	 */
	private DocumentCdaCandidates createResponseReport(Integer code, String link) {
		DocumentCdaCandidates intReportResp = new DocumentCdaCandidates();
		intReportResp.setCode(code.toString());
		intReportResp.setDescription(IntegrationResponseCode.getDescriptionByCode(code));
		intReportResp.setLinkImageStudy(link);
		return intReportResp;
	}
	
	/**
	 * @param documentCdaInformation
	 * @return
	 */
	private Integer validateInformation(DocumentCdaInformation documentCdaInformation) {			
		Integer response = IntegrationResponseCode.SUCCESS.getCode();		
		boolean valid = false;
		if (documentCdaInformation.getEpisodeNumber() != null && !documentCdaInformation.getEpisodeNumber().isEmpty()) {
			valid = true;
		}	
		if (documentCdaInformation.getNhc() != null && !documentCdaInformation.getNhc().isEmpty()) {
			valid = true;
		}
		if (documentCdaInformation.getDocumentId() != null && !documentCdaInformation.getDocumentId().isEmpty()) {
			valid = true;
		}
		if (documentCdaInformation.getDocumentName() != null && !documentCdaInformation.getDocumentName().isEmpty()) {
			valid = true;
		}
		if(!valid){
			response = IntegrationResponseCode.INCOMPLETE_DATA.getCode();
		}
		return response;
	}

	@Override
	public DocumentCdaCandidates getLinkImageStudy(String studyNumber) {
		String link = "";
		Integer response = 0;
		String error = "";
		try {
			link = carestreamTokenRestService.getLinkPacks(studyNumber);
		} catch (UnsupportedEncodingException e) {
			response = IntegrationResponseCode.DATA_NOT_FOUND.getCode();
			error = "[ Codificacion no soportada. doPostCall() ] " + e.getMessage();
			LOGGER.error(error);
		} catch (ConnectTimeoutException e) {
			response = IntegrationResponseCode.DATA_NOT_FOUND.getCode();
			LOGGER.error("[ No se obtuvo respuesta desde el servidor. ] " + e.getMessage());
			error = "[ No se obtuvo respuesta desde el servidor. ]" + e.getMessage();
		} catch (IOException e) {
			response = IntegrationResponseCode.DATA_NOT_FOUND.getCode();
			error = "[ No se obtuvo respuesta desde el servidor. ] " + e.getMessage();
			LOGGER.error(error);
		} 
		return createResponseReport(response, link != null && !link.equals("")? link:error);
	}
}
