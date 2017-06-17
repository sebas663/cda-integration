package org.fleni.cda.xml.mapper.factory;

import org.fleni.cda.common.utils.ApplicationContextProvider;
import org.fleni.cda.common.xml.DocumentMarshaller;
import org.fleni.cda.common.xml.ReportConstant;
import org.fleni.cda.externalreport.remoting.utils.IdentifierDocumentCdaType;
import org.fleni.cda.json.mapper.report.ReportIntegration;
import org.fleni.cda.json.mapper.report.ReportIntegration.Address;
import org.fleni.cda.json.mapper.report.ReportIntegration.Center;
import org.fleni.cda.oid.model.entity.ConfidentialityType;
import org.fleni.cda.oid.model.entity.DocumentClassType;
import org.fleni.cda.oid.model.entity.DocumentIdentityType;
import org.fleni.cda.oid.model.entity.EpisodeScopeType;
import org.fleni.cda.oid.model.entity.EpisodeType;
import org.fleni.cda.oid.model.entity.IdentifierDocumentType;
import org.fleni.cda.oid.model.entity.MedicalMatriculationType;
import org.fleni.cda.oid.model.entity.ProvidersType;
import org.fleni.cda.oid.model.entity.SectionTemplateType;
import org.fleni.cda.oid.model.entity.SexType;
import org.fleni.cda.process.manager.service.IManagerMasterTypeService;
import org.fleni.cda.xml.mapper.report.ReportDischarge;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

