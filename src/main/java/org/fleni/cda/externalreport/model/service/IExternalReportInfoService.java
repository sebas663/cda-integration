package org.fleni.cda.externalreport.model.service;

import java.util.List;

import org.fleni.cda.common.generic.model.service.IGenericService;
import org.fleni.cda.externalreport.model.dao.IExternalReportInfoDao;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;

public interface IExternalReportInfoService extends IGenericService<ExternalReportInfo>, IExternalReportInfoDao {
	
	/**
	 * @param externalReportInfo
	 * @return
	 */
	ExternalReportInfo createOrUpdate(ExternalReportInfo externalReportInfo);	
	
	/**
	 * @param externalReportInfo
	 * @return
	 * @throws Exception
	 */
	List<String> findDocumentXmlCdaData(ExternalReportInfo externalReportInfo) throws Exception;
	/**
	 * @param externalReportData
	 * @return
	 */
	void createOrUpdateNative(ExternalReportInfo externalReportInfo);
}
