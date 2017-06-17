package org.fleni.cda.oid.model.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "CONVERT_MASTER_TYPE_KEY")
@DiscriminatorValue(value = "MEDICAL_MATRICULATION_TYPE")
public class MedicalMatriculationType extends ConvertMasterType {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8098351743541780811L;

	private static final String DISCRIMINATOR = "MEDICAL_MATRICULATION_TYPE";

	/**
	 * 
	 */
	public MedicalMatriculationType() {
		setDiscriminator(DISCRIMINATOR);
	}
}