public class ReportDichargeFactory implements IClinicalDocumentFactory {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReportDichargeFactory.class);

	private transient IManagerMasterTypeService managerMasterTypeService = ApplicationContextProvider.getBean(IManagerMasterTypeService.class);

	/* (non-Javadoc)
	 * @see org.fleni.cda.xml.mapper.factory.IClinicalDocumentFactory#buildXmlCdaClinicalDocument(org.fleni.cda.json.mapper.report.ReportIntegration)
	 */
	@Override
	public String buildXmlCdaClinicalDocument(ReportIntegration reportIntegration) {
		// TODO Auto-generated method stub
		String xml = null;
		try {
			ReportDischarge reportDischarge = reportDischargeFactory(reportIntegration);
			xml = DocumentMarshaller.convertToXml(reportDischarge, ReportDischarge.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error(e.getMessage(), e);
		}		
		return xml;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge reportDischargeFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge reportDischarge = new ReportDischarge();

		// Setting: ReportDischarge.title
		reportDischarge.setTitle(ReportConstant.ReportTitle.DISCHARGE);

		// Setting: ReportDischarge.RealmCode
		ReportDischarge.RealmCode realmCode = new ReportDischarge.RealmCode();
		realmCode.setCode(ReportConstant.REALM_CODE);
		reportDischarge.setRealmCode(realmCode);

		// Setting: ReportDischarge.TypeId
		ReportDischarge.TypeId typeId = new ReportDischarge.TypeId();
		typeId.setExtension(ReportConstant.TYPE_EXTENSION);
		typeId.setRoot(ReportConstant.TYPE_ROOT);
		reportDischarge.setTypeId(typeId);

		// Setting: ReportDischarge.TemplateId
		ReportDischarge.TemplateId templateId = new ReportDischarge.TemplateId();
		templateId.setExtension(ReportConstant.ReportTemplate.EXTENSION);
		templateId.setRoot(ReportConstant.ReportTemplate.DISCHARGE);
		reportDischarge.setTemplateId(templateId);

		// Setting: ReportDischarge.Id
		reportDischarge.setId(idFactory(reportIntegration));

		// Setting: ReportDischarge.Code
		reportDischarge.setCode(codeFactory(reportIntegration));

		// Setting: ReportDischarge.EffectiveTime
		ReportDischarge.EffectiveTime effectiveTime = new ReportDischarge.EffectiveTime();
		effectiveTime.setValue(reportIntegration.getDocument().getDateCreate());
		reportDischarge.setEffectiveTime(effectiveTime);

		// Setting: ReportDischarge.ConfidentialityCode
		reportDischarge.setConfidentialityCode(confidentialityCodeFactory(reportIntegration));

		// Setting: ReportDischarge.LanguageCode
		ReportDischarge.LanguageCode languageCode = new ReportDischarge.LanguageCode();
		languageCode.setCode(ReportConstant.LANGUAGE_CODE);
		reportDischarge.setLanguageCode(languageCode);

		// Setting: ReportDischarge.SetId
		reportDischarge.setSetId(setIdFactory(reportIntegration));

		// Setting: ReportDischarge.VersionNumber
		ReportDischarge.VersionNumber versionNumber = new ReportDischarge.VersionNumber();
		versionNumber.setValue(reportIntegration.getDocument().getVersion());
		reportDischarge.setVersionNumber(versionNumber);

		// Setting: ReportDischarge.RecordTarget
		reportDischarge.setRecordTarget(recordTargetFactory(reportIntegration));
		
		// Setting: ReportDischarge.Author
		reportDischarge.setAuthor(authorFactory(reportIntegration));
		
		// Setting: ReportDischarge.Custodian
		reportDischarge.setCustodian(custodianFactory(reportIntegration));
		
		// Setting: ReportDischarge.Participant
		reportDischarge.setParticipant(participantFactory(reportIntegration));
		
		// Setting: ReportDischarge.DocumentationOf
		reportDischarge.setDocumentationOf(documentationOfFactory(reportIntegration));
		
		// Setting: ReportDischarge.ComponentOf
		reportDischarge.setComponentOf(componentOfFactory(reportIntegration));
		
		// Setting: ReportDischarge.Component
		reportDischarge.setComponent(componentsFactory(reportIntegration));

		return reportDischarge;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.SetId setIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.SetId setId = new ReportDischarge.SetId();
		// Getting: IdentifierDocumentType
		IdentifierDocumentType setDocuments = managerMasterTypeService.findIdentifierDocumentType(
				IdentifierDocumentCdaType.SET_DOCUMENTS.getValue(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(setDocuments, "The type " 
				+ IdentifierDocumentCdaType.SET_DOCUMENTS.getValue()
				+ " with IDENTIFIER_DOCUMENT discriminator does not exist in the type master");		
		setId.setExtension(reportIntegration.getDocument().getId());
		setId.setRoot(setDocuments.getObjectIdentifier().getOids());
		return setId;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.ConfidentialityCode confidentialityCodeFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.ConfidentialityCode confidentialityCode = new ReportDischarge.ConfidentialityCode();
		// Getting: ConfidentialityType
		ConfidentialityType confidentialityType = managerMasterTypeService.findConfidentialityType(
				reportIntegration.getDocument().getConfidentialityCode(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(confidentialityType, "The type " 
				+ reportIntegration.getDocument().getConfidentialityCode() 
				+ " with CONFIDENTIALITY_LEVEL discriminator does not exist in the type master");
		confidentialityCode.setCode(confidentialityType.getCodeSystem().getCode());
		confidentialityCode.setCodeSystem(confidentialityType.getCodeSystem().getCodeSystem());
		return confidentialityCode;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.Code codeFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.Code code = new ReportDischarge.Code();
		// Getting: DocumentClassType
		DocumentClassType documentClassType = managerMasterTypeService.findDocumentClassType(
				reportIntegration.getDocument().getType(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(documentClassType, "The type " 
				+ reportIntegration.getDocument().getType() 
				+ " with DOCUMENT_CLASS discriminator does not exist in the type master");
		code.setCode(documentClassType.getCodeSystem().getCode());
		code.setCodeSystem(documentClassType.getCodeSystem().getCodeSystem());
		// code.setCodeSystemName(); TODO ?????
		code.setDisplayName(documentClassType.getCodeSystem().getDisplayName());
		return code;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.Id idFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.Id id = new ReportDischarge.Id();
		id.setExtension(reportIntegration.getDocument().getId() + "-" + reportIntegration.getDocument().getVersion());
		// Getting: IdentifierDocumentType
		IdentifierDocumentType generatedDocuments = managerMasterTypeService.findIdentifierDocumentType(
				IdentifierDocumentCdaType.GENERATED_DOCUMENTS.getValue(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(generatedDocuments, "The type " 
				+ IdentifierDocumentCdaType.GENERATED_DOCUMENTS.getValue()
				+ " with IDENTIFIER_DOCUMENT discriminator does not exist in the type master");
		id.setRoot(generatedDocuments.getObjectIdentifier().getOids());
		return id;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.RecordTarget recordTargetFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.RecordTarget recordTarget = new ReportDischarge.RecordTarget();
		ReportDischarge.RecordTarget.PatientRole patientRole = new ReportDischarge.RecordTarget.PatientRole();

		// Setting: ReportDischarge.RecordTarget.PatientRole.Id
		patientRole.getId().add(patientRoleIdDocumentIdentityFactory(reportIntegration));

		// Setting: ReportDischarge.RecordTarget.PatientRole.Id
		patientRole.getId().add(patientRoleIdClinicHistoryFactory(reportIntegration));

		// Setting: ReportDischarge.RecordTarget.PatientRole.Addr
		patientRole.setAddr(patientRoleAddrFactory(reportIntegration));

		// Setting: ReportDischarge.RecordTarget.PatientRole.Telecom
		ReportDischarge.RecordTarget.PatientRole.Telecom telecom = new ReportDischarge.RecordTarget.PatientRole.Telecom();
		// telecom.setUse(value); // TODO ?????
		telecom.setValue(reportIntegration.getPatient().getTelephone());
		patientRole.setTelecom(telecom);

		// Setting: ReportDischarge.RecordTarget.PatientRole.Patient
		patientRole.setPatient(patientFactory(reportIntegration));
		
		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization
		patientRole.setProviderOrganization(providerOrganizationFactory(reportIntegration));

		// Setting: ReportDischarge.RecordTarget.PatientRole
		recordTarget.setPatientRole(patientRole);

		return recordTarget;
	}

	/**
	 * @param reportIntegration
	 * @return
	 */
	private ReportDischarge.RecordTarget.PatientRole.Addr patientRoleAddrFactory(ReportIntegration reportIntegration) {
		ReportDischarge.RecordTarget.PatientRole.Addr addr = new ReportDischarge.RecordTarget.PatientRole.Addr();
		// addr.setUse(value); // TODO ?????
		addr.setStreetAddressLine(reportIntegration.getPatient().getAddress().getStreetAddressLine());
		addr.setCity(reportIntegration.getPatient().getAddress().getCity());
		addr.setState(reportIntegration.getPatient().getAddress().getState());
		addr.setPostalCode(reportIntegration.getPatient().getAddress().getPostalCode());
		addr.setCountry(reportIntegration.getPatient().getAddress().getCountry());
		addr.setCounty(reportIntegration.getPatient().getAddress().getCounty());
		addr.setAdditionalLocator(reportIntegration.getPatient().getAddress().getAdditionalLocator());
		return addr;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.RecordTarget.PatientRole.Id patientRoleIdClinicHistoryFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.RecordTarget.PatientRole.Id patientIdentifier = new ReportDischarge.RecordTarget.PatientRole.Id();
		// Getting: IdentifierDocumentType
		IdentifierDocumentType numberClinicHistory = managerMasterTypeService.findIdentifierDocumentType(
				IdentifierDocumentCdaType.NUMBER_CLINIC_HISTORY.getValue(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(numberClinicHistory, "The type " 
				+ IdentifierDocumentCdaType.NUMBER_CLINIC_HISTORY.getValue()
				+ " with IDENTIFIER_DOCUMENT discriminator does not exist in the type master");
		patientIdentifier.setRoot(numberClinicHistory.getObjectIdentifier().getOids());
		patientIdentifier.setExtension(reportIntegration.getPatient().getNhc());
		return patientIdentifier;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.RecordTarget.PatientRole.Id patientRoleIdDocumentIdentityFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.RecordTarget.PatientRole.Id patientDocument = new ReportDischarge.RecordTarget.PatientRole.Id();
		if(reportIntegration.getPatient().getTypeDocument()!=null 
			 && !reportIntegration.getPatient().getTypeDocument().equals("")){
			// Getting: DocumentIdentityType
			DocumentIdentityType documentIdentityType = managerMasterTypeService.findDocumentIdentityType(
					reportIntegration.getPatient().getTypeDocument(),
					reportIntegration.getDocument().getSourceSystem());
			// Throws Exception
			Assert.notNull(documentIdentityType, "The type " 
					+ reportIntegration.getPatient().getTypeDocument()
					+ " with DOCUMENT_IDENTITY_TYPE discriminator does not exist in the type master");
			patientDocument.setRoot(documentIdentityType.getObjectIdentifier().getOids());
			patientDocument.setExtension(reportIntegration.getPatient().getNumberDocument());
		}
		return patientDocument;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.RecordTarget.PatientRole.ProviderOrganization providerOrganizationFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization providerOrganization = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization();

		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id
		providerOrganization.setId(providerOrganizationIdFactory(reportIntegration));

		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Name
		// providerOrganization.setName(value); // TODO ?????

		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode standardIndustryClassCode = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode();
		// standardIndustryClassCode.setCode(value); // TODO ?????
		// standardIndustryClassCode.setCodeSystemName(value);
		// standardIndustryClassCode.setDisplayName(value);
		providerOrganization.setStandardIndustryClassCode(standardIndustryClassCode);

		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf
		providerOrganization.setAsOrganizationPartOf(asOrganizationPartOfFactory(reportIntegration));

		return providerOrganization;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id providerOrganizationIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id section = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id();
		// Getting: IdentifierDocumentType
		IdentifierDocumentType identifierSections = managerMasterTypeService.findIdentifierDocumentType(
				IdentifierDocumentCdaType.IDENTIFIER_SECTIONS.getValue(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(identifierSections, "The type " 
				+ IdentifierDocumentCdaType.IDENTIFIER_SECTIONS.getValue()
				+ " with IDENTIFIER_DOCUMENT discriminator does not exist in the type master");				
		section.setRoot(identifierSections.getObjectIdentifier().getOids());
		// section.setExtension(value); // TODO ?????
		return section;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf asOrganizationPartOfFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf asOrganizationPartOf = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf();

		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id
		asOrganizationPartOf.setId(asOrganizationPartOfIdFactory(reportIntegration));

		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code code = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code();
		// code.setCode(value); // TODO ?????
		// code.setCodeSystem(value);
		// code.setDisplayName(value);
		asOrganizationPartOf.setCode(code);

		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization
		asOrganizationPartOf.setWholeOrganization(wholeOrganizationFactory(reportIntegration));

		return asOrganizationPartOf;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id asOrganizationPartOfIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id service = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id();
		// Getting: IdentifierDocumentType
		IdentifierDocumentType identifierService = managerMasterTypeService.findIdentifierDocumentType(
				IdentifierDocumentCdaType.IDENTIFIER_SERVICE.getValue(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(identifierService, "The type " 
				+ IdentifierDocumentCdaType.IDENTIFIER_SERVICE.getValue()
				+ " with IDENTIFIER_DOCUMENT discriminator does not exist in the type master");				
		service.setRoot(identifierService.getObjectIdentifier().getOids());
		// service.setExtension(value); // TODO ?????
		return service;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganizationFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganization = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization();

		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id organization = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id();
		// Getting: ProvidersType
		ProvidersType providersType = getProvidersType(reportIntegration);
		organization.setRoot(providersType.getObjectIdentifier().getOids());
		wholeOrganization.setId(organization);

		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Name
		wholeOrganization.setName(providersType.getObjectIdentifier().getDescription());

		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom telecom = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom();
		telecom.setValue(reportIntegration.getCenter().getTelephone());
		wholeOrganization.setTelecom(telecom);

		// Setting: ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr
		wholeOrganization.setAddr(wholeOrganizationAddrFactory(reportIntegration));

		return wholeOrganization;
	}

	/**
	 * @param reportIntegration
	 * @return
	 */
	private ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr wholeOrganizationAddrFactory(ReportIntegration reportIntegration) {
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr addr = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr();
		Center center = reportIntegration.getCenter();
		if(center!=null){
			Address address = center.getAddress();
			if(address!=null){
				addr.setStreetAddressLine(address.getStreetAddressLine());
				addr.setCity(address.getCity() != null ? address.getCity() : "");
				addr.setState(address.getState() != null ? address.getState() : "");
				addr.setPostalCode(address.getPostalCode() != null ? address.getPostalCode() : "");
			}
		}
		return addr;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ProvidersType getProvidersType(ReportIntegration reportIntegration) throws Exception {
		// Getting: ProvidersType
		ProvidersType providersType = managerMasterTypeService.findProvidersType(
				reportIntegration.getDocument().getHealthProvider(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(providersType, "The type " 
				+ reportIntegration.getDocument().getHealthProvider()
				+ " with PROVIDERS discriminator does not exist in the type master");
		return providersType;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.RecordTarget.PatientRole.Patient patientFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.RecordTarget.PatientRole.Patient patient = new ReportDischarge.RecordTarget.PatientRole.Patient();

		// Setting: ReportDischarge.RecordTarget.PatientRole.Patient.Name
		patient.setName(patientNameFactory(reportIntegration));

		// Setting: ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode
		patient.setAdministrativeGenderCode(administrativeGenderCodeFactory(reportIntegration));

		// Setting: ReportDischarge.RecordTarget.PatientRole.Patient.BirthTime
		ReportDischarge.RecordTarget.PatientRole.Patient.BirthTime birthTime = new ReportDischarge.RecordTarget.PatientRole.Patient.BirthTime();
		birthTime.setValue(reportIntegration.getPatient().getBirthTime());
		patient.setBirthTime(birthTime);

		return patient;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode administrativeGenderCodeFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode administrativeGenderCode = new ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode();
		// Getting: SexType
		SexType sexType = managerMasterTypeService.findSexType(
				reportIntegration.getPatient().getSexType(),
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(sexType, "The type " 
				+ reportIntegration.getPatient().getSexType()
				+ " with SEX discriminator does not exist in the type master");
		administrativeGenderCode.setCode(sexType.getCodeSystem().getCode());
		administrativeGenderCode.setCodeSystem(sexType.getCodeSystem().getCodeSystem());
		administrativeGenderCode.setDisplayName(sexType.getCodeSystem().getDisplayName());
		return administrativeGenderCode;
	}

	/**
	 * @param reportIntegration
	 * @return
	 */
	private ReportDischarge.RecordTarget.PatientRole.Patient.Name patientNameFactory(ReportIntegration reportIntegration) {
		ReportDischarge.RecordTarget.PatientRole.Patient.Name name = new ReportDischarge.RecordTarget.PatientRole.Patient.Name();
		// name.setUse(value); // TODO ?????
		name.getFamily().add(reportIntegration.getPatient().getSurname());
//		name.getFamily().add(reportIntegration.getPatient().getSurname2());
		name.getGiven().add(reportIntegration.getPatient().getName());
//		name.getGiven().add(reportIntegration.getPatient().getName2());
		return name;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.Author authorFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.Author author = new ReportDischarge.Author();

		// Setting: ReportDischarge.Author.Time
		ReportDischarge.Author.Time time = new ReportDischarge.Author.Time();
		time.setValue(reportIntegration.getDocument().getDateCreate());
		author.setTime(time);

		ReportDischarge.Author.AssignedAuthor assignedAuthor = new ReportDischarge.Author.AssignedAuthor();

		// Setting: ReportDischarge.Author.AssignedAuthor.Id
		if(reportIntegration.getMedicalSigner().getTypeMatriculation() != null){
			assignedAuthor.setId(assignedAuthorIdFactory(reportIntegration));
		}
		// Setting: ReportDischarge.Author.AssignedAuthor.Code
		ReportDischarge.Author.AssignedAuthor.Code specialty = new ReportDischarge.Author.AssignedAuthor.Code();
		specialty.setCode(reportIntegration.getMedicalSigner().getSpeciality()); 
		// specialty.setCodeSystem(value);
		// specialty.setDisplayName(value);
		assignedAuthor.setCode(specialty);

		// Setting: ReportDischarge.Author.AssignedAuthor.Telecom
		ReportDischarge.Author.AssignedAuthor.Telecom telecom = new ReportDischarge.Author.AssignedAuthor.Telecom();
		// telecom.setUse(value); // TODO ?????
		telecom.setValue(reportIntegration.getMedicalSigner().getTelephone());
		assignedAuthor.setTelecom(telecom);

		// Setting: ReportDischarge.Author.AssignedAuthor.AssignedPerson
		assignedAuthor.setAssignedPerson(assignedPersonFactory(reportIntegration));

		// Setting: ReportDischarge.Author.AssignedAuthor
		author.setAssignedAuthor(assignedAuthor);

		return author;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.Author.AssignedAuthor.Id assignedAuthorIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.Author.AssignedAuthor.Id doctor = new ReportDischarge.Author.AssignedAuthor.Id();
		// Getting: MedicalMatriculationType
		MedicalMatriculationType medicalMatriculationType = managerMasterTypeService.findMedicalMatriculationType(
				reportIntegration.getMedicalSigner().getTypeMatriculation(),
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(medicalMatriculationType, "The type " 
				+ reportIntegration.getMedicalSigner().getTypeMatriculation()
				+ " with MEDICAL_MATRICULATION_TYPE discriminator does not exist in the type master");
		doctor.setRoot(medicalMatriculationType.getObjectIdentifier().getOids());
		doctor.setExtension(reportIntegration.getMedicalSigner().getNumberMatriculation());
		return doctor;
	}

	/**
	 * @param reportIntegration
	 * @return
	 */
	private ReportDischarge.Author.AssignedAuthor.AssignedPerson assignedPersonFactory(ReportIntegration reportIntegration) {
		ReportDischarge.Author.AssignedAuthor.AssignedPerson assignedPerson = new ReportDischarge.Author.AssignedAuthor.AssignedPerson();

		// Setting: ReportDischarge.Author.AssignedAuthor.AssignedPerson.Name
		ReportDischarge.Author.AssignedAuthor.AssignedPerson.Name name = new ReportDischarge.Author.AssignedAuthor.AssignedPerson.Name();
		name.getFamily().add(reportIntegration.getMedicalSigner().getSurname());
		name.getFamily().add(reportIntegration.getMedicalSigner().getSurname2());
		name.getGiven().add(reportIntegration.getMedicalSigner().getName());
		name.getGiven().add(reportIntegration.getMedicalSigner().getName2());
		assignedPerson.setName(name);

		return assignedPerson;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.Custodian custodianFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.Custodian custodian = new ReportDischarge.Custodian();
		ReportDischarge.Custodian.AssignedCustodian assignedCustodian = new ReportDischarge.Custodian.AssignedCustodian();
		ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization representedCustodianOrganization = new ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization();

		// Setting: ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id
		representedCustodianOrganization.setId(representedCustodianOrganizationIdFactory(reportIntegration));

		// Setting: ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization
		assignedCustodian.setRepresentedCustodianOrganization(representedCustodianOrganization);

		// Setting: ReportDischarge.Custodian.AssignedCustodian
		custodian.setAssignedCustodian(assignedCustodian);

		return custodian;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id representedCustodianOrganizationIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id organization = new ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id();
		// Getting: ProvidersType
		ProvidersType providersType = managerMasterTypeService.findProvidersType(
				reportIntegration.getDocument().getHealthProvider(),
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(providersType, "The type " 
				+ reportIntegration.getDocument().getHealthProvider()
				+ " with PROVIDERS discriminator does not exist in the type master");
		organization.setRoot(providersType.getObjectIdentifier().getOids());
		return organization;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.Participant participantFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.Participant participant = new ReportDischarge.Participant();

		// Setting: ReportDischarge.Participant.TypeCode
		// participant.setTypeCode(value); // TODO ?????

		ReportDischarge.Participant.AssociatedEntity associatedEntity = new ReportDischarge.Participant.AssociatedEntity();

		// Setting: ReportDischarge.Participant.AssociatedEntity.ClassCode
		// associatedEntity.setClassCode(value); // TODO ?????

		// Setting: ReportDischarge.Participant.AssociatedEntity.Id
		associatedEntity.setId(associatedEntityIdFactory(reportIntegration));

		// Setting: ReportDischarge.Participant.AssociatedEntity.AssociatedPerson
		ReportDischarge.Participant.AssociatedEntity.AssociatedPerson associatedPerson = new ReportDischarge.Participant.AssociatedEntity.AssociatedPerson();
		associatedPerson.setName(reportIntegration.getHealthPlan().getSurnameAffiliate() 
				+ " "
				+ reportIntegration.getHealthPlan().getNameAffiliate());
		associatedEntity.setAssociatedPerson(associatedPerson);

		// Setting: ReportDischarge.Participant.AssociatedEntity.ScopingOrganization
		associatedEntity.setScopingOrganization(scopingOrganizationFactory(reportIntegration));

		// Setting: ReportDischarge.Participant.AssociatedEntity
		participant.setAssociatedEntity(associatedEntity);

		return participant;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.Participant.AssociatedEntity.Id associatedEntityIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.Participant.AssociatedEntity.Id partner = new ReportDischarge.Participant.AssociatedEntity.Id();
		// Getting: IdentifierDocumentType
		IdentifierDocumentType numberAffiliate = managerMasterTypeService.findIdentifierDocumentType(
				IdentifierDocumentCdaType.NUMBER_AFFILIATE.getValue(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(numberAffiliate, "The type " 
				+ IdentifierDocumentCdaType.NUMBER_AFFILIATE.getValue()
				+ " with IDENTIFIER_DOCUMENT discriminator does not exist in the type master");
		partner.setRoot(numberAffiliate.getObjectIdentifier().getOids());
		partner.setExtension(reportIntegration.getHealthPlan().getNumberAffiliate());
		return partner;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.Participant.AssociatedEntity.ScopingOrganization scopingOrganizationFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.Participant.AssociatedEntity.ScopingOrganization scopingOrganization = new ReportDischarge.Participant.AssociatedEntity.ScopingOrganization();

		// Setting: ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id
		scopingOrganization.setId(scopingOrganizationIdFactory(reportIntegration));

		// Setting: ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Name
		scopingOrganization.setName(reportIntegration.getHealthPlan().getNameHealthPlan());

		ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf asOrganizationPartOf = new ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf();

		// Setting: ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id
		ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id financer = new ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id();
		// financer.setRoot(value); // TODO ?????
		asOrganizationPartOf.setId(financer);

		ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganization = new ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization();
	    wholeOrganization.setName(reportIntegration.getHealthPlan().getNameOrganization());
		asOrganizationPartOf.setWholeOrganization(wholeOrganization);

		// Setting: ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf
		scopingOrganization.setAsOrganizationPartOf(asOrganizationPartOf);

		return scopingOrganization;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id scopingOrganizationIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id healthPlan = new ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id();
		// Getting: IdentifierDocumentType
		IdentifierDocumentType identifierPlans = managerMasterTypeService.findIdentifierDocumentType(
				IdentifierDocumentCdaType.IDENTIFIER_PLANS.getValue(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(identifierPlans, "The type " 
				+ IdentifierDocumentCdaType.IDENTIFIER_PLANS.getValue()
				+ " with IDENTIFIER_DOCUMENT discriminator does not exist in the type master");
		healthPlan.setRoot(identifierPlans.getObjectIdentifier().getOids());
		healthPlan.setExtension(reportIntegration.getHealthPlan().getCodeHealthPlan());
		return healthPlan;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.DocumentationOf documentationOfFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.DocumentationOf documentationOf = new ReportDischarge.DocumentationOf();

		// Setting: ReportDischarge.DocumentationOf.TypeCode
		// documentationOf.setTypeCode(value); // TODO ?????

		ReportDischarge.DocumentationOf.ServiceEvent serviceEvent = new ReportDischarge.DocumentationOf.ServiceEvent();

		// Setting: ReportDischarge.DocumentationOf.ServiceEvent.ClassCode
		// serviceEvent.setClassCode(value); // TODO ?????

		// Setting: ReportDischarge.DocumentationOf.ServiceEvent.Code
		serviceEvent.setCode(codeEpisodeScopeFactory(reportIntegration));

		// Setting: ReportDischarge.DocumentationOf.ServiceEvent
		documentationOf.setServiceEvent(serviceEvent);

		return documentationOf;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.DocumentationOf.ServiceEvent.Code codeEpisodeScopeFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.DocumentationOf.ServiceEvent.Code episodeScope = new ReportDischarge.DocumentationOf.ServiceEvent.Code();
		// Getting: EpisodeScopeType
		EpisodeScopeType episodeScopeType = managerMasterTypeService.findEpisodeScopeType(
				reportIntegration.getEpisode().getScope(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(episodeScopeType, "The type " 
				+ reportIntegration.getEpisode().getScope()
				+ " with EPISODE_SCOPE discriminator does not exist in the type master");
		episodeScope.setCode(episodeScopeType.getCodeSystem().getCode());
		episodeScope.setCodeSystem(episodeScopeType.getCodeSystem().getCodeSystem());
		episodeScope.setDisplayName(episodeScopeType.getCodeSystem().getDisplayName());
		return episodeScope;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.ComponentOf componentOfFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.ComponentOf componentOf = new ReportDischarge.ComponentOf();
		ReportDischarge.ComponentOf.EncompassingEncounter encompassingEncounter = new ReportDischarge.ComponentOf.EncompassingEncounter();

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.Id		
		encompassingEncounter.setId(idEpisodeNumberFactory(reportIntegration));

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.Code
		encompassingEncounter.setCode(codeEpisodeTypeFactory(reportIntegration));

		ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime effectiveTime = new ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime();

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.Low
		ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.Low low = new ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.Low();
		low.setValue(reportIntegration.getEpisode().getDateAmission());
		effectiveTime.setLow(low);
		
		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.High
		ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.High high = new ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.High();
		high.setValue(reportIntegration.getEpisode().getDateDischarge());
		effectiveTime.setHigh(high);

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime
		encompassingEncounter.setEffectiveTime(effectiveTime);

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.DischargeDispositionCode
		ReportDischarge.ComponentOf.EncompassingEncounter.DischargeDispositionCode dischargeDispositionCode = new ReportDischarge.ComponentOf.EncompassingEncounter.DischargeDispositionCode();
		// dischargeDispositionCode.setCode(value); // TODO ?????
		// dischargeDispositionCode.setCodeSystem(value);
		// dischargeDispositionCode.setCodeSystemName(value);
		// dischargeDispositionCode.setDisplayName(value);
		encompassingEncounter.setDischargeDispositionCode(dischargeDispositionCode);

		ReportDischarge.ComponentOf.EncompassingEncounter.Locations locations = new ReportDischarge.ComponentOf.EncompassingEncounter.Locations();
		ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility healthCareFacility = new ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility();

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Id
		ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Id altaLocation = new ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Id();
		// altaLocation.setExtension(value); // TODO ?????
		// altaLocation.setRoot(value);
		healthCareFacility.setId(altaLocation);

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Location
		ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Location location = new ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Location();
		// location.setName(value); // TODO ?????
		healthCareFacility.setLocation(location);

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility
		locations.setHealthCareFacility(healthCareFacility);

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.Locations
		encompassingEncounter.setLocation(locations);

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter
		componentOf.setEncompassingEncounter(encompassingEncounter);

		return componentOf;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.ComponentOf.EncompassingEncounter.Code codeEpisodeTypeFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.ComponentOf.EncompassingEncounter.Code episodeType = new ReportDischarge.ComponentOf.EncompassingEncounter.Code();
		// Getting: EpisodeType
		EpisodeType episodeTypes = managerMasterTypeService.findEpisodeType(
				reportIntegration.getEpisode().getType(),
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(episodeTypes, "The type " 
				+ reportIntegration.getEpisode().getType()
				+ " with EPISODE_TYPE discriminator does not exist in the type master");
		episodeType.setCode(episodeTypes.getCodeSystem().getCode());
		episodeType.setCodeSystem(episodeTypes.getCodeSystem().getCodeSystem());
		// episodeType.setCodeSystemName(value); // TODO ?????
		episodeType.setDisplayName(episodeTypes.getCodeSystem().getDisplayName());
		return episodeType;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportDischarge.ComponentOf.EncompassingEncounter.Id idEpisodeNumberFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.ComponentOf.EncompassingEncounter.Id episodeNumber = new ReportDischarge.ComponentOf.EncompassingEncounter.Id();
		// Getting: IdentifierDocumentType
		IdentifierDocumentType identifierEpisodes = managerMasterTypeService.findIdentifierDocumentType(
				IdentifierDocumentCdaType.IDENTIFIER_EPISODES.getValue(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(identifierEpisodes, "The type " 
				+ IdentifierDocumentCdaType.IDENTIFIER_EPISODES.getValue()
				+ " with IDENTIFIER_DOCUMENT discriminator does not exist in the type master");
		episodeNumber.setRoot(identifierEpisodes.getObjectIdentifier().getOids());
		episodeNumber.setExtension(reportIntegration.getEpisode().getEpisodeNumber());
		return episodeNumber;
	}

	/**
	 * @return
	 * @throws Exception 
	 */
	private ReportDischarge.Components componentsFactory(ReportIntegration reportIntegration) throws Exception {
		ReportDischarge.Components components = new ReportDischarge.Components();
		ReportDischarge.Components.StructuredBody structuredBody = new ReportDischarge.Components.StructuredBody();

		for (ReportIntegration.ClinicoContent clinicoContent: reportIntegration.getClinicoContents()) {
			// Setting: ReportDischarge.Components.StructuredBody.Component
			structuredBody.getComponent().add(componentFactory(reportIntegration.getDocument().getSourceSystem(), clinicoContent));
		}
		
		// Setting: ReportDischarge.Components.StructuredBody
		components.setStructuredBody(structuredBody);

		return components;
	}

	/**
	 * @param clinicoContent
	 * @return
	 * @throws Exception 
	 */
	private ReportDischarge.Components.StructuredBody.Component componentFactory(String systemName, ReportIntegration.ClinicoContent clinicoContent) throws Exception {
		ReportDischarge.Components.StructuredBody.Component component = new ReportDischarge.Components.StructuredBody.Component();
		ReportDischarge.Components.StructuredBody.Component.Section section = new ReportDischarge.Components.StructuredBody.Component.Section();

		// Setting: ReportDischarge.Components.StructuredBody.Component.Section.TemplateId
		ReportDischarge.Components.StructuredBody.Component.Section.TemplateId template = new ReportDischarge.Components.StructuredBody.Component.Section.TemplateId();
		// Getting: SectionTemplateType
		SectionTemplateType sectionTemplateType = getSectionTemplateType(systemName, clinicoContent);				
		template.setRoot(sectionTemplateType.getObjectIdentifier().getOids());
		template.setExtension(ReportConstant.TYPE_EXTENSION);		
		section.setTemplateId(template);

		// Setting:  ReportDischarge.Components.StructuredBody.Component.Section.Code
		ReportDischarge.Components.StructuredBody.Component.Section.Code code = new ReportDischarge.Components.StructuredBody.Component.Section.Code();
		// code.setCode(value); TODO ?????
		// code.setCodeSystem(value);
		// code.setCodeSystemName(value);
		// code.setDisplayName(value);
		section.setCode(code);

		// Setting: ReportDischarge.Components.StructuredBody.Component.Section.Text
		ReportDischarge.Components.StructuredBody.Component.Section.Text text = new ReportDischarge.Components.StructuredBody.Component.Section.Text();
		text.setParagraph(clinicoContent.getDescription());
		section.setText(text);

		// Setting: ReportDischarge.Components.StructuredBody.Component.Section.Title
		section.setTitle(sectionTemplateType.getObjectIdentifier().getDescription());

		// Setting: ReportDischarge.Components.StructuredBody.Component.Section
		component.setSection(section);
		return component;
	}

	/**
	 * @param systemName
	 * @param clinicoContent
	 * @return
	 * @throws Exception
	 */
	private SectionTemplateType getSectionTemplateType(String systemName, ReportIntegration.ClinicoContent clinicoContent) throws Exception {		
		// Getting: SectionTemplateType
		SectionTemplateType sectionTemplateType = managerMasterTypeService.findSectionTemplateType(
				clinicoContent.getSeccion(), 
				systemName);
		// Throws Exception
		Assert.notNull(sectionTemplateType, "The type " 
				+ clinicoContent.getSeccion()
				+ " with SECTION_TEMPLATE discriminator does not exist in the type master");		
		return sectionTemplateType;
	}
}
