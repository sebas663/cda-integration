package org.fleni.cda.externalreport.model.service;

import org.fleni.cda.common.generic.model.dao.IGenericDao;
import org.fleni.cda.common.generic.model.service.AbstractGenericService;
import org.fleni.cda.externalreport.model.dao.IExternalReportDataDao;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("externalReportDataService")
public class ExternalReportDataService extends AbstractGenericService<ExternalReportData> implements IExternalReportDataService {

	@Autowired
	private IExternalReportDataDao externalReportDataDao;

	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.service.IGenericService#getDao()
	 */
	@Override
	public IGenericDao<ExternalReportData> getDao() {
		// TODO Auto-generated method stub
		return externalReportDataDao;
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.service.IGenericService#setDao(org.fleni.cda.common.generic.model.dao.IGenericDao)
	 */
	@Override
	public void setDao(IGenericDao<ExternalReportData> dao) {
		// TODO Auto-generated method stub
		externalReportDataDao = (IExternalReportDataDao) dao;
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.service.IExternalReportDataService#createOrUpdate(org.fleni.cda.externalreport.model.entity.ExternalReportData)
	 */
	@Override
	public ExternalReportData createOrUpdate(ExternalReportData externalReportData) {
		// TODO Auto-generated method stub
		if (externalReportData.getId() == null) {
			return externalReportDataDao.persist(externalReportData);
		} else {
			return externalReportDataDao.merge(externalReportData);
		}
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.service.IExternalReportDataService#createOrUpdateNative(org.fleni.cda.externalreport.model.entity.ExternalReportData)
	 */
	@Override
	public void createOrUpdateNative(ExternalReportData externalReportData) {
		if (externalReportData.getId() == null) {
			this.insertNative(externalReportData);
		} else {
			this.mergeNative(externalReportData.getMessageCdaData(), externalReportData.getId());
		}
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportDataDao#insertNative(org.fleni.cda.externalreport.model.entity.ExternalReportData)
	 */
	@Override
	public void insertNative(ExternalReportData externalReportData) {
		externalReportDataDao.insertNative(externalReportData);
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportDataDao#persistNative(byte[], java.lang.Long)
	 */
	@Override
	public void mergeNative(byte[] messageCdaData, Long key) {
		externalReportDataDao.mergeNative(messageCdaData,key);
	}			
}
	