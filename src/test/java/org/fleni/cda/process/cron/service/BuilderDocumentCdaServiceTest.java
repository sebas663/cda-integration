package org.fleni.cda.process.cron.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring/spring-test-application-context.xml" })
public class BuilderDocumentCdaServiceTest extends AbstractTestNGSpringContextTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(BuilderDocumentCdaServiceTest.class);

	@Autowired
	private BuilderDocumentCdaService builderCdaJob;

	@Test(enabled = false)
	public void executeCronTest() {
		try {

			builderCdaJob.executeCron();

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
}
