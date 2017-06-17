package org.fleni.cda.common.xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component(value="ReportConstant")
public class ReportConstant {	
	
	public static String REALM_CODE;	
	public static String TYPE_ROOT;
	public static String TYPE_EXTENSION;	
	public static String LANGUAGE_CODE;
	public static String DEFAULT_ENCODING;
	
	/**
	 * @param realmCode the realmCode to set
	 */
	@Value("${realmCode.code}")
    private void setRealmCode(String realmCode) {
		REALM_CODE = realmCode;
    }
	
	/**
	 * @param typeRoot the typeRoot to set
	 */
	@Value("${typeId.root}")
	private void setTypeRoot(String typeRoot) {
		TYPE_ROOT = typeRoot;
    }
	
	/**
	 * @param typeExtension the typeExtension to set
	 */
	@Value("${typeId.extension}")
    private void setTypeExtension(String typeExtension) {
		TYPE_EXTENSION = typeExtension;
    }
	
	/**
	 * @param languageCode the languageCode to set
	 */
	@Value("${languageCode.code}")
	private void setLanguageCode(String languageCode) {
		LANGUAGE_CODE = languageCode;
    }
	
	/**
	 * @param defaultEncoding the defaultEncoding to set
	 */
	@Value("${default.encoding}")
	private void setDefaultEncoding(String defaultEncoding) {
		DEFAULT_ENCODING = defaultEncoding;
    }
	
	/**
	 *
	 */
	@Component("ReportConstant$ReportTemplate")
	public static class ReportTemplate {
				
		public static String GENERIC;		
		public static String DISCHARGE;
		public static String SURGICAL;
		public static String INCOME;
		public static String EVOLUTION;
		public static String INDICATION;
		public static String INFIRMARY;
		public static String PRE_ADMISSION;
		public static String ANATOMY_PATOLOGICA;
		public static String ANESTHESIA;
		public static String INFORMED_CONSENT;
		public static String LABORATORY;
		public static String PROCESS;
		public static String COVER;
		public static String MEDICAL_ORDER;
		public static String EXTENSION;

		/**
		 * @param generic the generic to set
		 */
		@Value("${templateId.root.generic}")
		private void setGeneric(String generic) {
			GENERIC = generic;
		}

		/**
		 * @param discharge the discharge to set
		 */
		@Value("${templateId.root.discharge}")
		private void setDischarge(String discharge) {
			DISCHARGE = discharge;
		}

		/**
		 * @param surgical the surgical to set
		 */
		@Value("${templateId.root.surgical}")
		private void setSurgical(String surgical) {
			SURGICAL = surgical;
		}

		/**
		 * @param income the income to set
		 */
		@Value("${templateId.root.income}")
		private void setIncome(String income) {
			INCOME = income;
		}

		/**
		 * @param evolution the evolution to set
		 */
		@Value("${templateId.root.evolution}")
		private void setEvolution(String evolution) {
			EVOLUTION = evolution;
		}

		/**
		 * @param indication the indication to set
		 */
		@Value("${templateId.root.indications}")
		private void setIndication(String indication) {
			INDICATION = indication;
		}

		/**
		 * @param infirmary the infirmary to set
		 */
		@Value("${templateId.root.infirmary}")
		private void setInfirmary(String infirmary) {
			INFIRMARY = infirmary;
		}

		/**
		 * @param preAdmission the preAdmission to set
		 */
		@Value("${templateId.root.preAdmission}")
		private void setPreAdmission(String preAdmission) {
			PRE_ADMISSION = preAdmission;
		}

		/**
		 * @param anatomyPatologica the anatomyPatologica to set
		 */
		@Value("${templateId.root.anatomyPatologica}")
		private void setAnatomyPatologica(String anatomyPatologica) {
			ANATOMY_PATOLOGICA = anatomyPatologica;
		}

		/**
		 * @param anesthesia the anesthesia to set
		 */
		@Value("${templateId.root.anesthesia}")
		private void setAnesthesia(String anesthesia) {
			ANESTHESIA = anesthesia;
		}

		/**
		 * @param informedConsent the informedConsent to set
		 */
		@Value("${templateId.root.informedConsent}")
		private void setInformedConsent(String informedConsent) {
			INFORMED_CONSENT = informedConsent;
		}

		/**
		 * @param laboratory the laboratory to set
		 */
		@Value("${templateId.root.laboratory}")
		private void setLaboratory(String laboratory) {
			LABORATORY = laboratory;
		}

