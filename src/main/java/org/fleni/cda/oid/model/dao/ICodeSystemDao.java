package org.fleni.cda.oid.model.dao;

import java.util.List;

import org.fleni.cda.common.generic.model.dao.IGenericDao;
import org.fleni.cda.oid.model.entity.CodeSystem;

public interface ICodeSystemDao extends IGenericDao<CodeSystem> {
	/**
	 * @return
	 * @throws Exception
	 */
	List<CodeSystem> getAllConvertMasterType() throws Exception; 
}
