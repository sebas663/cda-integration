package org.fleni.cda.externalreport.model.service;

import org.fleni.cda.common.generic.model.service.IGenericService;
import org.fleni.cda.externalreport.model.dao.ICdaErrorBackupDao;
import org.fleni.cda.externalreport.model.entity.CdaErrorBackup;

public interface ICdaErrorBackupService extends IGenericService<CdaErrorBackup>, ICdaErrorBackupDao {
	/**
	 * @param externalReportInfo
	 * @return
	 */
	CdaErrorBackup createOrUpdate(CdaErrorBackup cdaErrorBackup);
}
