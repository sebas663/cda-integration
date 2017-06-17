package org.fleni.cda.xml.mapper.factory;

import java.util.ArrayList;
import java.util.List;

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
import org.fleni.cda.oid.model.entity.EpisodeType;
import org.fleni.cda.oid.model.entity.IdentifierDocumentType;
import org.fleni.cda.oid.model.entity.MedicalMatriculationType;
import org.fleni.cda.oid.model.entity.ProvidersType;
import org.fleni.cda.oid.model.entity.SectionTemplateType;
import org.fleni.cda.oid.model.entity.SexType;
import org.fleni.cda.process.manager.service.IManagerMasterTypeService;
import org.fleni.cda.xml.mapper.report.ReportStudyImages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

public class ReportStudyImagesFactory implements IClinicalDocumentFactory {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ReportDichargeFactory.class);

	private transient IManagerMasterTypeService managerMasterTypeService = ApplicationContextProvider.getBean(IManagerMasterTypeService.class);
	
//	private transient ICarestreamTokenRestService carestreamTokenRestService = ApplicationContextProvider.getBean(ICarestreamTokenRestService.class);
	
//	private static final int OBJECT_IDENTIFIER_KEY_IMAGENES = 86;
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.xml.mapper.factory.IClinicalDocumentFactory#buildXmlCdaClinicalDocument(org.fleni.cda.json.mapper.report.ReportIntegration)
	 */
	@Override
	public String buildXmlCdaClinicalDocument(ReportIntegration reportIntegration) {
		String xml = null;
		try {
			ReportStudyImages report = reportFactory(reportIntegration);
			xml = DocumentMarshaller.convertToXml(report, ReportStudyImages.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			LOGGER.error(e.getMessage(), e);
		}		
		return xml;
	}
	
	private ReportStudyImages reportFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages reportStudyImages = new ReportStudyImages();

		// Setting: ReportStudyImages.title
		reportStudyImages.setTitle(ReportConstant.ReportTitle.STUDY_IMAGES);

		// Setting: ReportStudyImages.RealmCode
		ReportStudyImages.RealmCode realmCode = new ReportStudyImages.RealmCode();
		realmCode.setCode(ReportConstant.REALM_CODE);
		reportStudyImages.setRealmCode(realmCode);

		// Setting: ReportStudyImages.TypeId
		ReportStudyImages.TypeId typeId = new ReportStudyImages.TypeId();
		typeId.setExtension(ReportConstant.TYPE_EXTENSION);
		typeId.setRoot(ReportConstant.TYPE_ROOT);
		reportStudyImages.setTypeId(typeId);

		// Setting: ReportStudyImages.TemplateId
		ReportStudyImages.TemplateId templateId = new ReportStudyImages.TemplateId();
		templateId.setExtension(ReportConstant.ReportTemplate.EXTENSION);
		templateId.setRoot(ReportConstant.ReportTemplate.COVER);
		reportStudyImages.setTemplateId(templateId);

		// Setting: ReportStudyImages.Id
		reportStudyImages.setId(idFactory(reportIntegration));

		// Setting: ReportStudyImages.Code
		reportStudyImages.setCode(codeFactory(reportIntegration));

		// Setting: ReportStudyImages.EffectiveTime
		ReportStudyImages.EffectiveTime effectiveTime = new ReportStudyImages.EffectiveTime();
		effectiveTime.setValue(reportIntegration.getDocument().getDateCreate());
		reportStudyImages.setEffectiveTime(effectiveTime);

		// Setting: ReportStudyImages.ConfidentialityCode
		reportStudyImages.setConfidentialityCode(confidentialityCodeFactory(reportIntegration));

		// Setting: ReportStudyImages.LanguageCode
		ReportStudyImages.LanguageCode languageCode = new ReportStudyImages.LanguageCode();
		languageCode.setCode(ReportConstant.LANGUAGE_CODE);
		reportStudyImages.setLanguageCode(languageCode);

		// Setting: ReportStudyImages.SetId
		reportStudyImages.setSetId(setIdFactory(reportIntegration));

		// Setting: ReportStudyImages.VersionNumber
		ReportStudyImages.VersionNumber versionNumber = new ReportStudyImages.VersionNumber();
		versionNumber.setValue(reportIntegration.getDocument().getVersion());
		reportStudyImages.setVersionNumber(versionNumber);

		// Setting: ReportStudyImages.RecordTarget
		reportStudyImages.setRecordTarget(recordTargetFactory(reportIntegration));
		
		// Setting: ReportStudyImages.Author
		reportStudyImages.setAuthor(authorFactory(reportIntegration));
		
		// Setting: ReportStudyImages.Custodian
		reportStudyImages.setCustodian(custodianFactory(reportIntegration));
		
		// Setting: ReportStudyImages.Participant
		reportStudyImages.setParticipant(participantFactory(reportIntegration));
		
		// Setting: ReportStudyImages.DocumentationOf
		reportStudyImages.setDocumentationOf(documentationOfFactory(reportIntegration));
		
		// Setting: ReportStudyImages.ComponentOf
		reportStudyImages.setComponentOf(componentOfFactory(reportIntegration));
		
		// Setting: ReportStudyImages.Component
		reportStudyImages.setComponents(componentsFactory(reportIntegration));

		return reportStudyImages;
	}
	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.SetId setIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.SetId setId = new ReportStudyImages.SetId();
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
	 * 
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.Id idFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.Id id = new ReportStudyImages.Id();
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
	private ReportStudyImages.Code codeFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.Code code = new ReportStudyImages.Code();
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
	private ReportStudyImages.ConfidentialityCode confidentialityCodeFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.ConfidentialityCode confidentialityCode = new ReportStudyImages.ConfidentialityCode();
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
	private ReportStudyImages.RecordTarget recordTargetFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.RecordTarget recordTarget = new ReportStudyImages.RecordTarget();
		ReportStudyImages.RecordTarget.PatientRole patientRole = new ReportStudyImages.RecordTarget.PatientRole();

		// Setting: ReportStudyImages.RecordTarget.PatientRole.Id
		patientRole.getId().add(patientRoleIdDocumentIdentityFactory(reportIntegration));

		// Setting: ReportStudyImages.RecordTarget.PatientRole.Id
		patientRole.getId().add(patientRoleIdClinicHistoryFactory(reportIntegration));

		// Setting: ReportStudyImages.RecordTarget.PatientRole.Addr
		patientRole.setAddr(patientRoleAddrFactory(reportIntegration));

		// Setting: ReportStudyImages.RecordTarget.PatientRole.Telecom
		ReportStudyImages.RecordTarget.PatientRole.Telecom telecom = new ReportStudyImages.RecordTarget.PatientRole.Telecom();
		// telecom.setUse(value); // TODO ?????
		telecom.setValue(reportIntegration.getPatient().getTelephone());
		patientRole.setTelecom(telecom);

		// Setting: ReportStudyImages.RecordTarget.PatientRole.Patient
		patientRole.setPatient(patientFactory(reportIntegration));
		
		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization
		patientRole.setProviderOrganization(providerOrganizationFactory(reportIntegration));

		// Setting: ReportStudyImages.RecordTarget.PatientRole
		recordTarget.setPatientRole(patientRole);

		return recordTarget;
	}

	/**
	 * @param reportIntegration
	 * @return
	 */
	private ReportStudyImages.RecordTarget.PatientRole.Addr patientRoleAddrFactory(ReportIntegration reportIntegration) {
		ReportStudyImages.RecordTarget.PatientRole.Addr addr = new ReportStudyImages.RecordTarget.PatientRole.Addr();
		// addr.setUse(value); // TODO ?????
		addr.setStreetAddressLine(reportIntegration.getPatient().getAddress().getStreetAddressLine());
		addr.setCity(reportIntegration.getPatient().getAddress().getCity());
		addr.setState(reportIntegration.getPatient().getAddress().getState());
//		addr.setPostalCode(reportIntegration.getPatient().getAddress().getPostalCode());
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
	private ReportStudyImages.RecordTarget.PatientRole.Id patientRoleIdClinicHistoryFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.RecordTarget.PatientRole.Id patientIdentifier = new ReportStudyImages.RecordTarget.PatientRole.Id();
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
	private ReportStudyImages.RecordTarget.PatientRole.Id patientRoleIdDocumentIdentityFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.RecordTarget.PatientRole.Id patientDocument = new ReportStudyImages.RecordTarget.PatientRole.Id();
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
	private ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization providerOrganizationFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization providerOrganization = new ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization();

		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.Id
		providerOrganization.setId(providerOrganizationIdFactory(reportIntegration));

		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.Name
		// providerOrganization.setName(value); // TODO ?????

		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode
		ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode standardIndustryClassCode = new ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode();
		// standardIndustryClassCode.setCode(value); // TODO ?????
		// standardIndustryClassCode.setCodeSystemName(value);
		// standardIndustryClassCode.setDisplayName(value);
		providerOrganization.setStandardIndustryClassCode(standardIndustryClassCode);

		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf
		providerOrganization.setAsOrganizationPartOf(asOrganizationPartOfFactory(reportIntegration));

		return providerOrganization;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.Id providerOrganizationIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.Id section = new ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.Id();
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
	private ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf asOrganizationPartOfFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf asOrganizationPartOf = new ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf();

		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id
		asOrganizationPartOf.setId(asOrganizationPartOfIdFactory(reportIntegration));

		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code
		ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code code = new ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code();
		// code.setCode(value); // TODO ?????
		// code.setCodeSystem(value);
		// code.setDisplayName(value);
		asOrganizationPartOf.setCode(code);

		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization
		asOrganizationPartOf.setWholeOrganization(wholeOrganizationFactory(reportIntegration));

		return asOrganizationPartOf;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id asOrganizationPartOfIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id service = new ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id();
		// Getting: IdentifierDocumentType
		IdentifierDocumentType identifierService = managerMasterTypeService.findIdentifierDocumentType(
				IdentifierDocumentCdaType.IDENTIFIER_SERVICE.getValue(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(identifierService, "The type " 
				+ IdentifierDocumentCdaType.IDENTIFIER_SERVICE.getValue()
				+ " with IDENTIFIER_DOCUMENT discriminator does not exist in the type master");				
		service.setRoot(identifierService.getObjectIdentifier().getOids());
//		 service.setExtension(value); // TODO ?????
		return service;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganizationFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganization = new ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization();

		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id
		ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id organization = new ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id();
		// Getting: ProvidersType
		ProvidersType providersType = getProvidersType(reportIntegration);
		organization.setRoot(providersType.getObjectIdentifier().getOids());
		wholeOrganization.setId(organization);

		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Name
		wholeOrganization.setName(providersType.getObjectIdentifier().getDescription());

		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom
		ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom telecom = new ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom();
//		telecom.setValue(reportIntegration.getCenter().getTelephone());
		wholeOrganization.setTelecom(telecom);

		// Setting: ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr
		wholeOrganization.setAddr(wholeOrganizationAddrFactory(reportIntegration));

		return wholeOrganization;
	}

	/**
	 * @param reportIntegration
	 * @return
	 */
	private ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr wholeOrganizationAddrFactory(ReportIntegration reportIntegration) {
		ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr addr = new ReportStudyImages.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr();
		Center center = reportIntegration.getCenter();
		if(center!=null){
			Address address = center.getAddress();
			if(address!=null){
				addr.setStreetAddressLine(address.getStreetAddressLine());
				addr.setCity(address.getCity() != null ? address.getCity() : "");
				addr.setState(address.getState() != null ? address.getState() : "");
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
	private ReportStudyImages.RecordTarget.PatientRole.Patient patientFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.RecordTarget.PatientRole.Patient patient = new ReportStudyImages.RecordTarget.PatientRole.Patient();

		// Setting: ReportStudyImages.RecordTarget.PatientRole.Patient.Name
		patient.setName(patientNameFactory(reportIntegration));

		// Setting: ReportStudyImages.RecordTarget.PatientRole.Patient.AdministrativeGenderCode
		patient.setAdministrativeGenderCode(administrativeGenderCodeFactory(reportIntegration));

		// Setting: ReportStudyImages.RecordTarget.PatientRole.Patient.BirthTime
		ReportStudyImages.RecordTarget.PatientRole.Patient.BirthTime birthTime = new ReportStudyImages.RecordTarget.PatientRole.Patient.BirthTime();
		birthTime.setValue(reportIntegration.getPatient().getBirthTime());
		patient.setBirthTime(birthTime);

		return patient;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.RecordTarget.PatientRole.Patient.AdministrativeGenderCode administrativeGenderCodeFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.RecordTarget.PatientRole.Patient.AdministrativeGenderCode administrativeGenderCode = new ReportStudyImages.RecordTarget.PatientRole.Patient.AdministrativeGenderCode();
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
	private ReportStudyImages.RecordTarget.PatientRole.Patient.Name patientNameFactory(ReportIntegration reportIntegration) {
		ReportStudyImages.RecordTarget.PatientRole.Patient.Name name = new ReportStudyImages.RecordTarget.PatientRole.Patient.Name();
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
	private ReportStudyImages.Author authorFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.Author author = new ReportStudyImages.Author();

		// Setting: ReportStudyImages.Author.Time
		ReportStudyImages.Author.Time time = new ReportStudyImages.Author.Time();
		time.setValue(reportIntegration.getDocument().getDateCreate());
		author.setTime(time);

		ReportStudyImages.Author.AssignedAuthor assignedAuthor = new ReportStudyImages.Author.AssignedAuthor();

		// Setting: ReportStudyImages.Author.AssignedAuthor.Id
		if(reportIntegration.getMedicalSigner().getTypeMatriculation() != null){
			assignedAuthor.setId(assignedAuthorIdFactory(reportIntegration));
		}
		// Setting: ReportStudyImages.Author.AssignedAuthor.Code
		ReportStudyImages.Author.AssignedAuthor.Code specialty = new ReportStudyImages.Author.AssignedAuthor.Code();
		specialty.setCode(reportIntegration.getMedicalSigner().getSpeciality()); 
		// specialty.setCodeSystem(value);
		// specialty.setDisplayName(value);
		assignedAuthor.setCode(specialty);

		// Setting: ReportStudyImages.Author.AssignedAuthor.Telecom
		ReportStudyImages.Author.AssignedAuthor.Telecom telecom = new ReportStudyImages.Author.AssignedAuthor.Telecom();
		// telecom.setUse(value); // TODO ?????
		telecom.setValue(reportIntegration.getMedicalSigner().getTelephone());
		assignedAuthor.setTelecom(telecom);

		// Setting: ReportStudyImages.Author.AssignedAuthor.AssignedPerson
		assignedAuthor.setAssignedPerson(assignedPersonFactory(reportIntegration));

		// Setting: ReportStudyImages.Author.AssignedAuthor
		author.setAssignedAuthor(assignedAuthor);

		return author;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.Author.AssignedAuthor.Id assignedAuthorIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.Author.AssignedAuthor.Id doctor = new ReportStudyImages.Author.AssignedAuthor.Id();
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
	private ReportStudyImages.Author.AssignedAuthor.AssignedPerson assignedPersonFactory(ReportIntegration reportIntegration) {
		ReportStudyImages.Author.AssignedAuthor.AssignedPerson assignedPerson = new ReportStudyImages.Author.AssignedAuthor.AssignedPerson();

		// Setting: ReportStudyImages.Author.AssignedAuthor.AssignedPerson.Name
		ReportStudyImages.Author.AssignedAuthor.AssignedPerson.Name name = new ReportStudyImages.Author.AssignedAuthor.AssignedPerson.Name();
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
	private ReportStudyImages.Custodian custodianFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.Custodian custodian = new ReportStudyImages.Custodian();
		ReportStudyImages.Custodian.AssignedCustodian assignedCustodian = new ReportStudyImages.Custodian.AssignedCustodian();
		ReportStudyImages.Custodian.AssignedCustodian.RepresentedCustodianOrganization representedCustodianOrganization = new ReportStudyImages.Custodian.AssignedCustodian.RepresentedCustodianOrganization();

		// Setting: ReportStudyImages.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id
		representedCustodianOrganization.setId(representedCustodianOrganizationIdFactory(reportIntegration));

		// Setting: ReportStudyImages.Custodian.AssignedCustodian.RepresentedCustodianOrganization
		assignedCustodian.setRepresentedCustodianOrganization(representedCustodianOrganization);

		// Setting: ReportStudyImages.Custodian.AssignedCustodian
		custodian.setAssignedCustodian(assignedCustodian);

		return custodian;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id representedCustodianOrganizationIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id organization = new ReportStudyImages.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id();
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
	private List<ReportStudyImages.Participant> participantFactory(ReportIntegration reportIntegration) throws Exception {
		
		List<ReportStudyImages.Participant> lst = new ArrayList<ReportStudyImages.Participant>();
		ReportStudyImages.Participant participant = new ReportStudyImages.Participant();

		// Setting: ReportStudyImages.Participant.TypeCode
		// participant.setTypeCode(value); // TODO ?????

		ReportStudyImages.Participant.AssociatedEntity associatedEntity = new ReportStudyImages.Participant.AssociatedEntity();

		// Setting: ReportStudyImages.Participant.AssociatedEntity.ClassCode
		// associatedEntity.setClassCode(value); // TODO ?????

		// Setting: ReportStudyImages.Participant.AssociatedEntity.Id
		associatedEntity.setId(associatedEntityIdFactory(reportIntegration));

		// Setting: ReportStudyImages.Participant.AssociatedEntity.AssociatedPerson
		ReportStudyImages.Participant.AssociatedEntity.AssociatedPerson associatedPerson = new ReportStudyImages.Participant.AssociatedEntity.AssociatedPerson();
		if(reportIntegration.getHealthPlan() != null){
			associatedPerson.setName(reportIntegration.getHealthPlan().getSurnameAffiliate() 
					+ " "
					+ reportIntegration.getHealthPlan().getNameAffiliate());
			associatedEntity.setAssociatedPerson(associatedPerson);
		}

		// Setting: ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization
		associatedEntity.setScopingOrganization(scopingOrganizationFactory(reportIntegration));

		// Setting: ReportStudyImages.Participant.AssociatedEntity
		participant.setAssociatedEntity(associatedEntity);
		lst.add(participant);
		return lst;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.Participant.AssociatedEntity.Id associatedEntityIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.Participant.AssociatedEntity.Id partner = new ReportStudyImages.Participant.AssociatedEntity.Id();
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
	private ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization scopingOrganizationFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization scopingOrganization = new ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization();

		// Setting: ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.Id
		scopingOrganization.setId(scopingOrganizationIdFactory(reportIntegration));
		if(reportIntegration.getHealthPlan() != null){
			// Setting: ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.Name
			scopingOrganization.setName(reportIntegration.getHealthPlan().getNameHealthPlan());
		}

		ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf asOrganizationPartOf = new ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf();

		// Setting: ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id
		ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id financer = new ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id();
		// financer.setRoot(value); // TODO ?????
		asOrganizationPartOf.setId(financer);

		ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganization = new ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization();
		wholeOrganization.setName(reportIntegration.getHealthPlan().getNameOrganization());
		asOrganizationPartOf.setWholeOrganization(wholeOrganization);

		// Setting: ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf
		scopingOrganization.setAsOrganizationPartOf(asOrganizationPartOf);

		return scopingOrganization;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.Id scopingOrganizationIdFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.Id healthPlan = new ReportStudyImages.Participant.AssociatedEntity.ScopingOrganization.Id();
		// Getting: IdentifierDocumentType
		IdentifierDocumentType identifierPlans = managerMasterTypeService.findIdentifierDocumentType(
				IdentifierDocumentCdaType.IDENTIFIER_PLANS.getValue(), 
				reportIntegration.getDocument().getSourceSystem());
		// Throws Exception
		Assert.notNull(identifierPlans, "The type " 
				+ IdentifierDocumentCdaType.IDENTIFIER_PLANS.getValue()
				+ " with IDENTIFIER_DOCUMENT discriminator does not exist in the type master");
		healthPlan.setRoot(identifierPlans.getObjectIdentifier().getOids());
		return healthPlan;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.DocumentationOf documentationOfFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.DocumentationOf documentationOf = new ReportStudyImages.DocumentationOf();

		// Setting: ReportStudyImages.DocumentationOf.TypeCode
		// documentationOf.setTypeCode(value); // TODO ?????

		ReportStudyImages.DocumentationOf.ServiceEvent serviceEvent = new ReportStudyImages.DocumentationOf.ServiceEvent();

		// Setting: ReportStudyImages.DocumentationOf.ServiceEvent.ClassCode
		// serviceEvent.setClassCode(value); // TODO ?????

		// Setting: ReportStudyImages.DocumentationOf.ServiceEvent.Code
		serviceEvent.setCode(docofServiceEventCodeFactory(reportIntegration));

		// Setting: ReportStudyImages.DocumentationOf.ServiceEvent
		documentationOf.setServiceEvent(serviceEvent);

		return documentationOf;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.DocumentationOf.ServiceEvent.Code docofServiceEventCodeFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.DocumentationOf.ServiceEvent.Code episodeScope = new ReportStudyImages.DocumentationOf.ServiceEvent.Code();
		
		if( reportIntegration.getDocument() != null){
			
			// Getting: EpisodeScopeType
			DocumentClassType documentClassType = managerMasterTypeService.findDocumentClassType(
					reportIntegration.getDocument().getSubtype(), 
					reportIntegration.getDocument().getSourceSystem());
			// Throws Exception
			Assert.notNull(documentClassType, "The subtype " 
					+ reportIntegration.getDocument().getSubtype()
					+ " with SUBTYPE discriminator does not exist in the type master");
			episodeScope.setCode(documentClassType.getCodeSystem().getCode());
			episodeScope.setCodeSystem(documentClassType.getCodeSystem().getCodeSystem());
			episodeScope.setDisplayName(documentClassType.getCodeSystem().getDisplayName());
		}
		return episodeScope;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.ComponentOf componentOfFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.ComponentOf componentOf = new ReportStudyImages.ComponentOf();
		ReportStudyImages.ComponentOf.EncompassingEncounter encompassingEncounter = new ReportStudyImages.ComponentOf.EncompassingEncounter();

		// Setting: ReportStudyImages.ComponentOf.EncompassingEncounter.Id		
		encompassingEncounter.setId(idEpisodeNumberFactory(reportIntegration));

		// Setting: ReportStudyImages.ComponentOf.EncompassingEncounter.Code
		encompassingEncounter.setCode(codeEpisodeTypeFactory(reportIntegration));

		ReportStudyImages.ComponentOf.EncompassingEncounter.EffectiveTime effectiveTime = new ReportStudyImages.ComponentOf.EncompassingEncounter.EffectiveTime();

		// Setting: ReportStudyImages.ComponentOf.EncompassingEncounter.EffectiveTime.Low
		ReportStudyImages.ComponentOf.EncompassingEncounter.EffectiveTime.Low low = new ReportStudyImages.ComponentOf.EncompassingEncounter.EffectiveTime.Low();
//		low.setValue(reportIntegration.getEpisode().getDateAmission());
		low.setValue(reportIntegration.getDocument().getDateCreate());
		effectiveTime.setLow(low);
		
		// Setting: ReportStudyImages.ComponentOf.EncompassingEncounter.EffectiveTime.High
		ReportStudyImages.ComponentOf.EncompassingEncounter.EffectiveTime.High high = new ReportStudyImages.ComponentOf.EncompassingEncounter.EffectiveTime.High();
		high.setValue(reportIntegration.getEpisode().getDateDischarge());
		effectiveTime.setHigh(high);

		// Setting: ReportStudyImages.ComponentOf.EncompassingEncounter.EffectiveTime
		encompassingEncounter.setEffectiveTime(effectiveTime);

		// Setting: ReportStudyImages.ComponentOf.EncompassingEncounter
		componentOf.setEncompassingEncounter(encompassingEncounter);

		return componentOf;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.ComponentOf.EncompassingEncounter.Code codeEpisodeTypeFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.ComponentOf.EncompassingEncounter.Code episodeType = new ReportStudyImages.ComponentOf.EncompassingEncounter.Code();
		if(reportIntegration.getEpisode() != null ){
			//TODO:FIX REMOVE THIS
			reportIntegration.getEpisode().setType("C");
			//TODO:#############################################################
			
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
		}
		return episodeType;
	}

	/**
	 * @param reportIntegration
	 * @return
	 * @throws Exception
	 */
	private ReportStudyImages.ComponentOf.EncompassingEncounter.Id idEpisodeNumberFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.ComponentOf.EncompassingEncounter.Id episodeNumber = new ReportStudyImages.ComponentOf.EncompassingEncounter.Id();
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
	private ReportStudyImages.Components componentsFactory(ReportIntegration reportIntegration) throws Exception {
		ReportStudyImages.Components components = new ReportStudyImages.Components();
		ReportStudyImages.Components.StructuredBody structuredBody = new ReportStudyImages.Components.StructuredBody();

		for (ReportIntegration.ClinicoContent clinicoContent: reportIntegration.getClinicoContents()) {
			// Setting: ReportStudyImages.Components.StructuredBody.Component
			structuredBody.getComponent().add(componentFactory(reportIntegration, clinicoContent));
		}
		
		// Setting: ReportStudyImages.Components.StructuredBody
		components.setStructuredBody(structuredBody);

		return components;
	}

	/**
	 * @param clinicoContent
	 * @return
	 * @throws Exception 
	 */
	private ReportStudyImages.Components.StructuredBody.Component componentFactory(ReportIntegration report,ReportIntegration.ClinicoContent clinicoContent) throws Exception {
		ReportStudyImages.Components.StructuredBody.Component component = new ReportStudyImages.Components.StructuredBody.Component();
		ReportStudyImages.Components.StructuredBody.Component.Section section = new ReportStudyImages.Components.StructuredBody.Component.Section();
		
		// Setting: ReportStudyImages.Components.StructuredBody.Component.Section.TemplateId
		ReportStudyImages.Components.StructuredBody.Component.Section.TemplateId template = new ReportStudyImages.Components.StructuredBody.Component.Section.TemplateId();
		// Getting: SectionTemplateType
		SectionTemplateType sectionTemplateType = getSectionTemplateType(report.getDocument().getSourceSystem(), clinicoContent);				
		template.setRoot(sectionTemplateType.getObjectIdentifier().getOids());
//		template.setExtension(ReportConstant.TYPE_EXTENSION);		
		section.setTemplateId(template);

		// Setting:  ReportStudyImages.Components.StructuredBody.Component.Section.Code
		ReportStudyImages.Components.StructuredBody.Component.Section.Code code = new ReportStudyImages.Components.StructuredBody.Component.Section.Code();
		// code.setCode(value); TODO ?????
		// code.setCodeSystem(value);
		// code.setCodeSystemName(value);
		// code.setDisplayName(value);
		section.setCode(code);

		// Setting: ReportStudyImages.Components.StructuredBody.Component.Section.Text
		ReportStudyImages.Components.StructuredBody.Component.Section.Text text = new ReportStudyImages.Components.StructuredBody.Component.Section.Text();
		String textContent = clinicoContent.getDescription();
//		if(sectionTemplateType.getObjectIdentifier().getId().intValue() == OBJECT_IDENTIFIER_KEY_IMAGENES){
//			textContent = carestreamTokenRestService.getLinkPacks(report.getDocument().getDocumentNumber());
//			LOGGER.info("[LINK CARESTREAM]  " + textContent);
//		}
		text.setContent(textContent);
		
		section.setText(text);

		// Setting: ReportStudyImages.Components.StructuredBody.Component.Section.Title
		section.setTitle(sectionTemplateType.getObjectIdentifier().getDescription());

		// Setting: ReportStudyImages.Components.StructuredBody.Component.Section
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
