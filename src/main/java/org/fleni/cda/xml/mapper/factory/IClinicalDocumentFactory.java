package org.fleni.cda.xml.mapper.factory;

import org.fleni.cda.json.mapper.report.ReportIntegration;

public interface IClinicalDocumentFactory {

	/**
	 * @param reportIntegration
	 * @return
	 */
	String buildXmlCdaClinicalDocument(ReportIntegration reportIntegration);	
	
}
