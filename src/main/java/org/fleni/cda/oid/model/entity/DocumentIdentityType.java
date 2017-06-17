package org.fleni.cda.oid.model.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name = "CONVERT_MASTER_TYPE_KEY")
@DiscriminatorValue(value = "DOCUMENT_IDENTITY_TYPE")
public class DocumentIdentityType extends ConvertMasterType {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8098351743541780811L;

	private static final String DISCRIMINATOR = "DOCUMENT_IDENTITY_TYPE";

	/**
	 * 
	 */
	public DocumentIdentityType() {
		setDiscriminator(DISCRIMINATOR);
	}
}
