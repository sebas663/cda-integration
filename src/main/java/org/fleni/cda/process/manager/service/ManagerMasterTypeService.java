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
import org.fleni.cda.oid.model.service.IConvertMasterTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("managerMasterTypeService")
public class ManagerMasterTypeService implements IManagerMasterTypeService {

	@Autowired
	private IConvertMasterTypeService convertMasterTypeService;

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findSexType(java.lang.String, java.lang.String)
	 */
	@Override
	public SexType findSexType(String code, String system) throws Exception {
		SexType example = new SexType();
		example.setTypeMasterSystemExternal(code);
		example.setNameSystemExternal(system);
		return (SexType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findDocumentTemplateType(java.lang.String, java.lang.String)
	 */
	@Override
	public DocumentTemplateType findDocumentTemplateType(String code, String system) throws Exception {
		DocumentTemplateType example = new DocumentTemplateType();
		example.setTypeMasterSystemExternal(code);
		example.setNameSystemExternal(system);
		return (DocumentTemplateType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findProvidersType(java.lang.String, java.lang.String)
	 */
	@Override
	public ProvidersType findProvidersType(String code, String system) throws Exception {
		ProvidersType example = new ProvidersType();
		example.setTypeMasterSystemExternal(code);
		example.setNameSystemExternal(system);
		return (ProvidersType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findDocumentIdentityType(java.lang.String, java.lang.String)
	 */
	@Override
	public DocumentIdentityType findDocumentIdentityType(String code, String system) throws Exception {
		DocumentIdentityType example = new DocumentIdentityType();
		example.setTypeMasterSystemExternal(code);
		example.setNameSystemExternal(system);
		return (DocumentIdentityType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findConfidentialityType(java.lang.String, java.lang.String)
	 */
	@Override
	public ConfidentialityType findConfidentialityType(String code, String system) throws Exception {
		ConfidentialityType example = new ConfidentialityType();
		example.setTypeMasterSystemExternal(code);
		example.setNameSystemExternal(system);
		return (ConfidentialityType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findSectionTemplateType(java.lang.String, java.lang.String)
	 */
	@Override
	public SectionTemplateType findSectionTemplateType(String code, String system) throws Exception {
		SectionTemplateType example = new SectionTemplateType();
		example.setTypeMasterSystemExternal(code);
		example.setNameSystemExternal(system);
		return (SectionTemplateType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findMedicalMatriculationType(java.lang.String, java.lang.String)
	 */
	@Override
	public MedicalMatriculationType findMedicalMatriculationType(String code, String system) throws Exception {
		MedicalMatriculationType example = new MedicalMatriculationType();
		example.setTypeMasterSystemExternal(code);
		example.setNameSystemExternal(system);
		return (MedicalMatriculationType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findEpisodeScopeType(java.lang.String, java.lang.String)
	 */
	@Override
	public EpisodeScopeType findEpisodeScopeType(String code, String system) throws Exception {
		EpisodeScopeType example = new EpisodeScopeType();
		example.setTypeMasterSystemExternal(code);
		example.setNameSystemExternal(system);
		return (EpisodeScopeType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findEpisodeType(java.lang.String, java.lang.String)
	 */
	@Override
	public EpisodeType findEpisodeType(String code, String system) throws Exception {
		EpisodeType example = new EpisodeType();
		example.setTypeMasterSystemExternal(code);
		example.setNameSystemExternal(system);
		return (EpisodeType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}
	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findEpisodeType(java.lang.String, java.lang.String)
	 */
	@Override
	public EpisodeType findEpisodeType(CodeSystem codeSystem, String system) throws Exception {
		EpisodeType example = new EpisodeType();
		example.setCodeSystem(codeSystem);
		example.setNameSystemExternal(system);
		return (EpisodeType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findIdentifierDocumentType(java.lang.String, java.lang.String)
	 */
	@Override
	public IdentifierDocumentType findIdentifierDocumentType(String code, String system) throws Exception {
		IdentifierDocumentType example = new IdentifierDocumentType();
		example.setTypeMasterSystemExternal(code);
		example.setNameSystemExternal(system);
		return (IdentifierDocumentType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}
	
	/* (non-Javadoc)
	 * @see org.fleni.cda.process.manager.service.IManagerMasterTypeService#findDocumentClassType(java.lang.String, java.lang.String)
	 */
	@Override
	public DocumentClassType findDocumentClassType(String code, String system) throws Exception {
		DocumentClassType example = new DocumentClassType();
		example.setTypeMasterSystemExternal(code);
		example.setNameSystemExternal(system);
		return (DocumentClassType) convertMasterTypeService.getConvertMasterTypeByExample(example);
	}

}
