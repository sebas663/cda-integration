package org.fleni.cda.common.xml;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DocumentMarshaller {

	private static final Logger LOGGER = LoggerFactory.getLogger(DocumentMarshaller.class);

	/**
	 * @param source
	 * @param type
	 * @return
	 */
	public static String convertToXml(Object source, Class<?>... type) {
		String result;
		StringWriter sw = new StringWriter();

		try {
			JAXBContext context = JAXBContext.newInstance(type);
			Marshaller marshaller = context.createMarshaller();
			marshaller.marshal(source, sw);
			result = sw.toString();

			LOGGER.debug("Convert xml [" + result + "]");

		} catch (JAXBException e) {
			LOGGER.error(e.getMessage(), e);
			throw new RuntimeException(e);
		}

		return result;
	}
	
}
