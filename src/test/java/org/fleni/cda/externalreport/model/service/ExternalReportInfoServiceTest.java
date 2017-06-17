package org.fleni.cda.externalreport.model.service;

import org.fleni.cda.externalreport.model.entity.ExternalReportInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring/spring-test-application-context.xml" })
public class ExternalReportInfoServiceTest extends AbstractTestNGSpringContextTests {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ExternalReportInfoServiceTest.class);

	@Autowired
	private IExternalReportInfoService externalReportInfoService;

	@Test(enabled=false)
	public void getFindTest() {

		try {
			ExternalReportInfo externalReportInfo = externalReportInfoService.find(1L);

			Assert.assertNotNull(externalReportInfo);

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
}
