package org.fleni.cda.externalreport.model.service;

import org.fleni.cda.common.generic.model.dao.IGenericDao;
import org.fleni.cda.common.generic.model.service.AbstractGenericService;
import org.fleni.cda.externalreport.model.dao.ICdaErrorBackupDao;
import org.fleni.cda.externalreport.model.entity.CdaErrorBackup;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("cdaErrorBackupService")
public class CdaErrorBackupService extends AbstractGenericService<CdaErrorBackup> implements ICdaErrorBackupService {
	
	@Autowired
	private ICdaErrorBackupDao cdaErrorBackupDao;
	
	@Override
	public IGenericDao<CdaErrorBackup> getDao() {
		// TODO Auto-generated method stub
		return cdaErrorBackupDao;
	}

	@Override
	public void setDao(IGenericDao<CdaErrorBackup> dao) {
		// TODO Auto-generated method stub
		cdaErrorBackupDao = (ICdaErrorBackupDao) dao;
	}
	/**
	 * 
	 */
	@Override
	public CdaErrorBackup createOrUpdate(CdaErrorBackup cdaErrorBackup) {
		// TODO Auto-generated method stub
		if (cdaErrorBackup.getId() == null) {
			return cdaErrorBackupDao.persist(cdaErrorBackup);
		} else {
			return cdaErrorBackupDao.merge(cdaErrorBackup);
		}		
	}

}
