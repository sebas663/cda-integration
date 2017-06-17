package org.fleni.cda.externalreport.model.dao;

import org.fleni.cda.common.generic.model.dao.AbstractGenericDao;
import org.fleni.cda.externalreport.model.entity.CdaErrorBackup;
import org.springframework.stereotype.Repository;

@Repository("cdaErrorBackupDao")
public class CdaErrorBackupDao extends AbstractGenericDao<CdaErrorBackup> implements ICdaErrorBackupDao {

	public CdaErrorBackupDao(Class<CdaErrorBackup> entityClass) {
		super(entityClass);
	}
	public CdaErrorBackupDao() {
		super(CdaErrorBackup.class);
	}
}
