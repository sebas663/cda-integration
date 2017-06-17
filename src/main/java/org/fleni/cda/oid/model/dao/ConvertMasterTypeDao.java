package org.fleni.cda.oid.model.dao;

import java.util.List;

import org.fleni.cda.common.generic.model.dao.AbstractGenericDao;
import org.fleni.cda.common.utils.ParametricData;
import org.fleni.cda.oid.model.entity.ConvertMasterType;
import org.fleni.cda.oid.model.entity.QConvertMasterType;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mysema.query.jpa.impl.JPAQuery;

@Repository("convertMasterTypeDao")
public class ConvertMasterTypeDao extends AbstractGenericDao<ConvertMasterType> implements IConvertMasterTypeDao {

	/**
	 * @param entityClass
	 */
	public ConvertMasterTypeDao() {
		// TODO Auto-generated constructor stub
		super(ConvertMasterType.class);		
	}
	
	/* (non-Javadoc)
	 * @see org.fleni.cda.oid.model.dao.IConvertMasterTypeDao#getConvertMasterTypeByExample(org.fleni.cda.oid.model.entity.ConvertMasterType)
	 */
	@Transactional(readOnly = true)
	@Override
	public ConvertMasterType getConvertMasterTypeByExampleDB(ConvertMasterType masterTypeExample) throws Exception {
		// TODO Auto-generated method stub
		JPAQuery jpaQuery = new JPAQuery(this.getEntityManager());
		QConvertMasterType convertMasterType = QConvertMasterType.convertMasterType;

		jpaQuery.from(convertMasterType);
		if(masterTypeExample.getNameSystemExternal() != null && !masterTypeExample.getNameSystemExternal().equals(""))
			jpaQuery.where(convertMasterType.nameSystemExternal.eq(masterTypeExample.getNameSystemExternal()));
		if(masterTypeExample.getTypeMasterSystemExternal() != null && !masterTypeExample.getTypeMasterSystemExternal().equals(""))
			jpaQuery.where(convertMasterType.typeMasterSystemExternal.eq(masterTypeExample.getTypeMasterSystemExternal()));
		if(masterTypeExample.getDiscriminator() != null && !masterTypeExample.getDiscriminator().equals(""))
			jpaQuery.where(convertMasterType.discriminator.eq(masterTypeExample.getDiscriminator()));

		return jpaQuery.uniqueResult(convertMasterType);
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.fleni.cda.oid.model.dao.IConvertMasterTypeDao#
	 * getConvertMasterTypeByExampleDB(org.fleni.cda.oid.model.entity.
	 * ConvertMasterType)
	 */
	@Override
	public ConvertMasterType getConvertMasterTypeByExample(ConvertMasterType m) throws Exception {
		String key = m.getDiscriminator() + "-" + m.getNameSystemExternal() + "-" + m.getTypeMasterSystemExternal();
		ConvertMasterType c = ParametricData.MAP_CONVERT_MASTER_TYPE.get(key);
		return c;
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.oid.model.dao.IConvertMasterTypeDao#getAllConvertMasterType()
	 */
	@Transactional(readOnly = true)
	@Override
	public List<ConvertMasterType> getAllConvertMasterType() throws Exception {
		JPAQuery jpaQuery = new JPAQuery(this.getEntityManager());
		QConvertMasterType convertMasterType = QConvertMasterType.convertMasterType;
		jpaQuery.from(convertMasterType);
		return (List<ConvertMasterType>) jpaQuery.list(convertMasterType);
	}
}
