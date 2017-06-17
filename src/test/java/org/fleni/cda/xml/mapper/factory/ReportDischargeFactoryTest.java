package org.fleni.cda.xml.mapper.factory;

import org.fleni.cda.common.xml.DocumentMarshaller;
import org.fleni.cda.common.xml.ReportConstant;
import org.fleni.cda.xml.mapper.report.ReportDischarge;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
@ContextConfiguration(locations = { "classpath:/spring/spring-test-application-context.xml" })
public class ReportDischargeFactoryTest extends AbstractTestNGSpringContextTests {

	@Test(enabled = false)
	public void convertReportDischargeToXmlTest() {
		try {
			ReportDischarge reportDischarge = reportDischargeFactory();

			Assert.assertNotNull(reportDischarge);

			String xml = DocumentMarshaller.convertToXml(reportDischarge, ReportDischarge.class);

			Assert.assertNotNull(xml);

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	/**
	 * @return
	 */
	public ReportDischarge reportDischargeFactory() {
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
		ReportDischarge.Id id = new ReportDischarge.Id();
		// id.setExtension(value); // TODO Id de documento + version
		// id.setRoot(value);
		reportDischarge.setId(id);

		// Setting: ReportDischarge.Code
		ReportDischarge.Code code = new ReportDischarge.Code();
		// code.setCode(value); // TODO clasificacion del documento
		// code.setCodeSystem(value);
		// code.setCodeSystemName(value);
		// code.setDisplayName(value);
		reportDischarge.setCode(code);

		// Setting: ReportDischarge.EffectiveTime
		ReportDischarge.EffectiveTime effectiveTime = new ReportDischarge.EffectiveTime();
		// effectiveTime.setValue(value); // TODO fecha
		reportDischarge.setEffectiveTime(effectiveTime);

		// Setting: ReportDischarge.ConfidentialityCode
		ReportDischarge.ConfidentialityCode confidentialityCode = new ReportDischarge.ConfidentialityCode();
		// confidentialityCode.setCode(value); // TODO Confidencialidad
		// confidentialityCode.setCodeSystem(value);
		reportDischarge.setConfidentialityCode(confidentialityCode);

		// Setting: ReportDischarge.LanguageCode
		ReportDischarge.LanguageCode languageCode = new ReportDischarge.LanguageCode();
		languageCode.setCode(ReportConstant.LANGUAGE_CODE);
		reportDischarge.setLanguageCode(languageCode);

		// Setting: ReportDischarge.SetId
		ReportDischarge.SetId setId = new ReportDischarge.SetId();
		// setId.setExtension(value); // TODO Id de documento
		// setId.setRoot(value);
		reportDischarge.setSetId(setId);

		// Setting: ReportDischarge.VersionNumber
		ReportDischarge.VersionNumber versionNumber = new ReportDischarge.VersionNumber();
		// versionNumber.setValue(value); // TODO version del documento
		reportDischarge.setVersionNumber(versionNumber);

		// Setting: ReportDischarge.RecordTarget
		reportDischarge.setRecordTarget(recordTargetFactory());
		// Setting: ReportDischarge.Author
		reportDischarge.setAuthor(authorFactory());
		// Setting: ReportDischarge.Custodian
		reportDischarge.setCustodian(custodianFactory());
		// Setting: ReportDischarge.Participant
		reportDischarge.setParticipant(participantFactory());
		// Setting: ReportDischarge.DocumentationOf
		reportDischarge.setDocumentationOf(documentationOfFactory());
		// Setting: ReportDischarge.ComponentOf
		reportDischarge.setComponentOf(componentOfFactory());
		// Setting: ReportDischarge.Component
		reportDischarge.setComponent(componentFactory());

		return reportDischarge;
	}

	/**
	 * @return
	 */
	private ReportDischarge.RecordTarget recordTargetFactory() {
		ReportDischarge.RecordTarget recordTarget = new ReportDischarge.RecordTarget();
		ReportDischarge.RecordTarget.PatientRole patientRole = new ReportDischarge.RecordTarget.PatientRole();

		// Setting: ReportDischarge.RecordTarget.PatientRole.Id
		ReportDischarge.RecordTarget.PatientRole.Id patientDocument = new ReportDischarge.RecordTarget.PatientRole.Id();
		// patientDocument.setRoot(value); // TODO tipo
		// patientDocument.setExtension(value); // TODO dni
		patientRole.getId().add(patientDocument);
		// Setting: ReportDischarge.RecordTarget.PatientRole.Id
		ReportDischarge.RecordTarget.PatientRole.Id patientIdentifier = new ReportDischarge.RecordTarget.PatientRole.Id();
		patientIdentifier.setRoot(ReportConstant.Providers.FLENI_CODE + ReportConstant.Ids.MEDICAL_RECORD);
		// patientIdentifier.setExtension(value); // TODO nhc
		patientRole.getId().add(patientDocument);

		// Setting: ReportDischarge.RecordTarget.PatientRole.Addr
		ReportDischarge.RecordTarget.PatientRole.Addr addr = new ReportDischarge.RecordTarget.PatientRole.Addr();
		// addr.setUse(value); // TODO ?????
		// addr.setStreetAddressLine(value); // TODO Direccion
		// addr.setCity(value);
		// addr.setState(value);
		// addr.setPostalCode(value);
		// addr.setCountry(value);
		// addr.setCounty(value);
		// addr.setAdditionalLocator(value);
		patientRole.setAddr(addr);

		// Setting: ReportDischarge.RecordTarget.PatientRole.Telecom
		ReportDischarge.RecordTarget.PatientRole.Telecom telecom = new ReportDischarge.RecordTarget.PatientRole.Telecom();
		// telecom.setUse(value); // TODO ?????
		// telecom.setValue(value);
		patientRole.setTelecom(telecom);

		// Setting: ReportDischarge.RecordTarget.PatientRole.Patient
		patientRole.setPatient(patientFactory());
		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization
		patientRole.setProviderOrganization(providerOrganizationFactory());

		// Setting: ReportDischarge.RecordTarget.PatientRole
		recordTarget.setPatientRole(patientRole);

		return recordTarget;
	}

	/**
	 * @return
	 */
	private ReportDischarge.RecordTarget.PatientRole.ProviderOrganization providerOrganizationFactory() {
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization providerOrganization = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization();

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id section = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Id();
		section.setRoot(ReportConstant.Providers.FLENI_CODE + ReportConstant.Ids.SECTIONS);
		// section.setExtension(value); // TODO seccion
		providerOrganization.setId(section);

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.Name
		// providerOrganization.setName(value); // TODO nombre de la seccion

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode standardIndustryClassCode = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.StandardIndustryClassCode();
		// standardIndustryClassCode.setCode(value); // TODO Sub Especialidad
		// standardIndustryClassCode.setCodeSystemName(value);
		// standardIndustryClassCode.setDisplayName(value);
		providerOrganization.setStandardIndustryClassCode(standardIndustryClassCode);

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf
		providerOrganization.setAsOrganizationPartOf(asOrganizationPartOfFactory());

		return providerOrganization;
	}

	/**
	 * @return
	 */
	private ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf asOrganizationPartOfFactory() {
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf asOrganizationPartOf = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf();

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id service = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Id();
		service.setRoot(ReportConstant.Providers.FLENI_CODE + ReportConstant.Ids.SERVICES);
		// service.setExtension(value); // TODO servicio
		asOrganizationPartOf.setId(service);

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code code = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.Code();
		// code.setCode(value); // TODO especialidad
		// code.setCodeSystem(value);
		// code.setDisplayName(value);
		asOrganizationPartOf.setCode(code);

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization
		asOrganizationPartOf.setWholeOrganization(wholeOrganizationFactory());

		return asOrganizationPartOf;
	}

	/**
	 * @return
	 */
	private ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganizationFactory() {
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganization = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization();

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id organization = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Id();
		organization.setRoot(ReportConstant.Providers.FLENI_CODE);
		wholeOrganization.setId(organization);

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Name
		wholeOrganization.setName(ReportConstant.Providers.FLENI_DESC);

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom telecom = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Telecom();
		// telecom.setValue(value); // TODO Telefono
		wholeOrganization.setTelecom(telecom);

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr
		ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr addr = new ReportDischarge.RecordTarget.PatientRole.ProviderOrganization.AsOrganizationPartOf.WholeOrganization.Addr();
		// addr.setStreetAddressLine(value); // TODO Info Fleni
		// addr.setCity(value);
		// addr.setState(value);
		// addr.setPostalCode(value);
		wholeOrganization.setAddr(addr);

		return wholeOrganization;
	}

	/**
	 * @return
	 */
	private ReportDischarge.RecordTarget.PatientRole.Patient patientFactory() {
		ReportDischarge.RecordTarget.PatientRole.Patient patient = new ReportDischarge.RecordTarget.PatientRole.Patient();

		// Setting: ReportDischarge.RecordTarget.PatientRole.Patient.Name
		ReportDischarge.RecordTarget.PatientRole.Patient.Name name = new ReportDischarge.RecordTarget.PatientRole.Patient.Name();
		// name.setUse(value); // TODO ?????
		// name.getFamily().add(value); // TODO Apellido
		// name.getFamily().add(value); // TODO Apellido segundo
		// name.getGiven().add(value); // TODO nombre
		// name.getGiven().add(value); // TODO nombre segundo
		patient.setName(name);

		// Setting:
		// ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode
		ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode administrativeGenderCode = new ReportDischarge.RecordTarget.PatientRole.Patient.AdministrativeGenderCode();
		// administrativeGenderCode.setCode(value); // TODO Sexo
		// administrativeGenderCode.setCodeSystem(value);
		// administrativeGenderCode.setDisplayName(value);
		patient.setAdministrativeGenderCode(administrativeGenderCode);

		// Setting: ReportDischarge.RecordTarget.PatientRole.Patient.BirthTime
		ReportDischarge.RecordTarget.PatientRole.Patient.BirthTime birthTime = new ReportDischarge.RecordTarget.PatientRole.Patient.BirthTime();
		// birthTime.setValue(value); // TODO Fecha de Nacimiento
		patient.setBirthTime(birthTime);

		return patient;
	}

	/**
	 * @return
	 */
	private ReportDischarge.Author authorFactory() {
		ReportDischarge.Author author = new ReportDischarge.Author();

		// Setting: ReportDischarge.Author.Time
		ReportDischarge.Author.Time time = new ReportDischarge.Author.Time();
		// time.setValue(value); // TODO Fecha de creacion del documento
		author.setTime(time);

		ReportDischarge.Author.AssignedAuthor assignedAuthor = new ReportDischarge.Author.AssignedAuthor();

		// Setting: ReportDischarge.Author.AssignedAuthor.Id
		ReportDischarge.Author.AssignedAuthor.Id doctor = new ReportDischarge.Author.AssignedAuthor.Id();
		// doctor.setRoot(value); // TODO Tipo de Matricula del Medico
		// doctor.setExtension(value); // TODO Número de Matricula del Medico
		assignedAuthor.setId(doctor);

		// Setting: ReportDischarge.Author.AssignedAuthor.Code
		ReportDischarge.Author.AssignedAuthor.Code specialty = new ReportDischarge.Author.AssignedAuthor.Code();
		// specialty.setCode(value); // TODO Codigo de Especialidad
		// specialty.setCodeSystem(value);
		// specialty.setDisplayName(value);
		assignedAuthor.setCode(specialty);

		// Setting: ReportDischarge.Author.AssignedAuthor.Telecom
		ReportDischarge.Author.AssignedAuthor.Telecom telecom = new ReportDischarge.Author.AssignedAuthor.Telecom();
		// telecom.setUse(value); // TODO ?????
		// telecom.setValue(value); // TODO Telefono
		assignedAuthor.setTelecom(telecom);

		// Setting: ReportDischarge.Author.AssignedAuthor.AssignedPerson
		assignedAuthor.setAssignedPerson(assignedPersonFactory());

		// Setting: ReportDischarge.Author.AssignedAuthor
		author.setAssignedAuthor(assignedAuthor);

		return author;
	}

	/**
	 * @return
	 */
	private ReportDischarge.Author.AssignedAuthor.AssignedPerson assignedPersonFactory() {
		ReportDischarge.Author.AssignedAuthor.AssignedPerson assignedPerson = new ReportDischarge.Author.AssignedAuthor.AssignedPerson();

		// Setting: ReportDischarge.Author.AssignedAuthor.AssignedPerson.Name
		ReportDischarge.Author.AssignedAuthor.AssignedPerson.Name name = new ReportDischarge.Author.AssignedAuthor.AssignedPerson.Name();
		// name.getFamily().add(value); // TODO Apellido
		// name.getFamily().add(value); // TODO Apellido segundo
		// name.getGiven().add(value); // TODO nombre
		// name.getGiven().add(value); // TODO nombre segundo
		assignedPerson.setName(name);

		return assignedPerson;
	}

	/**
	 * @return
	 */
	private ReportDischarge.Custodian custodianFactory() {
		ReportDischarge.Custodian custodian = new ReportDischarge.Custodian();
		ReportDischarge.Custodian.AssignedCustodian assignedCustodian = new ReportDischarge.Custodian.AssignedCustodian();
		ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization representedCustodianOrganization = new ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization();

		// Setting:
		// ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id
		ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id organization = new ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization.Id();
		organization.setRoot(ReportConstant.Providers.FLENI_CODE);
		representedCustodianOrganization.setId(organization);

		// Setting:
		// ReportDischarge.Custodian.AssignedCustodian.RepresentedCustodianOrganization
		assignedCustodian.setRepresentedCustodianOrganization(representedCustodianOrganization);

		// Setting: ReportDischarge.Custodian.AssignedCustodian
		custodian.setAssignedCustodian(assignedCustodian);

		return custodian;
	}

	/**
	 * @return
	 */
	private ReportDischarge.Participant participantFactory() {
		ReportDischarge.Participant participant = new ReportDischarge.Participant();

		// Setting: ReportDischarge.Participant.TypeCode
		// participant.setTypeCode(value); // TODO ?????

		ReportDischarge.Participant.AssociatedEntity associatedEntity = new ReportDischarge.Participant.AssociatedEntity();

		// Setting: ReportDischarge.Participant.AssociatedEntity.ClassCode
		// associatedEntity.setClassCode(value); // TODO ?????

		// Setting: ReportDischarge.Participant.AssociatedEntity.Id
		ReportDischarge.Participant.AssociatedEntity.Id partner = new ReportDischarge.Participant.AssociatedEntity.Id();
		// partner.setExtension(value); // TODO Número de Afiliado
		partner.setRoot(ReportConstant.Providers.FLENI_CODE + ReportConstant.Ids.AFFILIATE);
		associatedEntity.setId(partner);

		// Setting:
		// ReportDischarge.Participant.AssociatedEntity.AssociatedPerson
		ReportDischarge.Participant.AssociatedEntity.AssociatedPerson associatedPerson = new ReportDischarge.Participant.AssociatedEntity.AssociatedPerson();
		// associatedPerson.setName(value); // TODO Apellido y Nombres del
		// Titular
		associatedEntity.setAssociatedPerson(associatedPerson);

		// Setting:
		// ReportDischarge.Participant.AssociatedEntity.ScopingOrganization
		associatedEntity.setScopingOrganization(scopingOrganizationFactory());

		// Setting: ReportDischarge.Participant.AssociatedEntity
		participant.setAssociatedEntity(associatedEntity);

		return participant;
	}

	/**
	 * @return
	 */
	private ReportDischarge.Participant.AssociatedEntity.ScopingOrganization scopingOrganizationFactory() {
		ReportDischarge.Participant.AssociatedEntity.ScopingOrganization scopingOrganization = new ReportDischarge.Participant.AssociatedEntity.ScopingOrganization();

		// Setting:
		// ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id
		ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id healthPlan = new ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Id();
		// healthPlan.setExtension(value); // TODO Codigo Plan de Salud
		healthPlan.setRoot(ReportConstant.Providers.FLENI_CODE + ReportConstant.Ids.PLANS);
		scopingOrganization.setId(healthPlan);

		// Setting:
		// ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.Name
		// scopingOrganization.setName(value); // TODO Nombre del Plan

		ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf asOrganizationPartOf = new ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf();

		// Setting:
		// ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id
		ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id financer = new ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.Id();
		// financer.setRoot(value); // TODO Financiador
		asOrganizationPartOf.setId(financer);

		ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization wholeOrganization = new ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf.WholeOrganization();
		// wholeOrganization.setName(value); // TODO Nombre del Financiador
		asOrganizationPartOf.setWholeOrganization(wholeOrganization);

		// Setting:
		// ReportDischarge.Participant.AssociatedEntity.ScopingOrganization.AsOrganizationPartOf
		scopingOrganization.setAsOrganizationPartOf(asOrganizationPartOf);

		return scopingOrganization;
	}

	/**
	 * @return
	 */
	private ReportDischarge.DocumentationOf documentationOfFactory() {
		ReportDischarge.DocumentationOf documentationOf = new ReportDischarge.DocumentationOf();

		// Setting: ReportDischarge.DocumentationOf.TypeCode
		// documentationOf.setTypeCode(value); // TODO ?????

		ReportDischarge.DocumentationOf.ServiceEvent serviceEvent = new ReportDischarge.DocumentationOf.ServiceEvent();

		// Setting: ReportDischarge.DocumentationOf.ServiceEvent.ClassCode
		// serviceEvent.setClassCode(value); // TODO ?????

		// Setting: ReportDischarge.DocumentationOf.ServiceEvent.Code
		ReportDischarge.DocumentationOf.ServiceEvent.Code scopeEpisode = new ReportDischarge.DocumentationOf.ServiceEvent.Code();
		// scopeEpisode.setCode(value); // TODO Ambito del episodio
		// scopeEpisode.setCodeSystem(value);
		// scopeEpisode.setDisplayName(value);
		serviceEvent.setCode(scopeEpisode);

		// Setting: ReportDischarge.DocumentationOf.ServiceEvent
		documentationOf.setServiceEvent(serviceEvent);

		return documentationOf;
	}

	/**
	 * @return
	 */
	private ReportDischarge.ComponentOf componentOfFactory() {
		ReportDischarge.ComponentOf componentOf = new ReportDischarge.ComponentOf();
		ReportDischarge.ComponentOf.EncompassingEncounter encompassingEncounter = new ReportDischarge.ComponentOf.EncompassingEncounter();

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.Id
		ReportDischarge.ComponentOf.EncompassingEncounter.Id episodeNumber = new ReportDischarge.ComponentOf.EncompassingEncounter.Id();
		// episodeNumber.setExtension(value); // TODO Identificador unico del
		// Episodio
		episodeNumber.setRoot(ReportConstant.Providers.FLENI_CODE + ReportConstant.Ids.EPISODES);
		encompassingEncounter.setId(episodeNumber);

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.Code
		ReportDischarge.ComponentOf.EncompassingEncounter.Code episodeType = new ReportDischarge.ComponentOf.EncompassingEncounter.Code();
		// episodeType.setCode(value); // TODO Tipo de Episodio
		// episodeType.setCodeSystem(value);
		// episodeType.setCodeSystemName(value);
		// episodeType.setDisplayName(value);
		encompassingEncounter.setCode(episodeType);

		ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime effectiveTime = new ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime();

		// Setting:
		// ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.Low
		ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.Low low = new ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.Low();
		// low.setValue(value); // TODO Fecha de Ingreso
		effectiveTime.setLow(low);
		// Setting:
		// ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.High
		ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.High high = new ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime.High();
		// high.setValue(value); // TODO Fecha de Alta
		effectiveTime.setHigh(high);

		// Setting:
		// ReportDischarge.ComponentOf.EncompassingEncounter.EffectiveTime
		encompassingEncounter.setEffectiveTime(effectiveTime);

		// Setting:
		// ReportDischarge.ComponentOf.EncompassingEncounter.DischargeDispositionCode
		ReportDischarge.ComponentOf.EncompassingEncounter.DischargeDispositionCode dischargeDispositionCode = new ReportDischarge.ComponentOf.EncompassingEncounter.DischargeDispositionCode();
		// dischargeDispositionCode.setCode(value); // TODO Condicion de Egreso
		// dischargeDispositionCode.setCodeSystem(value);
		// dischargeDispositionCode.setCodeSystemName(value);
		// dischargeDispositionCode.setDisplayName(value);
		encompassingEncounter.setDischargeDispositionCode(dischargeDispositionCode);

		ReportDischarge.ComponentOf.EncompassingEncounter.Locations locations = new ReportDischarge.ComponentOf.EncompassingEncounter.Locations();
		ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility healthCareFacility = new ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility();

		// Setting:
		// ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Id
		ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Id altaLocation = new ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Id();
		// altaLocation.setExtension(value); // TODO Codigo Ubicacion al Alta
		// altaLocation.setRoot(value);
		healthCareFacility.setId(altaLocation);

		// Setting:
		// ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Location
		ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Location location = new ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility.Location();
		// location.setName(value); // TODO Descripcion de la Ubicacion al Alta
		healthCareFacility.setLocation(location);

		// Setting:
		// ReportDischarge.ComponentOf.EncompassingEncounter.Locations.HealthCareFacility
		locations.setHealthCareFacility(healthCareFacility);

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter.Locations
		encompassingEncounter.setLocation(locations);

		// Setting: ReportDischarge.ComponentOf.EncompassingEncounter
		componentOf.setEncompassingEncounter(encompassingEncounter);

		return componentOf;
	}

	/**
	 * @return
	 */
	private ReportDischarge.Components componentFactory() {
		ReportDischarge.Components components = new ReportDischarge.Components();
		ReportDischarge.Components.StructuredBody structuredBody = new ReportDischarge.Components.StructuredBody();

		ReportDischarge.Components.StructuredBody.Component component = new ReportDischarge.Components.StructuredBody.Component();
		ReportDischarge.Components.StructuredBody.Component.Section section = new ReportDischarge.Components.StructuredBody.Component.Section();

		// Setting:
		// ReportDischarge.Components.StructuredBody.Component.Section.TemplateId
		ReportDischarge.Components.StructuredBody.Component.Section.TemplateId template = new ReportDischarge.Components.StructuredBody.Component.Section.TemplateId();
		// template.setExtension(value); TODO Lista Plantillas de Secciones -
		// Ver si corresponde Crear todas las secciones por tipo de documento
		// tengan o no informacion
		// template.setRoot(value);
		section.setTemplateId(template);

		// Setting:
		// ReportDischarge.Components.StructuredBody.Component.Section.Code
		ReportDischarge.Components.StructuredBody.Component.Section.Code code = new ReportDischarge.Components.StructuredBody.Component.Section.Code();
		// code.setCode(value);
		// code.setCodeSystem(value);
		// code.setCodeSystemName(value);
		// code.setDisplayName(value);
		section.setCode(code);

		// Setting:
		// ReportDischarge.Components.StructuredBody.Component.Section.Text
		ReportDischarge.Components.StructuredBody.Component.Section.Text text = new ReportDischarge.Components.StructuredBody.Component.Section.Text();
		// text.setParagraph(value);
		section.setText(text);

		// Setting:
		// ReportDischarge.Components.StructuredBody.Component.Section.Title
		// section.setTitle(value);

		// TODO Text Ver como se completa (String)

		// Setting: ReportDischarge.Components.StructuredBody.Component.Section
		component.setSection(section);

		// Setting: ReportDischarge.Components.StructuredBody.Component
		structuredBody.getComponent().add(component);

		// Setting: ReportDischarge.Components.StructuredBody
		components.setStructuredBody(structuredBody);

		return components;
	}
}
