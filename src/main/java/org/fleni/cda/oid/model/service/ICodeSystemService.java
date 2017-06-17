package org.fleni.cda.oid.model.service;

import org.fleni.cda.common.generic.model.service.IGenericService;
import org.fleni.cda.oid.model.dao.ICodeSystemDao;
import org.fleni.cda.oid.model.entity.CodeSystem;

public interface ICodeSystemService extends IGenericService<CodeSystem>, ICodeSystemDao {}
