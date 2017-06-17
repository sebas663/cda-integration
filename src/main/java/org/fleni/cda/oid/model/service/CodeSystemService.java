package org.fleni.cda.oid.model.service;

import java.util.List;

import org.fleni.cda.common.generic.model.dao.IGenericDao;
import org.fleni.cda.common.generic.model.service.AbstractGenericService;
import org.fleni.cda.oid.model.dao.ICodeSystemDao;
import org.fleni.cda.oid.model.entity.CodeSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("codeSystemService")
public class CodeSystemService extends AbstractGenericService<CodeSystem> implements ICodeSystemService {
	
	@Autowired
	private ICodeSystemDao codeSystemDao;
	
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.service.IGenericService#getDao()
	 */
	@Override
	public IGenericDao<CodeSystem> getDao() {
		// TODO Auto-generated method stub
		return codeSystemDao;
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.service.IGenericService#setDao(org.fleni.cda.common.generic.model.dao.IGenericDao)
	 */
	@Override
	public void setDao(IGenericDao<CodeSystem> dao) {
		codeSystemDao = (ICodeSystemDao) dao;
	}

	@Override
	public List<CodeSystem> getAllConvertMasterType() throws Exception {
		// TODO Auto-generated method stub
		return codeSystemDao.getAllConvertMasterType();
	}

}
