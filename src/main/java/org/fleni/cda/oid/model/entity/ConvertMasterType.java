package org.fleni.cda.oid.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Table CONVERT_MASTER_TYPE
 */
@Entity
@Table(name = "CONVERT_MASTER_TYPE")
@Inheritance (strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn (discriminatorType = DiscriminatorType.STRING, name = "DISCRIMINATOR")
public class ConvertMasterType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6749822063607857259L;
	
	private Long id;
	private CodeSystem codeSystem;
	private ObjectIdentifier objectIdentifier;
	private String discriminator;
	private String typeMasterSystemExternal;
	private String nameSystemExternal;

	/**
	 * @return
	 */
	@Id
	@SequenceGenerator(name = "CONVERT_MASTER_TYPE_SEQ", sequenceName = "CONVERT_MASTER_TYPE_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CONVERT_MASTER_TYPE_SEQ")
	@Column(name = "CONVERT_MASTER_TYPE_KEY", unique = true, nullable = false, precision = 22, scale = 0)
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
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CODE_SYSTEM_KEY")
	public CodeSystem getCodeSystem() {
		return this.codeSystem;
	}

	/**
	 * @param codeSystem
	 */
	public void setCodeSystem(CodeSystem codeSystem) {
		this.codeSystem = codeSystem;
	}

	/**
	 * @return
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "OBJECT_IDENTIFIER_KEY")
	public ObjectIdentifier getObjectIdentifier() {
		return this.objectIdentifier;
	}

	/**
	 * @param objectIdentifier
	 */
	public void setObjectIdentifier(ObjectIdentifier objectIdentifier) {
		this.objectIdentifier = objectIdentifier;
	}

	/**
	 * @return
	 */
	@Column(name = "DISCRIMINATOR", nullable = false, length = 50, insertable = false, updatable = false)
	public String getDiscriminator() {
		return this.discriminator;
	}

	/**
	 * @param discriminator
	 */
	public void setDiscriminator(String discriminator) {
		this.discriminator = discriminator;
	}

	/**
	 * @return
	 */
	@Column(name = "TYPE_MASTER_SYSTEM_EXTERNAL", nullable = false, length = 50)
	public String getTypeMasterSystemExternal() {
		return this.typeMasterSystemExternal;
	}

	/**
	 * @param typeMasterSystemExternal
	 */
	public void setTypeMasterSystemExternal(String typeMasterSystemExternal) {
		this.typeMasterSystemExternal = typeMasterSystemExternal;
	}

	/**
	 * @return
	 */
	@Column(name = "NAME_SYSTEM_EXTERNAL", nullable = false, length = 50)
	public String getNameSystemExternal() {
		return this.nameSystemExternal;
	}

	/**
	 * @param nameSystemExternal
	 */
	public void setNameSystemExternal(String nameSystemExternal) {
		this.nameSystemExternal = nameSystemExternal;
	}

}
