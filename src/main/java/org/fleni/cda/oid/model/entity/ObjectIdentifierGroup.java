package org.fleni.cda.oid.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Table OBJECT_IDENTIFIER_GROUP
 */
@Entity
@Table(name = "OBJECT_IDENTIFIER_GROUP")
public class ObjectIdentifierGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2571150972488452710L;
	
	private Long id;
	private String oids;
	private String description;
	private List<ObjectIdentifier> objectIdentifiers = new ArrayList<ObjectIdentifier>();

	/**
	 * @return
	 */
	@Id
	@SequenceGenerator(name = "OBJECT_IDENTIFIER_GROUP_SEQ", sequenceName = "OBJECT_IDENTIFIER_GROUP_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "OBJECT_IDENTIFIER_GROUP_SEQ")
	@Column(name = "OBJECT_IDENTIFIER_GROUP_KEY", unique = true, nullable = false, precision = 22, scale = 0)
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

	/**
	 * @return
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "objectIdentifierGroup")
	public List<ObjectIdentifier> getObjectIdentifiers() {
		return this.objectIdentifiers;
	}

	/**
	 * @param objectIdentifiers
	 */
	public void setObjectIdentifiers(List<ObjectIdentifier> objectIdentifiers) {
		this.objectIdentifiers = objectIdentifiers;
	}

}
