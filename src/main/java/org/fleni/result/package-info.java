@XmlSchema(
    elementFormDefault=XmlNsForm.QUALIFIED,
    namespace="urn:hl7-org:v3",
    xmlns={
        @XmlNs(prefix="xsi", namespaceURI="http://www.w3.org/2001/XMLSchema-instance"),
        @XmlNs(prefix="mif", namespaceURI="urn:hl7-org:v3/mif")
    }
   
)
//xmlns="urn:hl7-org:v3" 
//xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
//xmlns:mif="urn:hl7-org:v3/mif" 
//xsi:schemaLocation="urn:hl7-org:v3 CDA.xsd"
/**
 * @author sescudero
 *
 */
package org.fleni.result;

import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlNsForm;
import javax.xml.bind.annotation.XmlSchema;
