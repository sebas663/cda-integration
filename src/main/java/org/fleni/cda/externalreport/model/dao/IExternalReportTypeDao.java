package org.fleni.cda.externalreport.model.dao;

import java.util.List;

import org.fleni.cda.common.generic.model.dao.IGenericDao;
import org.fleni.cda.externalreport.model.entity.ExternalReportType;

public interface IExternalReportTypeDao extends IGenericDao<ExternalReportType> {
	
	/**
	 * @param namedQuery
	 * @return
	 */
	List<ExternalReportType> executeQuery(String namedQuery);
	
	/**
	 * @param reportName
	 * @return
	 */
	ExternalReportType findExternalReportTypeByName(String reportName);
	/**
	 * @param reportName
	 * @return
	 */
	ExternalReportType findExternalReportTypeByNameDB(String reportName);
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	List<ExternalReportType> getAllExternalReportType() throws Exception;
}
