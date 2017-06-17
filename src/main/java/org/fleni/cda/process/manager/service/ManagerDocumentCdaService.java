package org.fleni.cda.process.manager.service;

import java.io.StringReader;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import org.fleni.cda.common.xml.ReportConstant;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;
import org.fleni.cda.externalreport.model.entity.ExternalReportType;
import org.fleni.cda.externalreport.model.service.IExternalReportDataService;
import org.fleni.cda.externalreport.model.service.IExternalReportInfoService;
import org.fleni.cda.json.common.ReportBuilderJson;
import org.fleni.cda.json.mapper.report.ReportIntegration;
import org.fleni.cda.xml.mapper.factory.IClinicalDocumentFactory;
import org.fleni.cda.xml.mapper.report.DNLabReportResumido;
import org.fleni.cda.xml.mapper.report.Laboratory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("managerDocumentCdaService")
public class ManagerDocumentCdaService implements IManagerDocumentCdaService {

	@Autowired
	private IExternalReportInfoService externalReportInfoService;
	
	@Autowired
	private IExternalReportDataService externalReportDataService;

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerDocumentCdaService#findAllExternalReportWithoutCdaData()
	 */
	@Override
	public List<ExternalReportInfo> findAllExternalReportWithoutCdaData() {
		return externalReportInfoService.findAllExternalReportInfoByCdaDataNull();
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerDocumentCdaService#saveExternalReportCdaInfo(org.fleni.cda.externalreport.model.entity.ExternalReportInfo)
	 */
	@Override
	public void saveExternalReportCdaInfo(ExternalReportInfo externalReportInfo) {
//		externalReportInfoService.createOrUpdate(externalReportInfo);
		externalReportInfoService.createOrUpdateNative(externalReportInfo);
	}
	
	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerDocumentCdaService#saveExternalReportCdaData(org.fleni.cda.externalreport.model.entity.ExternalReportData)
	 */
	@Override
	public void saveExternalReportCdaData(ExternalReportData externalReportData) {
//		externalReportDataService.createOrUpdate(externalReportData);
		externalReportDataService.createOrUpdateNative(externalReportData);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerDocumentCdaService#builderReportIntegration(org.fleni.cda.externalreport.model.entity.ExternalReportData)
	 */
	@Override
	public ReportIntegration builderReportIntegration(ExternalReportData externalReportData) throws Exception {
		return (ReportIntegration) ReportBuilderJson.convertJsonToObject(new String(externalReportData.getMessageJsonData(), ReportConstant.DEFAULT_ENCODING),  ReportIntegration.class);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerDocumentCdaService#builderXmlCdaClinicalDocument(org.fleni.cda.json.mapper.report.ReportIntegration, org.fleni.cda.externalreport.model.entity.ExternalReportType)
	 */
	@Override
	public String builderXmlCdaClinicalDocument(ReportIntegration reportIntegration, ExternalReportType externalReportType) throws Exception {
		Class<?> classFactory = Class.forName(externalReportType.getExternalReportClassFactory());
		IClinicalDocumentFactory clinicalDocumentFactory = (IClinicalDocumentFactory) classFactory.newInstance();
		return clinicalDocumentFactory.buildXmlCdaClinicalDocument(reportIntegration);
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerDocumentCdaService#builderObjectFromXML(java.lang.String)
	 */
	@Override
	public Object builderObjectFromXML(String xml) throws Exception {
		JAXBContext jaxbContext;
		Object obj = null;
		StringReader reader = null;
		Unmarshaller jaxbUnmarshaller = null;
		String d = "<ClinicalDocument xmlns='urn:hl7-org:v3' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'  xmlns:mif='urn:hl7-org:v3/mif' xsi:schemaLocation='urn:hl7-org:v3 CDA.xsd'>";
		xml = xml.replace(d, "<ClinicalDocument>");
		try {
			reader = new StringReader(xml);
			jaxbContext = JAXBContext.newInstance(Laboratory.class);
//			jaxbContext = JAXBContext.newInstance(DNLabReport.class);
			jaxbContext = JAXBContext.newInstance(DNLabReportResumido.class);
			jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//			jaxbUnmarshaller.setEventHandler(new CustomValidationEventHandler());
//			jaxbUnmarshaller.setProperty(Marshaller.JAXB_SCHEMA_LOCATION, "");
			obj = (Object) jaxbUnmarshaller.unmarshal(reader);
		} catch (JAXBException e) {
			throw new Exception(e.getMessage());
		}
		return obj;
	}

}
