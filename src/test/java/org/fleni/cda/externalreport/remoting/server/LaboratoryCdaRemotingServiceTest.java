package org.fleni.cda.externalreport.remoting.server;

import org.apache.cxf.helpers.IOUtils;
import org.fleni.cda.externalreport.remoting.dto.ExternalReportResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring/spring-test-application-context.xml" })
public class LaboratoryCdaRemotingServiceTest extends AbstractTestNGSpringContextTests {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(LaboratoryCdaRemotingServiceTest.class);
	
	@Autowired
	private ILaboratoryCdaRemotingService laboratoryCdaRemotingService;
	
	@Test(enabled = false)
	public void findDocumentCdaTest() {
		String path = "/xml-test/AR_CDA_R2_INFORME_LABORATORIO-test.xml";
		String cda = "";
		try {
			cda = IOUtils.toString(getClass().getResourceAsStream(path));
		    ExternalReportResponse response = laboratoryCdaRemotingService.sendCDALaboratory(cda);
			Assert.assertNotNull(response);
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}

}
