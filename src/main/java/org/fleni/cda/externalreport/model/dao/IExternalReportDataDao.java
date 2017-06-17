package org.fleni.cda.externalreport.model.dao;

import org.fleni.cda.common.generic.model.dao.IGenericDao;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;

public interface IExternalReportDataDao extends IGenericDao<ExternalReportData> {

	void insertNative(ExternalReportData externalReportData);

	void mergeNative(byte[] messageCdaData, Long key);
}
