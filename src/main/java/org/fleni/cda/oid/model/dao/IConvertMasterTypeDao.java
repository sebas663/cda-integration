package org.fleni.cda.oid.model.dao;

import java.util.List;

import org.fleni.cda.common.generic.model.dao.IGenericDao;
import org.fleni.cda.oid.model.entity.ConvertMasterType;

public interface IConvertMasterTypeDao extends IGenericDao<ConvertMasterType> {
	
	/**
	 * @param masterTypeExample
	 * @return
	 * @throws Exception
	 */
	ConvertMasterType getConvertMasterTypeByExample(ConvertMasterType masterTypeExample) throws Exception; 
	/**
	 * @param masterTypeExample
	 * @return
	 * @throws Exception
	 */
	ConvertMasterType getConvertMasterTypeByExampleDB(ConvertMasterType masterTypeExample) throws Exception; 
	/**
	 * @return
	 * @throws Exception
	 */
	List<ConvertMasterType> getAllConvertMasterType() throws Exception; 
}
