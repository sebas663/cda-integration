package org.fleni.cda.externalreport.model.service;

import org.fleni.cda.externalreport.model.entity.CdaErrorBackup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring/spring-test-application-context.xml" })
public class CdaErrorBackupServiceTest extends AbstractTestNGSpringContextTests {
	private static final Logger LOGGER = LoggerFactory.getLogger(ExternalReportDataServiceTest.class);

	@Autowired
	private ICdaErrorBackupService cdaErrorBackupService;

	@Test(enabled=false)
	public void getFindTest() {

		try {
			CdaErrorBackup cdaErrorBackup = cdaErrorBackupService.find(1L);

			Assert.assertNotNull(cdaErrorBackup);

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
}
