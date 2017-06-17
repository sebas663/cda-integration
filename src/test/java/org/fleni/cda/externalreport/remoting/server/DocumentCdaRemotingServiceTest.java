package org.fleni.cda.externalreport.remoting.server;

import org.fleni.cda.externalreport.remoting.dto.DocumentCdaCandidates;
import org.fleni.cda.externalreport.remoting.dto.DocumentCdaInformation;
import org.fleni.cda.externalreport.remoting.utils.DocumentCdaType;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@ContextConfiguration(locations = { "classpath:spring/spring-test-application-context.xml" })
public class DocumentCdaRemotingServiceTest extends AbstractTestNGSpringContextTests {

	private static final Logger LOGGER = LoggerFactory.getLogger(DocumentCdaRemotingServiceTest.class);

	@Autowired
	private IDocumentCdaRemotingService documentCdaRemotingService;

	@Test(enabled = false)
	public void findDocumentCdaTest() {
		try {
			DocumentCdaCandidates documentCdaCandidates = documentCdaRemotingService.findDocumentCda(builderDocumentCdaInformation());
		
			Assert.assertNotNull(documentCdaCandidates);
			Assert.assertNotNull(documentCdaCandidates.getCdaDocuments());
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
	@Test(enabled = true)
	public void findDocumentByNhc() {
		try {
			DocumentCdaCandidates documentCdaCandidates = documentCdaRemotingService.findDocumentCda(builderDocumentCdaInformation(0));
		
			Assert.assertNotNull(documentCdaCandidates);
			Assert.assertNotNull(documentCdaCandidates.getCdaDocuments());
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
	@Test(enabled = false)
	public void findDocumentByNEpisodio() {
		try {
			DocumentCdaCandidates documentCdaCandidates = documentCdaRemotingService.findDocumentCda(builderDocumentCdaInformation(1));
		
			Assert.assertNotNull(documentCdaCandidates);
			Assert.assertNotNull(documentCdaCandidates.getCdaDocuments());
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
	@Test(enabled = false)
	public void findDocumentByDocumentId() {
		try {
			DocumentCdaCandidates documentCdaCandidates = documentCdaRemotingService.findDocumentCda(builderDocumentCdaInformation(2));
		
			Assert.assertNotNull(documentCdaCandidates);
			Assert.assertNotNull(documentCdaCandidates.getCdaDocuments());
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
	@Test(enabled = false)
	public void findDocumentByDocumentName() {
		try {
			DocumentCdaCandidates documentCdaCandidates = documentCdaRemotingService.findDocumentCda(builderDocumentCdaInformation(3));
		
			Assert.assertNotNull(documentCdaCandidates);
			Assert.assertNotNull(documentCdaCandidates.getCdaDocuments());
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
	@Test(enabled = false)
	public void findDocumentByDocumentNameNhc() {
		try {
			DocumentCdaCandidates documentCdaCandidates = documentCdaRemotingService.findDocumentCda(builderDocumentCdaInformation(4));
		
			Assert.assertNotNull(documentCdaCandidates);
			Assert.assertNotNull(documentCdaCandidates.getCdaDocuments());
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}
	@Test(enabled = false)
	public void findDocumentByDates() {
		try {
			DocumentCdaCandidates documentCdaCandidates = documentCdaRemotingService.findDocumentCda(builderDocumentCdaInformation(5));
		
			Assert.assertNotNull(documentCdaCandidates);
			Assert.assertNotNull(documentCdaCandidates.getCdaDocuments());
			
		} catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			Assert.fail(e.getCause() + e.getMessage());
		}
	}

	/**
	 * @return
	 */
	private DocumentCdaInformation builderDocumentCdaInformation() {
		DocumentCdaInformation documentCdaInformation = new DocumentCdaInformation();
		documentCdaInformation.setEpisodeNumber("10000009");
		documentCdaInformation.setDocumentId("200000000066AA2B");
		documentCdaInformation.setDocumentName(DocumentCdaType.REPORT_IMAGES.getDescription());
		documentCdaInformation.setNhc("103");
		return documentCdaInformation;
	}
	/**
	 * @return
	 */
	private DocumentCdaInformation builderDocumentCdaInformation(int type) {
		DocumentCdaInformation documentCdaInformation = new DocumentCdaInformation();
		if(type==0){
			documentCdaInformation.setNhc("349884");
		}else if(type==1){
			documentCdaInformation.setEpisodeNumber("10000009");
		}else if(type==2){                        
			documentCdaInformation.setDocumentId("2000000000B64B76");
		}else if(type==3){
			documentCdaInformation.setDocumentName(DocumentCdaType.REPORT_IMAGES.getDescription());
		}else if(type==4){
			documentCdaInformation.setNhc("531552");
//			documentCdaInformation.setDocumentName("EPICRISIS");
//			documentCdaInformation.setDocumentName("INFORME DE ESTUDIO IMAGENES");
			documentCdaInformation.setDocumentName("INFORME DE ESTUDIO AP");
		}else if(type==5){
			documentCdaInformation.setNhc("529097");
//			documentCdaInformation.setFromDate("16/9/2016");
//			documentCdaInformation.setToDate("27/9/2016");
		}
		return documentCdaInformation;
	}
}
