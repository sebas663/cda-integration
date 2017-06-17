import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.StringWriter;
import java.text.SimpleDateFormat;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;

public class Test {

	 public static void main(String[] args) {
	        DocumentBuilderFactory domFactory = DocumentBuilderFactory.newInstance();
	        String xml = "<?xml version='1.0' encoding='UTF-8'?>"
						+"<ClinicalDocument xmlns='urn:hl7-org:v3' xmlns:xsi='http://www.w3.org/2001/XMLSchema-instance'  xmlns:mif='urn:hl7-org:v3/mif' xsi:schemaLocation='urn:hl7-org:v3 CDA.xsd'>"
						+"	<effectiveTime value='20170517 12:08:04'/>"
						+"</ClinicalDocument>";
	        Document dDoc = null;
	        try {
	            DocumentBuilder builder = domFactory.newDocumentBuilder();
	            InputStream stream = new ByteArrayInputStream(xml.getBytes());
				dDoc = builder.parse(stream);

	            XPath xPath = XPathFactory.newInstance().newXPath();
	            
	            
	            Node effectiveTime = (Node) xPath.evaluate("/ClinicalDocument/effectiveTime/@value", dDoc, XPathConstants.NODE);
	            String date = effectiveTime.getNodeValue();
           
	            date = new StringBuilder(date).insert(4, "/").insert(7, "/").toString();
	           
	            effectiveTime.setNodeValue(date);
	            
	    		TransformerFactory transformerFactory = TransformerFactory.newInstance();
	    		Transformer transformer = transformerFactory.newTransformer();
	    		DOMSource source = new DOMSource(dDoc);
	    		StringWriter writer = new StringWriter();
	    		transformer.transform(source, new StreamResult(writer));
	    		xml = writer.toString();
	            System.out.println("effectiveTime " + effectiveTime.getNodeValue());
	            
	            System.out.println(xml);

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

}
