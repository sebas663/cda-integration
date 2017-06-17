package org.fleni.cda.common.xml;

import java.io.StringReader;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DocumentUnmarshaller {

	private static final Logger LOGGER = LoggerFactory.getLogger(DocumentUnmarshaller.class);

	/**
	 * @param message
	 * @param type
	 * @return
	 */
	public static Object convertXmlToObject(String message, Class<?>... type) {
		LOGGER.debug("Convert xml [" + message + "]");
		
		Object result;
		try {
			JAXBContext context = JAXBContext.newInstance(type);
			Unmarshaller unmarshaller = context.createUnmarshaller();

			StreamSource streamSource = new StreamSource(new StringReader(message));

			result = unmarshaller.unmarshal(streamSource);
			
		} catch (JAXBException e) {
			LOGGER.error(e.getMessage(), e);
			throw new RuntimeException(e);
		}

		return result;
	}
}
