package org.fleni.cda.common.generic.model.service;

import org.fleni.cda.common.generic.model.dao.IGenericDao;

public interface IGenericService<T> extends IGenericDao<T> {

	/**
	 * @return
	 */
	IGenericDao<T> getDao();
	
    /**
     * @param dao
     */
    void setDao(IGenericDao<T> dao);
}