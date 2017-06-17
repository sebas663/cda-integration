package org.fleni.cda.externalreport.model.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *  Table EXTERNAL_REPORT_INFO
 */
@Entity
@Table(name = "EXTERNAL_REPORT_INFO")
public class ExternalReportInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4612697173877047268L;
	
	private Long id;
	private ExternalReportType externalReportType;
	private String reportId;
	private Date reportDate;
	private Long reportVersion;
	private String reportOriginalId;
	private String nhc;
	private String episodeNumber;
	private String typeEpisode;
	private Date creationDate;
	private List<ExternalReportData> externalReportDatas = new ArrayList<ExternalReportData>();

	/**
	 * @return
	 */
	@Id
	@SequenceGenerator(name = "EXTERNAL_REPORT_INFO_SEQ", sequenceName = "EXTERNAL_REPORT_INFO_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "EXTERNAL_REPORT_INFO_SEQ")
	@Column(name = "EXTERNAL_REPORT_INFO_KEY", unique = true, nullable = false, precision = 22, scale = 0)
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
	@JoinColumn(name = "EXTERNAL_REPORT_TYPE_KEY", nullable = false)
	public ExternalReportType getExternalReportType() {
		return this.externalReportType;
	}

	/**
	 * @param externalReportType
	 */
	public void setExternalReportType(ExternalReportType externalReportType) {
		this.externalReportType = externalReportType;
	}

	/**
	 * @return
	 */
	@Column(name = "REPORT_ID", nullable = false, length = 50)
	public String getReportId() {
		return this.reportId;
	}

	/**
	 * @param reportId
	 */
	public void setReportId(String reportId) {
		this.reportId = reportId;
	}

	/**
	 * @return
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "REPORT_DATE", length = 7)
	public Date getReportDate() {
		return this.reportDate;
	}

	/**
	 * @param reportDate
	 */
	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	/**
	 * @return
	 */
	@Column(name = "REPORT_VERSION", precision = 22, scale = 0)
	public Long getReportVersion() {
		return this.reportVersion;
	}

	/**
	 * @param reportVersion
	 */
	public void setReportVersion(Long reportVersion) {
		this.reportVersion = reportVersion;
	}

	/**
	 * @return
	 */
	@Column(name = "REPORT_ORIGINAL_ID", length = 50)
	public String getReportOriginalId() {
		return this.reportOriginalId;
	}

	/**
	 * @param reportOriginalId
	 */
	public void setReportOriginalId(String reportOriginalId) {
		this.reportOriginalId = reportOriginalId;
	}

	/**
	 * @return
	 */
	@Column(name = "NHC", length = 50)
	public String getNhc() {
		return this.nhc;
	}

	/**
	 * @param nhc
	 */
	public void setNhc(String nhc) {
		this.nhc = nhc;
	}

	/**
	 * @return
	 */
	@Column(name = "EPISODE_NUMBER", length = 50)
	public String getEpisodeNumber() {
		return this.episodeNumber;
	}

	/**
	 * @param episodeNumber
	 */
	public void setEpisodeNumber(String episodeNumber) {
		this.episodeNumber = episodeNumber;
	}
	
	/**
	 * @return the typeEpisode
	 */
	@Column(name = "EPISODE_TYPE", length = 32)
	public String getTypeEpisode() {
		return typeEpisode;
	}

	/**
	 * @param typeEpisode the typeEpisode to set
	 */
	public void setTypeEpisode(String typeEpisode) {
		this.typeEpisode = typeEpisode;
	}

	/**
	 * @return
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATION_DATE", length = 7)
	public Date getCreationDate() {
		return this.creationDate;
	}

	/**
	 * @param creationDate
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	/**
	 * @return
	 */
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "externalReportInfo")
	public List<ExternalReportData> getExternalReportDatas() {
		return this.externalReportDatas;
	}

	/**
	 * @param externalReportDatas
	 */
	public void setExternalReportDatas(List<ExternalReportData> externalReportDatas) {
		this.externalReportDatas = externalReportDatas;
	}

}
