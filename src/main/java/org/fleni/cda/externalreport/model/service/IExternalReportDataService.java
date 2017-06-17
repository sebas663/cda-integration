package org.fleni.cda.externalreport.model.service;

import org.fleni.cda.common.generic.model.service.IGenericService;
import org.fleni.cda.externalreport.model.dao.IExternalReportDataDao;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;

public interface IExternalReportDataService extends IGenericService<ExternalReportData>, IExternalReportDataDao {
	
	/**
	 * @param externalReportData
	 * @return
	 */
	ExternalReportData createOrUpdate(ExternalReportData externalReportData);
	/**
	 * @param externalReportData
	 * @return
	 */
	void createOrUpdateNative(ExternalReportData externalReportData);
}
