package org.fleni.cda.oid.model.dao;

import java.util.List;

import org.fleni.cda.common.generic.model.dao.AbstractGenericDao;
import org.fleni.cda.oid.model.entity.CodeSystem;
import org.fleni.cda.oid.model.entity.QCodeSystem;
import org.springframework.stereotype.Repository;

import com.mysema.query.jpa.impl.JPAQuery;
@Repository("codeSystemDao")
public class CodeSystemDao extends AbstractGenericDao<CodeSystem> implements ICodeSystemDao {
	/**
	 * @param entityClass
	 */
	public CodeSystemDao() {
		// TODO Auto-generated constructor stub
		super(CodeSystem.class);		
	}
	/**
	 * 
	 * @param entityClass
	 */
	public CodeSystemDao(Class<CodeSystem> entityClass) {
		super(entityClass);
		// TODO Auto-generated constructor stub
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.oid.model.dao.ICodeSystemDao#getAllConvertMasterType()
	 */
	@Override
	public List<CodeSystem> getAllConvertMasterType() throws Exception {
		JPAQuery jpaQuery = new JPAQuery(this.getEntityManager());
		QCodeSystem codeSystem = QCodeSystem.codeSystem1;
		jpaQuery.from(codeSystem);
		return (List<CodeSystem>) jpaQuery.list(codeSystem);
	}

}
