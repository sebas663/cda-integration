package org.fleni.cda.common.xml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.fleni.cda.xml.mapper.report.ReportDischarge;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
@ContextConfiguration(locations = { "classpath:/spring/spring-test-application-context.xml" })
public class MarshallerUnmarshallerTest extends AbstractTestNGSpringContextTests {

	@Test(enabled = false)
	public void convertXMLToObjectTest() {
		try {
			ReportDischarge reportDischarge = getReportDischargeByProperty();

			Assert.assertNotNull(reportDischarge);
			Assert.assertEquals(reportDischarge.getRecordTarget().getPatientRole().getPatient().getName().getFamily().get(0), "Funes");

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}
	
	@Test(enabled = false)
	public void convertObjectToXMLTest() {
		try {
			ReportDischarge reportDischarge = getReportDischargeByProperty();
			
			Assert.assertNotNull(reportDischarge);
			
			String xml = DocumentMarshaller.convertToXml(reportDischarge, ReportDischarge.class);
			
			Assert.assertNotNull(xml);

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}	

	/**
	 * @return
	 * @throws IOException
	 * @throws FileNotFoundException
	 */
	private ReportDischarge getReportDischargeByProperty() throws IOException, FileNotFoundException {
		Properties properties = new Properties();
		properties.load(new FileInputStream("src/test/resources/report/message.properties"));

		return (ReportDischarge) DocumentUnmarshaller.convertXmlToObject(properties.getProperty("discharge"), ReportDischarge.class);
	}	
}
