package org.fleni.cda.externalreport.remoting.server;

import java.util.Date;

import org.fleni.cda.externalreport.remoting.dto.ExternalReportInformation;
import org.fleni.cda.externalreport.remoting.dto.ExternalReportResponse;
import org.fleni.cda.externalreport.remoting.utils.DocumentCdaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring/spring-test-application-context.xml" })
public class ExternalReportRemotingServiceTest extends AbstractTestNGSpringContextTests {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ExternalReportRemotingServiceTest.class);

	@Autowired
	private IExternalReportRemotingService externalReportRemotingService;

	@Test(enabled = false)
	public void adminReportInformationTest() {
		try {
			ExternalReportResponse externalReportResponse = externalReportRemotingService.createReportInformation(builderExternalReportInformation());
			
			Assert.assertNotNull(externalReportResponse);
			Assert.assertNotNull(externalReportResponse.getExternalReportId());

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
	
	/**
	 * @return
	 */
	private ExternalReportInformation builderExternalReportInformation(){
		ExternalReportInformation externalReportInformation = new ExternalReportInformation();
		externalReportInformation.setReportId("123456");
		externalReportInformation.setReportDate(new Date());
		externalReportInformation.setReportName(DocumentCdaType.DISCHARGE.getDescription());
		externalReportInformation.setEpisodeNumber("123456");
		externalReportInformation.setNhc("123456");
		String json = "{'aString':'from Parsed String','aInt':33,'aInteger':null,'aDate':'Feb 26, 2014 7:35:23 PM'}";
		externalReportInformation.setMessageJsonData(json.getBytes());
		
		return externalReportInformation;
	}
}
