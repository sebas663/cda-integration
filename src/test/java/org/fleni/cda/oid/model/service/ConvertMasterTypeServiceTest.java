package org.fleni.cda.oid.model.service;

import org.fleni.cda.oid.model.entity.SexType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring/spring-test-application-context.xml" })
public class ConvertMasterTypeServiceTest extends AbstractTestNGSpringContextTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(ConvertMasterTypeServiceTest.class);

	@Autowired
	private IConvertMasterTypeService convertMasterTypeService;

	@Test(enabled = false)
	public void getConvertMasterTypeByExampleTest() {
		try {
			SexType example = new SexType();
			example.setTypeMasterSystemExternal("H");
			example.setNameSystemExternal("SIDCA");

			SexType sexType = (SexType) convertMasterTypeService.getConvertMasterTypeByExample(example);

			Assert.assertNotNull(sexType);

			Assert.assertEquals(sexType.getCodeSystem().getDisplayName(), "MASCULINO");

		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
}
