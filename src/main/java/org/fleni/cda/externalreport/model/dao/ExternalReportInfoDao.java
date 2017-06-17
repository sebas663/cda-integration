package org.fleni.cda.externalreport.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;

import org.fleni.cda.common.generic.model.dao.AbstractGenericDao;
import org.fleni.cda.common.utils.ParametricData;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;
import org.fleni.cda.externalreport.model.entity.QExternalReportInfo;
import org.fleni.cda.externalreport.model.entity.QExternalReportType;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mysema.query.jpa.impl.JPAQuery;

@Repository("externalReportInfoDao")
public class ExternalReportInfoDao extends AbstractGenericDao<ExternalReportInfo> implements IExternalReportInfoDao {

	/**
	 * 
	 */
	public ExternalReportInfoDao() {
		super(ExternalReportInfo.class);		
	}
//	/**
//	 * 
//	 */
//	@Value("${service.CDA.episodeTypesAlta}")
//	private  String episodeTypesAlta;
//	/**
//	 * 
//	 */
//	@Value("${service.CDA.episodeType}")
//	private  String episodeTypes;
	/**
	 * 
	 */
	@Value("${service.CDA.episodeTypeMinusH}")
	private  String episodeTypeMinusH;
//	/**
//	 * 
//	 */
//	private  List<String> lstEpisodeTypes;
//	/**
//	 * 
//	 */
//	private  List<String> lstEpisodeTypesAlta;
	/**
	 * 
	 */
	private  List<String> lstEpisodeTypeMinusH;
	
