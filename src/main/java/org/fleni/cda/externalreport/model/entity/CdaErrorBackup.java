package org.fleni.cda.externalreport.model.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
/**
 *  CDA_ERROR_BACKUP
 */
@Entity
@Table(name = "CDA_ERROR_BACKUP")
public class CdaErrorBackup implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2880841521309027183L;
	private Long id;
	private byte[] messageCdaData;
	private Long status;
	/**
	 * @return the id
	 */
	@Id
	@SequenceGenerator(name = "CDA_ERROR_BACKUP_SEQ", sequenceName = "CDA_ERROR_BACKUP_SEQ")
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "CDA_ERROR_BACKUP_SEQ")
	@Column(name = "CDA_ERROR_BACKUP_KEY", unique = true, nullable = false, precision = 22, scale = 0)
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the messageCdaData
	 */
	@Column(name = "MESSAGE_CDADATA")
	public byte[] getMessageCdaData() {
		return messageCdaData;
	}
	/**
	 * @param messageCdaData the messageCdaData to set
	 */
	public void setMessageCdaData(byte[] messageCdaData) {
		this.messageCdaData = messageCdaData;
	}
	/**
	 * @return the status
	 */
	@Column(name = "STATUS")
	public Long getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Long status) {
		this.status = status;
	}
	
}
