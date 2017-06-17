package org.fleni.cda.common.generic.model.dao;

public interface IGenericDao<T> {

	/**
	 * @param primaryKey
	 * @return
	 */
	T find(Object primaryKey);

	/**
	 * @param entity
	 * @return
	 */
	T persist(T entity);

	/**
	 * @param entity
	 * @return
	 */
	T merge(T entity);

	/**
	 * @param entity
	 */
	void remove(T entity);

}
