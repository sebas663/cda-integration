package org.fleni.cda.externalreport.model.service;

import org.fleni.cda.externalreport.model.entity.ExternalReportType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring/spring-test-application-context.xml" })
public class ExternalReportTypeServiceTest extends AbstractTestNGSpringContextTests {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(ExternalReportTypeServiceTest.class);

	@Autowired
	private IExternalReportTypeService externalReportTypeService;

	@Test(enabled=false)
	public void getFindTest() {

		try {
			ExternalReportType externalReportType = externalReportTypeService.find(1L);

			Assert.assertNotNull(externalReportType);

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
}
