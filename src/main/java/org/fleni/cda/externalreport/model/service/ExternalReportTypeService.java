package org.fleni.cda.externalreport.model.service;

import java.util.List;

import org.fleni.cda.common.generic.model.dao.IGenericDao;
import org.fleni.cda.common.generic.model.service.AbstractGenericService;
import org.fleni.cda.externalreport.model.dao.IExternalReportTypeDao;
import org.fleni.cda.externalreport.model.entity.ExternalReportType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("externalReportTypeService")
public class ExternalReportTypeService extends AbstractGenericService<ExternalReportType> implements IExternalReportTypeService {

	@Autowired
	private IExternalReportTypeDao externalReportTypeDao;

	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.service.IGenericService#getDao()
	 */
	@Override
	public IGenericDao<ExternalReportType> getDao() {
		// TODO Auto-generated method stub
		return externalReportTypeDao;
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.service.IGenericService#setDao(org.fleni.cda.common.generic.model.dao.IGenericDao)
	 */
	@Override
	public void setDao(IGenericDao<ExternalReportType> dao) {
		// TODO Auto-generated method stub
		externalReportTypeDao = (IExternalReportTypeDao) dao;
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportTypeDao#executeQuery(java.lang.String)
	 */
	@Override
	public List<ExternalReportType> executeQuery(String namedQuery) {
		// TODO Auto-generated method stub
		return externalReportTypeDao.executeQuery(namedQuery);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportTypeDao#findExternalReportTypeByName(java.lang.String)
	 */
	@Override
	public ExternalReportType findExternalReportTypeByName(String reportName) {
		// TODO Auto-generated method stub
		return externalReportTypeDao.findExternalReportTypeByName(reportName);
	}

	@Override
	public ExternalReportType findExternalReportTypeByNameDB(String reportName) {
		// TODO Auto-generated method stub
		return externalReportTypeDao.findExternalReportTypeByNameDB(reportName);
	}

	@Override
	public List<ExternalReportType> getAllExternalReportType() throws Exception {
		// TODO Auto-generated method stub
		return externalReportTypeDao.getAllExternalReportType();
	}		
}
	