package org.fleni.cda.externalreport.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import org.fleni.cda.common.generic.model.dao.IGenericDao;
import org.fleni.cda.common.generic.model.service.AbstractGenericService;
import org.fleni.cda.common.xml.ReportConstant;
import org.fleni.cda.externalreport.model.dao.IExternalReportInfoDao;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("externalReportInfoService")
public class ExternalReportInfoService extends AbstractGenericService<ExternalReportInfo> implements IExternalReportInfoService {

	@Autowired
	private IExternalReportInfoDao externalReportInfoDao;
	
	@Value("${service.CDA.episodeType}")
	private  String episodeTypes;
	
	private  List<String> lstEpisodeTypes;
	
	{
		lstEpisodeTypes = new ArrayList<>();
		if(episodeTypes != null && !episodeTypes.equals("")){
			StringTokenizer st =  new StringTokenizer(episodeTypes, ",");
			while (st.hasMoreElements()) {
				lstEpisodeTypes.add((String) st.nextElement());
			}
		}
	}
	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.service.IGenericService#getDao()
	 */
	@Override
	public IGenericDao<ExternalReportInfo> getDao() {
		// TODO Auto-generated method stub
		return externalReportInfoDao;
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.service.IGenericService#setDao(org.fleni.cda.common.generic.model.dao.IGenericDao)
	 */
	@Override
	public void setDao(IGenericDao<ExternalReportInfo> dao) {
		// TODO Auto-generated method stub
		externalReportInfoDao = (IExternalReportInfoDao) dao;
	}
	
	/* (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportInfoDao#findExternalReportInfoByParameter(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public ExternalReportInfo findExternalReportInfoByParameter(String reportId, String reportName, String nhc, String episodeNumber) {
		// TODO Auto-generated method stub
		return externalReportInfoDao.findExternalReportInfoByParameter(reportId, reportName, nhc, episodeNumber);
	}
	
	/* (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportInfoDao#findExternalReportInfoByParameter(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public List<ExternalReportInfo> findListExternalReportInfoByParameter(String reportId, String reportName, String nhc, String episodeNumber, String sinseDate, String untilDate) {
		// TODO Auto-generated method stub
		return externalReportInfoDao.findListExternalReportInfoByParameter(reportId, reportName, nhc, episodeNumber,sinseDate,untilDate);
	}	
	
	/* (non-Javadoc)
	 * @see org.fleni.cda.common.generic.model.service.IGenericService#createOrUpdate(java.lang.Object)
	 */
	@Override
	public ExternalReportInfo createOrUpdate(ExternalReportInfo externalReportInfo) {
		// TODO Auto-generated method stub
		if (externalReportInfo.getId() == null) {
			return externalReportInfoDao.persist(externalReportInfo);
		} else {
			return externalReportInfoDao.merge(externalReportInfo);
		}		
	}

	/* (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.service.IExternalReportInfoService#findDocumentXmlCdaData(org.fleni.cda.externalreport.model.entity.ExternalReportInfo)
	 */
	@Override
	public List<String> findDocumentXmlCdaData(ExternalReportInfo externalReportInfo) throws Exception {
		// TODO Auto-generated method stub
		List<String> messageXmlDatas = new ArrayList<String>();
		for (ExternalReportData externalReportData : externalReportInfo.getExternalReportDatas()){
			messageXmlDatas.add(new String(externalReportData.getMessageCdaData(), ReportConstant.DEFAULT_ENCODING));
		}
		
		return messageXmlDatas;
	}

	@Override
	public List<ExternalReportInfo> findAllExternalReportInfoByCdaDataNull() {
		// TODO Auto-generated method stub
		return externalReportInfoDao.findAllExternalReportInfoByCdaDataNull();
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.service.IExternalReportInfoService#createOrUpdateNative(org.fleni.cda.externalreport.model.entity.ExternalReportInfo)
	 */
	@Override
	public void createOrUpdateNative(ExternalReportInfo externalReportInfo) {
		if (externalReportInfo.getId() == null) {
			this.insertNative(externalReportInfo);
		} else {
			this.mergeNative(externalReportInfo);
		}
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportInfoDao#insertNative(org.fleni.cda.externalreport.model.entity.ExternalReportInfo)
	 */
	@Override
	public void insertNative(ExternalReportInfo externalReportInfo) {
		externalReportInfoDao.insertNative(externalReportInfo);
	}
	/*
	 * (non-Javadoc)
	 * @see org.fleni.cda.externalreport.model.dao.IExternalReportInfoDao#mergeNative(org.fleni.cda.externalreport.model.entity.ExternalReportInfo)
	 */
	@Override
	public void mergeNative(ExternalReportInfo externalReportInfo) {
		externalReportInfoDao.merge(externalReportInfo);
	}

	/**
	 * @return the episodeTypes
	 */
	public String getEpisodeTypes() {
		return episodeTypes;
	}

	/**
	 * @param episodeTypes the episodeTypes to set
	 */
	public void setEpisodeTypes(String episodeTypes) {
		this.episodeTypes = episodeTypes;
	}
	
}
	