		/**
		 * @param process the process to set
		 */
		@Value("${templateId.root.process}")
		private void setProcess(String process) {
			PROCESS = process;
		}

		/**
		 * @param cover the cover to set
		 */
		@Value("${templateId.root.cover}")
		private void setCover(String cover) {
			COVER = cover;
		}

		/**
		 * @param medicalOrder the medicalOrder to set
		 */
		@Value("${templateId.root.medicalOrder}")
		private void setMedicalOrder(String medicalOrder) {
			MEDICAL_ORDER = medicalOrder;
		}

		/**
		 * @param extension the extension to set
		 */
		@Value("${templateId.extension}")
		private void setExtension(String extension) {
			EXTENSION = extension;
		}

	}
	
	/**
	 *
	 */
	@Component("ReportConstant$ReportTitle")
	public static class ReportTitle {
				
		public static String DISCHARGE;
		public static String SURGICAL;
		public static String INCOME;
		public static String EVOLUTION;
		public static String INDICATION;
		public static String INFIRMARY;
		public static String PRE_ADMISSION;
		public static String ANATOMY_PATOLOGICA;
		public static String ANESTHESIA;
		public static String INFORMED_CONSENT;
		public static String LABORATORY;
		public static String PROCESS;
		public static String COVER;
		public static String MEDICAL_ORDER;
		public static String STUDY_IMAGES;

		/**
		 * @param discharge the discharge to set
		 */
		@Value("${title.discharge}")
		private void setDischarge(String discharge) {
			DISCHARGE = discharge;
		}

		/**
		 * @param surgical the surgical to set
		 */
		@Value("${title.surgical}")
		private void setSurgical(String surgical) {
			SURGICAL = surgical;
		}

		/**
		 * @param income the income to set
		 */
		@Value("${title.income}")
		private void setIncome(String income) {
			INCOME = income;
		}

		/**
		 * @param evolution the evolution to set
		 */
		@Value("${title.evolution}")
		private void setEvolution(String evolution) {
			EVOLUTION = evolution;
		}

		/**
		 * @param indication the indication to set
		 */
		@Value("${title.indications}")
		private void setIndication(String indication) {
			INDICATION = indication;
		}

		/**
		 * @param infirmary the infirmary to set
		 */
		@Value("${title.infirmary}")
		private void setInfirmary(String infirmary) {
			INFIRMARY = infirmary;
		}

		/**
		 * @param preAdmission the preAdmission to set
		 */
		@Value("${title.preAdmission}")
		private void setPreAdmission(String preAdmission) {
			PRE_ADMISSION = preAdmission;
		}

		/**
		 * @param anatomyPatologica the anatomyPatologica to set
		 */
		@Value("${title.anatomyPatologica}")
		private void setAnatomyPatologica(String anatomyPatologica) {
			ANATOMY_PATOLOGICA = anatomyPatologica;
		}

		/**
		 * @param anesthesia the anesthesia to set
		 */
		@Value("${title.anesthesia}")
		private void setAnesthesia(String anesthesia) {
			ANESTHESIA = anesthesia;
		}

		/**
		 * @param informedConsent the informedConsent to set
		 */
		@Value("${title.informedConsent}")
		private void setInformedConsent(String informedConsent) {
			INFORMED_CONSENT = informedConsent;
		}

		/**
		 * @param laboratory the laboratory to set
		 */
		@Value("${title.laboratory}")
		private void setLaboratory(String laboratory) {
			LABORATORY = laboratory;
		}

		/**
		 * @param process the process to set
		 */
		@Value("${title.process}")
		private void setProcess(String process) {
			PROCESS = process;
		}

		/**
		 * @param cover the cover to set
		 */
		@Value("${title.cover}")
		private void setCover(String cover) {
			COVER = cover;
		}

		/**
		 * @param medicalOrder the medicalOrder to set
		 */
		@Value("${title.medicalOrder}")
		private void setMedicalOrder(String medicalOrder) {
			MEDICAL_ORDER = medicalOrder;
		}
		/**
		 * @param studyImages the studyImages to set
		 */
		@Value("${title.studyImages}")
		private void setStudyImages(String studyImages) {
			STUDY_IMAGES = studyImages;
		}
	}
	
	/**
	 *
	 */
	@Component("ReportConstant$Providers")
	public static class Providers {
		
		public static String GENERIC_CODE;		
		public static String ALEMAN_CODE;
		public static String ITALIANO_CODE;
		public static String SUIZO_CODE;		
		public static String FLENI_CODE;
		public static String OTAMENDI_CODE;
		
