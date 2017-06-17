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
 * Table CODE_SYSTEM_GROUP
 */
@Entity
@Table(name = "CODE_SYSTEM_GROUP")
public class CodeSystemGroup implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2210671491693354855L;
	
	private Long id;
	private String codeSystem;
	private String description;
	private List<CodeSystem> codeSystems = new ArrayList<CodeSystem>();

	/**
	 * @return
	 */
	@Id
	@SequenceGenerator(name = "CODE_SYSTEM_GROUP_SEQ", sequenceName = "CODE_SYSTEM_GROUP_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CODE_SYSTEM_GROUP_SEQ")
	@Column(name = "CODE_SYSTEM_GROUP_KEY", unique = true, nullable = false, precision = 22, scale = 0)
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
	@Column(name = "CODE_SYSTEM", length = 50)
	public String getCodeSystem() {
		return this.codeSystem;
	}

	/**
	 * @param codeSystem
	 */
	public void setCodeSystem(String codeSystem) {
		this.codeSystem = codeSystem;
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
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "codeSystemGroup")
	public List<CodeSystem> getCodeSystems() {
		return this.codeSystems;
	}

	/**
	 * @param codeSystems
	 */
	public void setCodeSystems(List<CodeSystem> codeSystems) {
		this.codeSystems = codeSystems;
	}

}
