package org.fleni.cda.externalreport.model.dao;

import java.util.List;

import org.fleni.cda.common.generic.model.dao.IGenericDao;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;

public interface IExternalReportInfoDao extends IGenericDao<ExternalReportInfo> {
	
	/**
	 * @param reportId
	 * @param reportName
	 * @param nhc
	 * @param episodeNumber
	 * @return
	 */
	ExternalReportInfo findExternalReportInfoByParameter(String reportId, String reportName, String nhc, String episodeNumber);/**
	 * @param reportId
	 * @param reportName
	 * @param nhc
	 * @param episodeNumber
	 * @return
	 */
	List<ExternalReportInfo> findListExternalReportInfoByParameter(String reportId, String reportName, String nhc,
			String episodeNumber, String fromDate, String toDate);
	
	/**
	 * @return
	 */
	List<ExternalReportInfo> findAllExternalReportInfoByCdaDataNull();
	/**
	 * 
	 * @param externalReportInfo
	 */
	void insertNative(ExternalReportInfo externalReportInfo);
	/**
	 * 
	 * @param externalReportInfo
	 */
	void mergeNative(ExternalReportInfo externalReportInfo);
	
}