		public static String GENERIC_DESC;		
		public static String ALEMAN_DESC;
		public static String ITALIANO_DESC;
		public static String SUIZO_DESC;		
		public static String FLENI_DESC;
		public static String OTAMENDI_DESC;

		/**
		 * @param generic the generic to set
		 */
		@Value("${providers.code.generic}")
		private void setGenericCode(String generic) {
			GENERIC_CODE = generic;
		}

		/**
		 * @param aleman the aleman to set
		 */
		@Value("${providers.code.aleman}")
		private void setAlemanCode(String aleman) {
			ALEMAN_CODE = aleman;
		}

		/**
		 * @param italiano the italiano to set
		 */
		@Value("${providers.code.italiano}")
		private void setItalianoCode(String italiano) {
			ITALIANO_CODE = italiano;
		}

		/**
		 * @param suizo the suizo to set
		 */
		@Value("${providers.code.suizo}")
		private void setSuizoCode(String suizo) {
			SUIZO_CODE = suizo;
		}

		/**
		 * @param fleni the fleni to set
		 */
		@Value("${providers.code.fleni}")
		private void setFleniCode(String fleni) {
			FLENI_CODE = fleni;
		}

		/**
		 * @param otamendi the otamendi to set
		 */
		@Value("${providers.code.otamendi}")
		private void setOtamendiCode(String otamendi) {
			OTAMENDI_CODE = otamendi;
		}	
		
		/**
		 * @param generic the generic to set
		 */
		@Value("${providers.description.generic}")
		private void setGenericDescription(String generic) {
			GENERIC_DESC = generic;
		}

		/**
		 * @param aleman the aleman to set
		 */
		@Value("${providers.description.aleman}")
		private void setAlemanDescription(String aleman) {
			ALEMAN_DESC = aleman;
		}

		/**
		 * @param italiano the italiano to set
		 */
		@Value("${providers.description.italiano}")
		private void setItalianoDescription(String italiano) {
			ITALIANO_DESC = italiano;
		}

		/**
		 * @param suizo the suizo to set
		 */
		@Value("${providers.description.suizo}")
		private void setSuizoDescription(String suizo) {
			SUIZO_DESC = suizo;
		}

		/**
		 * @param fleni the fleni to set
		 */
		@Value("${providers.description.fleni}")
		private void setFleniDescription(String fleni) {
			FLENI_DESC = fleni;
		}

		/**
		 * @param otamendi the otamendi to set
		 */
		@Value("${providers.description.otamendi}")
		private void setOtamendiDescription(String otamendi) {
			OTAMENDI_DESC = otamendi;
		}	
	}
	
	/**
	 *
	 */
	@Component("ReportConstant$Ids")
	public static class Ids {		
		
		public static String DOCUMENTS_GENERATED;		
		public static String SET_DOCUMENTS;
		public static String MEDICAL_RECORD;
		public static String SERVICES;
		public static String SECTIONS;
		public static String PLANS;
		public static String AFFILIATE;
		public static String EPISODES;

		/**
		 * @param documentsGenerated the documentsGenerated to set
		 */
		@Value("${id.root.documentsGenerated}")
		private void setDocumentsGenerated(String documentsGenerated) {
			DOCUMENTS_GENERATED = documentsGenerated;
		}

		/**
		 * @param setDocuments the setDocuments to set
		 */
		@Value("${id.root.setDocuments}")
		private void setSetDocuments(String setDocuments) {
			SET_DOCUMENTS = setDocuments;
		}

		/**
		 * @param medicalRecord the medicalRecord to set
		 */
		@Value("${id.root.medicalRecord}")
		private void setMedicalRecord(String medicalRecord) {
			MEDICAL_RECORD = medicalRecord;
		}

		/**
		 * @param services the services to set
		 */
		@Value("${id.root.services}")
		private void setServices(String services) {
			SERVICES = services;
		}

		/**
		 * @param sections the sections to set
		 */
		@Value("${id.root.sections}")
		private void setSections(String sections) {
			SECTIONS = sections;
		}

		/**
		 * @param plans the plans to set
		 */
		@Value("${id.root.plans}")
		private void setPlans(String plans) {
			PLANS = plans;
		}

		/**
		 * @param affiliate the affiliate to set
		 */
		@Value("${id.root.affiliate}")
		private void setAffiliate(String affiliate) {
			AFFILIATE = affiliate;
		}

		/**
		 * @param episodes the episodes to set
		 */
		@Value("${id.root.episodes}")
		private void setEpisodes(String episodes) {
			EPISODES = episodes;
		}

	}	
}
