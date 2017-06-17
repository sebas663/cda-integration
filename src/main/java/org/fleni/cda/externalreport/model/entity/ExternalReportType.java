package org.fleni.cda.externalreport.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Table EXTERNAL_REPORT_TYPE
 */
@Entity
@Table(name = "EXTERNAL_REPORT_TYPE")
@NamedQueries({
	@NamedQuery(name = "externalReportType.getAll", query = "SELECT OBJECT(a) FROM ExternalReportType a")})
public class ExternalReportType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8714195683386859018L;
	
	private Long id;
	private String externalReportName;
	private String externalReportClassFactory;

	/**
	 * @return
	 */
	@Id
	@SequenceGenerator(name = "EXTERNAL_REPORT_TYPE_SEQ", sequenceName = "EXTERNAL_REPORT_TYPE_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "EXTERNAL_REPORT_TYPE_SEQ")
	@Column(name = "EXTERNAL_REPORT_TYPE_KEY", unique = true, nullable = false, precision = 22, scale = 0)
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
	@Column(name = "EXTERNAL_REPORT_NAME", length = 50)
	public String getExternalReportName() {
		return this.externalReportName;
	}

	/**
	 * @param externalReportName
	 */
	public void setExternalReportName(String externalReportName) {
		this.externalReportName = externalReportName;
	}
	
	/**
	 * @return
	 */
	@Column(name = "EXTERNAL_REPORT_CLASS_FACTORY", length = 256)
	public String getExternalReportClassFactory() {
		return this.externalReportClassFactory;
	}

	/**
	 * @param externalReportClassFactory
	 */
	public void setExternalReportClassFactory(String externalReportClassFactory) {
		this.externalReportClassFactory = externalReportClassFactory;
	}

}