	/* (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportInfoDao#findExternalReportInfoByParameter(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Transactional(readOnly = true)
	@Override
	public ExternalReportInfo findExternalReportInfoByParameter(String reportId, String reportName, String nhc, String episodeNumber) {
		JPAQuery query = new JPAQuery(getEntityManager());
		QExternalReportInfo externalReportInfo = QExternalReportInfo.externalReportInfo;
		QExternalReportType externalReportType = QExternalReportType.externalReportType;				
		
		query.from(externalReportInfo);
		query.join(externalReportInfo.externalReportType(), externalReportType).fetch();
		query.where(externalReportType.externalReportName.eq(reportName));
		query.where(externalReportInfo.reportId.eq(reportId));
		query.where(externalReportInfo.nhc.eq(nhc));
		query.where(externalReportInfo.episodeNumber.eq(episodeNumber));
		return query.uniqueResult(externalReportInfo);
	}
	/**
	 * 
	 * @param reportId
	 * @param reportName
	 * @param nhc
	 * @param episodeNumber
	 * @param fromDate
	 * @param toDate
	 * @return
	 */
	private String buildWhere(String reportId, String reportName, String nhc, String episodeNumber, String fromDate,
			String toDate) {
		String w = "";
		Date from = null;
		Date to = null;
		String fromD = null;
		String toD = null;
		if (reportId != null && !reportId.equals("")) {
			w = " i.report_id = '" + reportId + "'";
		}
		if (nhc != null && !nhc.equals("")) {
			if (w.length() > 0) {
				w += " AND ";
			}
			w += " i.nhc = '" + nhc + "'";
		}
		if (episodeNumber != null && !episodeNumber.equals("")) {
			if (w.length() > 0) {
				w += " AND ";
			}
			w += " i.episode_number = '" + episodeNumber + "'";
		}
		try {
			String format = "dd/MM/yyyy hh:mm:ss";
			String formatOracle = "dd/MM/yyyy hh:mi:ss";
			SimpleDateFormat formatter = new SimpleDateFormat(format);
			if (fromDate != null && !fromDate.equals("")) {
				fromDate += " 00:00:00";
				from = formatter.parse(fromDate);
				fromD = formatter.format(from);
			}
			if (toDate != null && !toDate.equals("")) {
				toDate += " 23:59:59";
				to = formatter.parse(toDate);
				toD = formatter.format(to);
			}
			if (from != null && to != null) {
				if (w.length() > 0) {
					w += " AND ";
				}
				w += " i.report_date BETWEEN TO_DATE('" + fromD + "','" + formatOracle + "') "
					 + "AND TO_DATE('" + toD + "','" + formatOracle + "') ";
			}
			if (from != null && to == null) {
				if (w.length() > 0) {
					w += " AND ";
				}
				w += " i.report_date >= TO_DATE('" + fromD + "','" + formatOracle + "') ";
			}
			if (to != null && from == null) {
				if (w.length() > 0) {
					w += " AND ";
				}
				w += " i.report_date <= TO_DATE('" + toD + "','" + formatOracle + "') ";
			}
			if (reportName != null && !reportName.equals("")) {
				if (w.length() > 0) {
					w += " AND ";
				}
				Long key = ParametricData.MAP_EXTERNAL_REPORT_TYPE.get(reportName).getId();
				w += " i.external_report_type_key = " + key.toString();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return w;
	}
	/**
	 * 
	 * @param lst
	 */
	private List<ExternalReportInfo> removeTypeEpisodeInvalid(List<ExternalReportInfo> lst){
		List<ExternalReportInfo> lstResult = new ArrayList<ExternalReportInfo>(); 
//		lstEpisodeTypes = new ArrayList<>();
//		if(episodeTypes != null && !episodeTypes.equals("")){
//			StringTokenizer st =  new StringTokenizer(episodeTypes, ",");
//			while (st.hasMoreElements()) {
//				lstEpisodeTypes.add((String) st.nextElement());
//			}
//		}
//		lstEpisodeTypesAlta = new ArrayList<>();
//		if(episodeTypesAlta != null && !episodeTypesAlta.equals("")){
//			StringTokenizer st =  new StringTokenizer(episodeTypesAlta, ",");
//			while (st.hasMoreElements()) {
//				lstEpisodeTypesAlta.add((String) st.nextElement());
//			}
//		}
		lstEpisodeTypeMinusH = new ArrayList<>();
		if(episodeTypeMinusH != null && !episodeTypeMinusH.equals("")){
			StringTokenizer st =  new StringTokenizer(episodeTypeMinusH, ",");
			while (st.hasMoreElements()) {
				lstEpisodeTypeMinusH.add((String) st.nextElement());
			}
		}
		
		for(ExternalReportInfo i:lst){
			//Ingresan todos los episodios para los que siguen.
			if(i.getExternalReportType().getId().intValue() == 1){//EPICRISIS
				lstResult.add(i);
			}
			
			//No ingresan los H para los que siguen.
			if(i.getExternalReportType().getId().intValue() == 8){//INFORME DE ESTUDIO AP
				if(!lstEpisodeTypeMinusH.contains(i.getTypeEpisode())){
					lstResult.add(i);
				}
			}
			if(i.getExternalReportType().getId().intValue() == 13){//INFORME DE ESTUDIO IMAGENES
				if(!lstEpisodeTypeMinusH.contains(i.getTypeEpisode())){
					lstResult.add(i);
				}
			}
			if(i.getExternalReportType().getId().intValue() == 11){//INFORME DE ESTUDIO LABORATORIO
				if(!lstEpisodeTypeMinusH.contains(i.getTypeEpisode())){
					lstResult.add(i);
				}
			}
		}
		return lstResult;
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportInfoDao#findAllExternalReportInfoByCdaDataNull()
	 */
	@SuppressWarnings("deprecation")
	@Transactional(readOnly = true)
	@Override
	public List<ExternalReportInfo> findAllExternalReportInfoByCdaDataNull() {
		Map<Long,ExternalReportInfo> map = new HashMap<Long,ExternalReportInfo>();
		String qlStringInfo = " SELECT * FROM external_report_info t INNER JOIN external_report_data r "
				 		+ " ON t.external_report_info_key = r.external_report_info_key where message_cdadata IS NULL and rownum <= 1000 ";
		String qlStringData = " select * from EXTERNAL_REPORT_DATA  where  external_report_info_key IN (";
		Connection conn  = null;
		Statement stmt = null;
		List<ExternalReportInfo> lst = null;
		String keys = "";
		try {
			Session sess    = getHibernateSession();
			conn  = sess.connection();
			stmt = conn.createStatement();
			ResultSet rsInfo    = stmt.executeQuery(qlStringInfo);
			if(rsInfo != null){
				rsInfo.setFetchSize(1000); 
				while (rsInfo.next()) {
					ExternalReportInfo info = new ExternalReportInfo();
					Long infoKey= new Long((rsInfo.getInt("EXTERNAL_REPORT_INFO_KEY") != 0) ? rsInfo.getInt("EXTERNAL_REPORT_INFO_KEY") : -1);
					info.setId(infoKey);
					Long typeKey= new Long((rsInfo.getInt("EXTERNAL_REPORT_TYPE_KEY") != 0) ? rsInfo.getInt("EXTERNAL_REPORT_TYPE_KEY") : -1);
					info.setExternalReportType(ParametricData.MAP_EXTERNAL_REPORT_TYPE_BY_KEY.get(typeKey));
				    map.put(infoKey, info);
				    keys += infoKey.toString() + ",";
				}
				rsInfo.close();
				if(keys.length() > 0 ){
					keys = keys.substring(0,keys.length()-1);
					qlStringData += keys + ")";
					ResultSet rsData    = stmt.executeQuery(qlStringData);
		//			System.out.println("getFetchSize rsData  " + rsData.getFetchSize());
					rsData.setFetchSize(1000);
					while (rsData.next()) {
						ExternalReportData data = new ExternalReportData();
						Long key= new Long((rsData.getInt("EXTERNAL_REPORT_DATA_KEY") != 0) ? rsData.getInt("EXTERNAL_REPORT_DATA_KEY") : -1);
						data.setId(key);
						Long infoKey= new Long((rsData.getInt("EXTERNAL_REPORT_INFO_KEY") != 0) ? rsData.getInt("EXTERNAL_REPORT_INFO_KEY") : -1);
						data.setExternalReportInfo(map.get(infoKey));
						data.setCreationDate(rsData.getDate("CREATION_DATE"));
						data.setMessageJsonData(rsData.getBytes("MESSAGE_JSONDATA"));
						map.get(infoKey).getExternalReportDatas().add(data);
					}
					lst = new ArrayList<ExternalReportInfo>(map.values());
					rsData.close();
				}
			}
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(conn != null){
					conn.close();	
				}
				if(stmt != null){
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(lst==null)
			lst = new ArrayList<>();
		return lst;
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportInfoDao#insertNative(org.fleni.cda.externalreport.model.entity.ExternalReportInfo)
	 */
	@SuppressWarnings("deprecation")
	@Transactional(readOnly = false)
	@Override
	public void insertNative(ExternalReportInfo externalReportInfo) {
		String query =  " Insert into EXTERNAL_REPORT_INFO "
					   +"  (EXTERNAL_REPORT_INFO_KEY, EXTERNAL_REPORT_TYPE_KEY, REPORT_ID, REPORT_DATE, REPORT_VERSION, REPORT_ORIGINAL_ID,NHC, EPISODE_NUMBER, CREATION_DATE, EPISODE_TYPE) "
					   +" Values "
					   +"  (?,?,?,?,?,?,?,?,?,?)";
		Connection conn = null;
		PreparedStatement ps = null;
		PreparedStatement psid = null;
		try {
			Session sess = getHibernateSession();
			conn = sess.connection();
			psid = conn.prepareStatement("SELECT EXTERNAL_REPORT_INFO_SEQ.nextVal FROM dual");
			ResultSet rs = psid.executeQuery();
			if (null != rs && rs.next()) {
			    Long primaryKey = rs.getLong(1);
			    externalReportInfo.setId(primaryKey);
				ps = conn.prepareStatement(query);
				ps.setInt(1, primaryKey.intValue());
				ps.setInt(2,externalReportInfo.getExternalReportType().getId().intValue());
				ps.setString(3,externalReportInfo.getReportId());
				ps.setDate(4,new java.sql.Date(externalReportInfo.getReportDate().getTime()));
				ps.setInt(5,externalReportInfo.getReportVersion() != null ? externalReportInfo.getReportVersion().intValue() : 1);
				ps.setString(6,externalReportInfo.getReportOriginalId());
				ps.setString(7,externalReportInfo.getNhc());
				ps.setString(8,externalReportInfo.getEpisodeNumber());
				ps.setDate(9, new java.sql.Date(externalReportInfo.getCreationDate().getTime()));
				ps.setString(10,externalReportInfo.getTypeEpisode());
				ps.executeUpdate();
			}
			conn.close();
			psid.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null) {
					conn.close();
				}
				if (psid != null) {
					psid.close();
				}
				if (ps != null) {
					ps.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void mergeNative(ExternalReportInfo externalReportInfo) {
		// TODO Auto-generated method stub
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportInfoDao#findAllExternalReportInfoByCdaDataNull()
	 */
	@SuppressWarnings("deprecation")
	@Transactional(readOnly = true)
	@Override
	public List<ExternalReportInfo> findListExternalReportInfoByParameter(String reportId, String reportName,
			String nhc, String episodeNumber, String fromDate, String toDate) {
		Map<Long,ExternalReportInfo> map = new HashMap<Long,ExternalReportInfo>();
		String qlStringInfo = " SELECT i.external_report_info_key, i.report_id, i.external_report_type_key,i.episode_type,i.report_date,"
				+ " d.external_report_data_key, d.message_jsondata, d.message_cdadata "
				+ " FROM external_report_info i INNER JOIN external_report_data d "
				+ " ON i.external_report_info_key = d.external_report_info_key ";
		Connection conn  = null;
		Statement stmt = null;
//		PreparedStatement stmt = null;
		List<ExternalReportInfo> lst = null;
		try {
			qlStringInfo += " AND ";
			String where =  buildWhere(reportId,reportName,nhc,episodeNumber,fromDate,toDate);
			qlStringInfo += where;
			
			Session sess    = getHibernateSession();
			conn  = sess.connection();
			
			stmt = conn.createStatement();
			ResultSet rs    = stmt.executeQuery(qlStringInfo);
			
//			stmt = conn.prepareStatement(qlStringInfo);
//			ResultSet rs = stmt.executeQuery();
			
			if(rs != null){
				ExternalReportInfo info = null;
				rs.setFetchSize(200); 
				while (rs.next()) {
					Long infoKey= new Long((rs.getInt(1) != 0) ? rs.getInt(1) : -1);
					info = map.get(infoKey);
					if(info == null){
						info = new ExternalReportInfo();
						info.setId(infoKey);
						info.setReportId(rs.getString(2));
						Long typeKey= new Long((rs.getInt(3) != 0) ? rs.getInt(3) : -1);
						info.setExternalReportType(ParametricData.MAP_EXTERNAL_REPORT_TYPE_BY_KEY.get(typeKey));
						info.setTypeEpisode(rs.getString(4));
						info.setReportDate(rs.getDate(5));
						map.put(infoKey, info);
					}
					List<ExternalReportData> dataList = info.getExternalReportDatas();
	                if(dataList == null) {
	                	dataList = new ArrayList<>();
	                	info.setExternalReportDatas(dataList);
	                }
	                ExternalReportData data = new ExternalReportData();
	                data.setId(new Long((rs.getInt(6) != 0) ? rs.getInt(6) : -1));
	                data.setMessageJsonData(rs.getBytes(7));
	                data.setMessageCdaData(rs.getBytes(8));
	                dataList.add(data);
				}
				rs.close();
			}
			conn.close();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			try {
				if(conn != null){
					conn.close();	
				}
				if(stmt != null){
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		lst = new ArrayList<>(map.values());
		lst = removeTypeEpisodeInvalid(lst);
		return lst;
	}

}
