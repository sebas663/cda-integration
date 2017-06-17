package org.fleni.cda.externalreport.model.entity;

import java.io.Serializable;
import java.util.Date;

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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Table EXTERNAL_REPORT_DATA
 */
@Entity
@Table(name = "EXTERNAL_REPORT_DATA")
public class ExternalReportData implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5060138411738199972L;

	private Long id;
	private ExternalReportInfo externalReportInfo;
	private byte[] messageJsonData;
	private byte[] messageCdaData;
	private Date creationDate;

	/**
	 * @return
	 */
	@Id
	@SequenceGenerator(name = "EXTERNAL_REPORT_DATA_SEQ", sequenceName = "EXTERNAL_REPORT_DATA_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "EXTERNAL_REPORT_DATA_SEQ")
	@Column(name = "EXTERNAL_REPORT_DATA_KEY", unique = true, nullable = false, precision = 22, scale = 0)
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
	@JoinColumn(name = "EXTERNAL_REPORT_INFO_KEY", nullable = false)
	public ExternalReportInfo getExternalReportInfo() {
		return this.externalReportInfo;
	}

	/**
	 * @param externalReportInfo
	 */
	public void setExternalReportInfo(ExternalReportInfo externalReportInfo) {
		this.externalReportInfo = externalReportInfo;
	}

	/**
	 * @return
	 */
	@Column(name = "MESSAGE_JSONDATA", nullable = false)
	public byte[] getMessageJsonData() {
		return this.messageJsonData;
	}

	/**
	 * @param messageJsonData
	 */
	public void setMessageJsonData(byte[] messageJsonData) {
		this.messageJsonData = messageJsonData;
	}

	/**
	 * @return
	 */
	@Column(name = "MESSAGE_CDADATA")
	public byte[] getMessageCdaData() {
		return this.messageCdaData;
	}

	/**
	 * @param messageCdaData
	 */
	public void setMessageCdaData(byte[] messageCdaData) {
		this.messageCdaData = messageCdaData;
	}

	/**
	 * @return
	 */
	@Temporal(TemporalType.DATE)
	@Column(name = "CREATION_DATE")
	public Date getCreationDate() {
		return this.creationDate;
	}

	/**
	 * @param creationDate
	 */
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

}
