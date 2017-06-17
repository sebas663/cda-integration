package org.fleni.cda.common.generic.model.service;

public abstract class AbstractGenericService<T> implements IGenericService<T> {

	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.dao.IGenericDao#find(java.lang.Object)
	 */
	@Override
	public T find(Object primaryKey) {
		// TODO Auto-generated method stub
		return getDao().find(primaryKey);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.dao.IGenericDao#persist(java.lang.Object)
	 */
	@Override
	public T persist(T entity) {
		// TODO Auto-generated method stub
		return getDao().persist(entity);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.dao.IGenericDao#merge(java.lang.Object)
	 */
	@Override
	public T merge(T entity) {
		// TODO Auto-generated method stub
		return getDao().merge(entity);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.dao.IGenericDao#remove(java.lang.Object)
	 */
	@Override
	public void remove(T entity) {
		// TODO Auto-generated method stub
		getDao().remove(entity);
	}
}
