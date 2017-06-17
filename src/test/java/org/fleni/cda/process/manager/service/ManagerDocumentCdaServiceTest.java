package org.fleni.cda.process.manager.service;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.cxf.helpers.IOUtils;
import org.fleni.cda.common.utils.ParametricData;
import org.fleni.cda.externalreport.model.entity.ExternalReportData;
import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;
import org.fleni.cda.json.mapper.report.ReportIntegration;
import org.fleni.cda.oid.model.entity.CodeSystem;
import org.fleni.cda.oid.model.entity.ConvertMasterType;
import org.fleni.cda.oid.model.entity.EpisodeType;
import org.fleni.cda.xml.mapper.report.Laboratory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring/spring-test-application-context.xml" })
public class ManagerDocumentCdaServiceTest extends AbstractTestNGSpringContextTests {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ManagerDocumentCdaServiceTest.class);

	@Autowired
	private IManagerDocumentCdaService managerDocumentCdaService;

	@Test(enabled = false)
	public void buildXmlCdaClinicalDocumentTest() {
		try {
			List<ExternalReportInfo> externalReportInfos = managerDocumentCdaService.findAllExternalReportWithoutCdaData();
			
			Assert.assertNotNull(externalReportInfos);

			for (ExternalReportInfo externalReportInfo : externalReportInfos) {
				for (ExternalReportData externalReportData : externalReportInfo.getExternalReportDatas()) {
					ReportIntegration reportIntegration = managerDocumentCdaService.builderReportIntegration(externalReportData);
					
					Assert.assertNotNull(reportIntegration);
					
					String xml = managerDocumentCdaService.builderXmlCdaClinicalDocument(reportIntegration, externalReportInfo.getExternalReportType());
					
					Assert.assertNotNull(xml);
					
					LOGGER.debug(xml);
				}				
			}
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}	
	@Test(enabled = false)
	public void getObjectFromXMLString() {
		Laboratory laboratory = null;
		String path = "/xml-test/AR_CDA_R2_INFORME_LABORATORIO-test.xml";
		String cda = "";
		try {
			cda = IOUtils.toString(getClass().getResourceAsStream(path));
			laboratory = (Laboratory) managerDocumentCdaService.builderObjectFromXML(cda);
			Assert.assertNotNull(laboratory);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}	
}
