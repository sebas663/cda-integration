package org.fleni.cda.process.manager.service;

import java.util.List;

import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;
import org.fleni.cda.externalreport.model.entity.ExternalReportType;
import org.fleni.cda.json.mapper.report.ReportIntegration;

public interface IManagerDocumentCdaService {

	/**
	 * @return
	 */
	List<ExternalReportInfo> findAllExternalReportWithoutCdaData();

	/**
	 * @param externalReportInfo
	 */
	void saveExternalReportCdaInfo(ExternalReportInfo externalReportInfo);
	
	/**
	 * @param externalReportData
	 */
	void saveExternalReportCdaData(ExternalReportData externalReportData);

	/**
	 * @param externalReportData
	 * @return
	 */
	ReportIntegration builderReportIntegration(ExternalReportData externalReportData) throws Exception;

	/**
	 * @param reportIntegration
	 * @param externalReportType
	 * @return
	 * @throws Exception
	 */
	String builderXmlCdaClinicalDocument(ReportIntegration reportIntegration, ExternalReportType externalReportType) throws Exception;
	/**
	 * 
	 * @param xml
	 * @return
	 * @throws Exception
	 */
	Object builderObjectFromXML(String xml) throws Exception;

}