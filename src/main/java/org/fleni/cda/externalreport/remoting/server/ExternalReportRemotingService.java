package org.fleni.cda.externalreport.remoting.server;

import org.fleni.cda.common.remoting.IntegrationResponseCode;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;
import org.fleni.cda.externalreport.model.service.IExternalReportDataService;
import org.fleni.cda.externalreport.model.service.IExternalReportInfoService;
import org.fleni.cda.externalreport.model.service.IExternalReportTypeService;
import org.fleni.cda.externalreport.remoting.dto.ExternalReportInformation;
import org.fleni.cda.externalreport.remoting.dto.ExternalReportResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//EndPoint : http://localhost:8080/cda-mais-integration/ws/ExternalReportRemotingService?wsdl

@Service("externalReportRemotingService")
public class ExternalReportRemotingService implements IExternalReportRemotingService {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ExternalReportRemotingService.class);
	
	@Autowired
	private IExternalReportInfoService externalReportInfoService;
	@Autowired
	private IExternalReportDataService externalReportDataService;
	@Autowired
	private IExternalReportTypeService externalReportTypeService;

	/* (non-Javadoc)
	 * @see org.fleni.cda.externalreport.remoting.server.IExternalReportRemotingService#createReportInformation(org.fleni.cda.externalreport.remoting.dto.ExternalReportInformation)
	 */
	@Override
	public ExternalReportResponse createReportInformation(ExternalReportInformation externalReportInformation) {
		// TODO Auto-generated method stub
		ExternalReportInfo externalReportInfo;		
		Integer response = validateInformation(externalReportInformation);	
		boolean isFirstTime = externalReportInformation.isFirstTime();
		if (response == 0) {
			try {
				if(isFirstTime){
					externalReportInfo = createExternalReportInfo(externalReportInformation);
				}else{
					externalReportInfo = findExternalReportInfo(externalReportInformation);
					if (externalReportInfo == null) {
						externalReportInfo = createExternalReportInfo(externalReportInformation);
					}
				}
				createExternalReportData(externalReportInformation, externalReportInfo);	
			} catch (Exception e) {
				response = IntegrationResponseCode.DATA_NOT_FOUND.getCode();
				LOGGER.error(e.getMessage(), e);
			}
		}				
		return createResponseReport(response, externalReportInformation.getReportId());
	}

	/**
	 * @param externalReportInformation
	 * @param externalReportInfo
	 */
	private void createExternalReportData(ExternalReportInformation externalReportInformation, ExternalReportInfo externalReportInfo) {
		ExternalReportData externalReportData = new ExternalReportData();
		externalReportData.setCreationDate(externalReportInformation.getReportDate());
		externalReportData.setMessageJsonData(externalReportInformation.getMessageJsonData());
		externalReportData.setExternalReportInfo(externalReportInfo);		
//		externalReportDataService.createOrUpdate(externalReportData);
		externalReportDataService.createOrUpdateNative(externalReportData);
	}

	/**
	 * @param externalReportInformation
	 * @return
	 */
	private ExternalReportInfo createExternalReportInfo(ExternalReportInformation externalReportInformation) {
		ExternalReportInfo externalReportInfo = new ExternalReportInfo();
		externalReportInfo.setCreationDate(externalReportInformation.getReportDate());
		externalReportInfo.setReportId(externalReportInformation.getReportId());
		externalReportInfo.setReportDate(externalReportInformation.getReportDate());
		externalReportInfo.setReportVersion(externalReportInformation.getVersion());
		externalReportInfo.setReportOriginalId(externalReportInformation.getReportOriginalId());		
		externalReportInfo.setEpisodeNumber(externalReportInformation.getEpisodeNumber());
		externalReportInfo.setNhc(externalReportInformation.getNhc());	
		externalReportInfo.setTypeEpisode(externalReportInformation.getTypeEpisode());
		externalReportInfo.setExternalReportType(externalReportTypeService.findExternalReportTypeByName(externalReportInformation.getReportName()));
//		externalReportInfoService.createOrUpdate(externalReportInfo);
		externalReportInfoService.createOrUpdateNative(externalReportInfo);
		return externalReportInfo;
	}

	/**
	 * @param externalReportInformation
	 * @return
	 */
	private ExternalReportInfo findExternalReportInfo(ExternalReportInformation externalReportInformation) {
		return externalReportInfoService.findExternalReportInfoByParameter(
				externalReportInformation.getReportId(), 
				externalReportInformation.getReportName(),
				externalReportInformation.getNhc(),
				externalReportInformation.getEpisodeNumber());		
	}
	
	/**
	 * @param code
	 * @param messageXmlDatas
	 * @return
	 */
	private ExternalReportResponse createResponseReport(Integer code, String externalReportId ) {
		ExternalReportResponse intReportResp = new ExternalReportResponse();
		intReportResp.setCode(code.toString());
		intReportResp.setDescription(IntegrationResponseCode.getDescriptionByCode(code));
		intReportResp.setExternalReportId(externalReportId);		
		return intReportResp;
	}
	
	/**
	 * @param externalReportInformation
	 * @return
	 */
	private Integer validateInformation(ExternalReportInformation externalReportInformation) {			
		Integer response = IntegrationResponseCode.SUCCESS.getCode();		
		if (externalReportInformation.getEpisodeNumber() == null 
				|| externalReportInformation.getNhc() == null
				|| externalReportInformation.getReportId() == null
				|| externalReportInformation.getReportDate() == null
				|| (externalReportInformation.getReportName() == null
						|| externalReportInformation.getReportName().isEmpty())) {
			response = IntegrationResponseCode.INCOMPLETE_DATA.getCode();
		}							
		return response;
	}
}
