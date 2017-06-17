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
 * Table CODE_SYSTEM
 */
@Entity
@Table(name = "CODE_SYSTEM")
public class CodeSystem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 302771510609425503L;
	
	private Long id;
	private CodeSystemGroup codeSystemGroup;
	private String code;
	private String displayName;
	private String codeSystem;

	/**
	 * @return
	 */
	@Id
	@SequenceGenerator(name = "CODE_SYSTEM_SEQ", sequenceName = "CODE_SYSTEM_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CODE_SYSTEM_SEQ")
	@Column(name = "CODE_SYSTEM_KEY", unique = true, nullable = false, precision = 22, scale = 0)
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
	@JoinColumn(name = "CODE_SYSTEM_GROUP_KEY", nullable = false)
	public CodeSystemGroup getCodeSystemGroup() {
		return this.codeSystemGroup;
	}

	/**
	 * @param codeSystemGroup
	 */
	public void setCodeSystemGroup(CodeSystemGroup codeSystemGroup) {
		this.codeSystemGroup = codeSystemGroup;
	}

	/**
	 * @return
	 */
	@Column(name = "CODE", length = 50)
	public String getCode() {
		return this.code;
	}

	/**
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return
	 */
	@Column(name = "DISPLAY_NAME", length = 256)
	public String getDisplayName() {
		return this.displayName;
	}

	/**
	 * @param displayName
	 */
	public void setDisplayName(String displayName) {
		this.displayName = displayName;
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

}
