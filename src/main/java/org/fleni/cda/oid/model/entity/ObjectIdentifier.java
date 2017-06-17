package org.fleni.cda.oid.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Table OBJECT_IDENTIFIER
 */
@Entity
@Table(name = "OBJECT_IDENTIFIER")
public class ObjectIdentifier implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5818346481659586593L;
	
	private Long id;
	private ObjectIdentifierGroup objectIdentifierGroup;
	private String oids;
	private String description;

	/**
	 * @return
	 */
	@Id
	@SequenceGenerator(name = "OBJECT_IDENTIFIER_SEQ", sequenceName = "OBJECT_IDENTIFIER_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "OBJECT_IDENTIFIER_SEQ")
	@Column(name = "OBJECT_IDENTIFIER_KEY", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getId() {
		return this.id;
	}

	/**
	 * @param id
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OBJECT_IDENTIFIER_GROUP_KEY", nullable = false)
	public ObjectIdentifierGroup getObjectIdentifierGroup() {
		return this.objectIdentifierGroup;
	}

	/**
	 * @param objectIdentifierGroup
	 */
	public void setObjectIdentifierGroup(
			ObjectIdentifierGroup objectIdentifierGroup) {
		this.objectIdentifierGroup = objectIdentifierGroup;
	}

	/**
	 * @return
	 */
	@Column(name = "OIDS", length = 50)
	public String getOids() {
		return this.oids;
	}

	/**
	 * @param oids
	 */
	public void setOids(String oids) {
		this.oids = oids;
	}

	/**
	 * @return
	 */
	@Column(name = "DESCRIPTION", length = 256)
	public String getDescription() {
		return this.description;
	}

	/**
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
