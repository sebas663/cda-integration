package org.fleni.cda.process.manager.service;

import org.fleni.cda.oid.model.entity.CodeSystem;
import org.fleni.cda.oid.model.entity.ConfidentialityType;
import org.fleni.cda.oid.model.entity.DocumentClassType;
import org.fleni.cda.oid.model.entity.DocumentIdentityType;
import org.fleni.cda.oid.model.entity.DocumentTemplateType;
import org.fleni.cda.oid.model.entity.EpisodeScopeType;
import org.fleni.cda.oid.model.entity.EpisodeType;
import org.fleni.cda.oid.model.entity.IdentifierDocumentType;
import org.fleni.cda.oid.model.entity.MedicalMatriculationType;
import org.fleni.cda.oid.model.entity.ProvidersType;
import org.fleni.cda.oid.model.entity.SectionTemplateType;
import org.fleni.cda.oid.model.entity.SexType;

public interface IManagerMasterTypeService {

	/**
	 * @param code
	 * @param system
	 * @return
	 * @throws Exception
	 */
	SexType findSexType(String code, String system) throws Exception;

	/**
	 * @param code
	 * @param system
	 * @return
	 * @throws Exception
	 */
	DocumentTemplateType findDocumentTemplateType(String code, String system) throws Exception;

	/**
	 * @param code
	 * @param system
	 * @return
	 * @throws Exception
	 */
	ProvidersType findProvidersType(String code, String system) throws Exception;

	/**
	 * @param code
	 * @param system
	 * @return
	 * @throws Exception
	 */
	DocumentIdentityType findDocumentIdentityType(String code, String system) throws Exception;

	/**
	 * @param code
	 * @param system
	 * @return
	 * @throws Exception
	 */
	ConfidentialityType findConfidentialityType(String code, String system) throws Exception;

	/**
	 * @param code
	 * @param system
	 * @return
	 * @throws Exception
	 */
	SectionTemplateType findSectionTemplateType(String code, String system) throws Exception;

	/**
	 * @param code
	 * @param system
	 * @return
	 * @throws Exception
	 */
	MedicalMatriculationType findMedicalMatriculationType(String code, String system) throws Exception;

	/**
	 * @param code
	 * @param system
	 * @return
	 * @throws Exception
	 */
	EpisodeScopeType findEpisodeScopeType(String code, String system) throws Exception;

	/**
	 * @param code
	 * @param system
	 * @return
	 * @throws Exception
	 */
	EpisodeType findEpisodeType(String code, String system) throws Exception;
	/**
	 * 
	 * @param codeSystem
	 * @param system
	 * @return
	 * @throws Exception
	 */
	EpisodeType findEpisodeType(CodeSystem codeSystem, String system) throws Exception;

	/**
	 * @param code
	 * @param system
	 * @return
	 * @throws Exception
	 */
	IdentifierDocumentType findIdentifierDocumentType(String code, String system) throws Exception;
	
	/**
	 * @param code
	 * @param system
	 * @return
	 * @throws Exception
	 */
	DocumentClassType findDocumentClassType(String code, String system) throws Exception;

}