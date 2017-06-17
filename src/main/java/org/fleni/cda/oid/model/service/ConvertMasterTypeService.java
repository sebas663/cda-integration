package org.fleni.cda.oid.model.service;

import java.util.List;

import org.fleni.cda.common.generic.model.dao.IGenericDao;
import org.fleni.cda.common.generic.model.service.AbstractGenericService;
import org.fleni.cda.oid.model.dao.IConvertMasterTypeDao;
import org.fleni.cda.oid.model.entity.ConvertMasterType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("convertMasterTypeService")
public class ConvertMasterTypeService extends AbstractGenericService<ConvertMasterType> implements IConvertMasterTypeService {

	@Autowired
	private IConvertMasterTypeDao convertMasterTypeDao;

	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.service.IGenericService#getDao()
	 */
	@Override
	public IGenericDao<ConvertMasterType> getDao() {
		// TODO Auto-generated method stub
		return convertMasterTypeDao;
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.service.IGenericService#setDao(org.fleni.cda.common.generic.model.dao.IGenericDao)
	 */
	@Override
	public void setDao(IGenericDao<ConvertMasterType> dao) {
		// TODO Auto-generated method stub
		convertMasterTypeDao = (IConvertMasterTypeDao) dao;
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.oid.model.dao.IConvertMasterTypeDao#getConvertMasterTypeByExample(org.fleni.cda.oid.model.entity.ConvertMasterType)
	 */
	@Override
	public ConvertMasterType getConvertMasterTypeByExample(ConvertMasterType masterTypeExample) throws Exception {
		// TODO Auto-generated method stub
		return convertMasterTypeDao.getConvertMasterTypeByExample(masterTypeExample);
	}
	/* (non-Javadoc)
	 * @see org.fleni.cda.oid.model.dao.IConvertMasterTypeDao#getConvertMasterTypeByExample(org.fleni.cda.oid.model.entity.ConvertMasterType)
	 */
	@Override
	public ConvertMasterType getConvertMasterTypeByExampleDB(ConvertMasterType masterTypeExample) throws Exception {
		// TODO Auto-generated method stub
		return convertMasterTypeDao.getConvertMasterTypeByExampleDB(masterTypeExample);
	}

	@Override
	public List<ConvertMasterType> getAllConvertMasterType() throws Exception {
		// TODO Auto-generated method stub
		return convertMasterTypeDao.getAllConvertMasterType();
	}	
}
	