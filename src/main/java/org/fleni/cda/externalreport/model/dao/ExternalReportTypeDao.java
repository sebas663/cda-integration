package org.fleni.cda.externalreport.model.dao;

import java.util.List;

import javax.persistence.Query;

import org.fleni.cda.common.generic.model.dao.AbstractGenericDao;
import org.fleni.cda.common.utils.ParametricData;
import org.fleni.cda.externalreport.model.entity.ExternalReportType;
import org.fleni.cda.externalreport.model.entity.QExternalReportType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mysema.query.jpa.impl.JPAQuery;

@Repository("externalReportTypeDao")
public class ExternalReportTypeDao extends AbstractGenericDao<ExternalReportType> implements IExternalReportTypeDao {

	/**
	 * 
	 */
	public ExternalReportTypeDao() {
		// TODO Auto-generated constructor stub
		super(ExternalReportType.class);		
	}
	
	/* (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportTypeDao#executeQuery(java.lang.String)
	 */
	@Transactional(readOnly = true)
	@SuppressWarnings("unchecked")
	@Override
	public List<ExternalReportType> executeQuery(String namedQuery) {
		// TODO Auto-generated method stub
		Query query = getEntityManager().createNamedQuery(namedQuery);
		return (List<ExternalReportType>) query.getResultList();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportTypeDao#findExternalReportTypeByName(java.lang.String)
	 */
	@Override
	public ExternalReportType findExternalReportTypeByName(String reportName) {
		ExternalReportType c = ParametricData.MAP_EXTERNAL_REPORT_TYPE.get(reportName);
		return c;
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportTypeDao#findExternalReportTypeByNameDB(java.lang.String)
	 */
	@Transactional(readOnly = true)
	@Override
	public ExternalReportType findExternalReportTypeByNameDB(String reportName) {
		// TODO Auto-generated method stub
		JPAQuery query = new JPAQuery(getEntityManager());
		QExternalReportType externalReportType = QExternalReportType.externalReportType;
		
		query.from(externalReportType);
		query.where(externalReportType.externalReportName.eq(reportName));
		
		return query.uniqueResult(externalReportType);
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportTypeDao#getAllExternalReportType()
	 */
	@Transactional(readOnly = true)
	@Override
	public List<ExternalReportType> getAllExternalReportType() throws Exception {
		JPAQuery query = new JPAQuery(getEntityManager());
		QExternalReportType externalReportType = QExternalReportType.externalReportType;

		query.from(externalReportType);
		return (List<ExternalReportType>) query.list(externalReportType);
	}
}
