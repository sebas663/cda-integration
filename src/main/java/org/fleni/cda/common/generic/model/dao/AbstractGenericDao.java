package org.fleni.cda.common.generic.model.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
public abstract class AbstractGenericDao<T> extends AbstractDaoSupport implements IGenericDao<T> {
	
	private Class<T> entityClass;
		
	/**
	 * @param entityClass
	 */
	public AbstractGenericDao(Class<T> entityClass) {
		// TODO Auto-generated constructor stub
		this.entityClass = entityClass;
	}

	/* (non-Javadoc)
	 * @see org.fleni.exploit.clinicalreport.dao.generic.IGenericDao#find(java.lang.Object)
	 */	
	@Transactional(readOnly = true)
	@Override	
	public T find(Object primaryKey) {
		// TODO Auto-generated method stub
		return (T) getEntityManager().find(entityClass, primaryKey);
	}

	/* (non-Javadoc)
	 * @see org.fleni.exploit.clinicalreport.dao.generic.IGenericDao#persist(java.lang.Object)
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public T persist(T entity) {
		// TODO Auto-generated method stub
		getEntityManager().persist(entity);
		return entity;
	}

	/* (non-Javadoc)
	 * @see org.fleni.exploit.clinicalreport.dao.generic.IGenericDao#merge(java.lang.Object)
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public T merge(T entity) {
		// TODO Auto-generated method stub
		return getEntityManager().merge(entity);
	}

	/* (non-Javadoc)
	 * @see org.fleni.exploit.clinicalreport.dao.generic.IGenericDao#remove(java.lang.Object)
	 */
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	@Override
	public void remove(T entity) {
		// TODO Auto-generated method stub
		getEntityManager().remove(entity);		
	}	
}
