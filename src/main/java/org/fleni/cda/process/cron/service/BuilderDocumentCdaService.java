package org.fleni.cda.process.cron.service;

import java.util.Date;
import java.util.List;

import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;
import org.fleni.cda.json.mapper.report.ReportIntegration;
import org.fleni.cda.process.manager.service.IManagerDocumentCdaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class BuilderDocumentCdaService {

	private static final Logger LOGGER = LoggerFactory.getLogger(BuilderDocumentCdaService.class);

	@Autowired
	private IManagerDocumentCdaService managerDocumentCdaService;

	/**
	 * 
	 */
	public void executeCron() {
		long initALL = System.currentTimeMillis();
		LOGGER.debug("Cron Initialization");
		LOGGER.debug("Cron Time " + new Date());
		System.out.println("Cron Initialization");
		try {
			int size = 0;
			do{	
				
//				long init = System.currentTimeMillis();
				
//				long initDB = System.currentTimeMillis();
				// Getting: List ExternalReportInfo
				List<ExternalReportInfo> externalReportInfos = managerDocumentCdaService.findAllExternalReportWithoutCdaData();
//				long finDB = System.currentTimeMillis(); 
//				String tiempo = "Tiempo total de consulta db: " + (finDB - initDB) / 1000 + " Segundos";
//				System.out.println(tiempo);
				
				size = externalReportInfos.size();
//				System.out.println("tamaño del lote " + size);
				
				Assert.notNull(externalReportInfos, "The list ExternalReportInfo (EXTERNAL_REPORT_DATA.MESSAGE_CDADATA = NULL) must not be null");
				Assert.notEmpty(externalReportInfos, "The list ExternalReportInfo (EXTERNAL_REPORT_DATA.MESSAGE_CDADATA = NULL) must not be empty");
//				int count = 0;
				for (ExternalReportInfo externalReportInfo : externalReportInfos) {
//					count += externalReportInfo.getExternalReportDatas().size();
					for (ExternalReportData externalReportData : externalReportInfo.getExternalReportDatas()) {
	
						try {
							// Getting: ReportIntegration
							ReportIntegration reportIntegration = managerDocumentCdaService.builderReportIntegration(externalReportData);						
							Assert.notNull(reportIntegration, "The ReportIntegration must not be null");						
							
							// Getting: xml
							String xml = managerDocumentCdaService.builderXmlCdaClinicalDocument(reportIntegration, externalReportInfo.getExternalReportType());
							Assert.notNull(xml, "The xml must not be null");
							
							externalReportData.setMessageCdaData(xml.getBytes());
							// Save: ExternalReportData
							managerDocumentCdaService.saveExternalReportCdaData(externalReportData);
							
						} catch (IllegalArgumentException e) {
							LOGGER.error(e.getMessage());
						} catch (Exception e) {
							LOGGER.error(e.getMessage(), e);
						}
					}
				}
//				System.out.println("suma de datas " + count);
//				long fin = System.currentTimeMillis(); 
//				String tmp = "Tiempo total de procesamiento del lote : " + (fin - init) / 1000 + " Segundos";
//				System.out.println(tmp);
//				System.out.println(" ");
			} while (size!=0);
			
		} catch (IllegalArgumentException e) {
			LOGGER.error(e.getMessage());
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
		}
		System.out.println("Cron Ending");
		long finALL = System.currentTimeMillis(); // Instante final del procesamiento
		String tiempo = "Tiempo total de procesamiento de todos los informes: " + (finALL - initALL) / 1000 + " Segundos";
		System.out.println(tiempo);
		LOGGER.debug("Cron Ending");
	}
	
	/**
	 * 
	 */
	public void executeCronError() {
		
	}
}
