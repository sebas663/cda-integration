package org.fleni.cda.externalreport.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.fleni.cda.common.generic.model.dao.AbstractGenericDao;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository("externalReportDataDao")
public class ExternalReportDataDao extends AbstractGenericDao<ExternalReportData> implements IExternalReportDataDao {

	/**
	 * @param entityClass
	 */
	public ExternalReportDataDao() {
		// TODO Auto-generated constructor stub
		super(ExternalReportData.class);		
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportDataDao#persistNative(byte[], java.lang.Long)
	 */
	@SuppressWarnings("deprecation")
	@Transactional(readOnly = false)
	@Override
	public void mergeNative(byte[] messageCdaData,Long key) {
		String query = " UPDATE  EXTERNAL_REPORT_DATA SET MESSAGE_CDADATA = ? where EXTERNAL_REPORT_DATA_KEY = ? ";
		Connection conn  = null;
		PreparedStatement ps = null;
		try {
			Session sess    = getHibernateSession();
			conn  = sess.connection();
			ps = conn.prepareStatement(query);
			ps.setBytes(1, messageCdaData);
			ps.setInt(2, key.intValue());
			ps.executeUpdate();
			conn.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(conn != null){
					conn.close();	
				}
				if(ps != null){
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportDataDao#
	 * insertNative(byte[], java.lang.Long)
	 */
	@SuppressWarnings("deprecation")
	@Transactional(readOnly = false)
	@Override
	public void insertNative(ExternalReportData externalReportData) {
		String query = " Insert into EXTERNAL_REPORT_DATA "
				+ " (EXTERNAL_REPORT_DATA_KEY, EXTERNAL_REPORT_INFO_KEY, MESSAGE_JSONDATA, MESSAGE_CDADATA, CREATION_DATE) "
				+ " Values " + " (EXTERNAL_REPORT_DATA_SEQ.nextVal,?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			Session sess = getHibernateSession();
			conn = sess.connection();
			ps = conn.prepareStatement(query);
			ps.setInt(1, externalReportData.getExternalReportInfo().getId().intValue());
			ps.setBytes(2, externalReportData.getMessageJsonData() != null ? externalReportData.getMessageJsonData()
					: "{'message':'no json data'}".getBytes());
			ps.setBytes(3, externalReportData.getMessageCdaData());
			ps.setDate(4, new java.sql.Date(externalReportData.getCreationDate().getTime()));
			ps.executeUpdate();
			conn.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
