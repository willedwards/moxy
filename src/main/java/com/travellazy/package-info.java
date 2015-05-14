@XmlSchema(
        namespace="http://earth.google.com/kml/2.0",
        elementFormDefault=XmlNsForm.QUALIFIED,
        xmlns={
                @XmlNs(prefix="",
                        namespaceURI="urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
        }
)
//@XmlAccessorType(XmlAccessType.FIELD)
package com.travellazy;

import javax.xml.bind.annotation.*;

 /*
 This package-info.java file defines package level properties that are used during the Jaxb marshalling of classes
 to xml for pacs messages. The @XmlSchema annotation ensures that there is no 'ns0' type namespace prefix added
 by default to elements in the urn:iso:std:iso:20022:tech:xsd:pacs.008.001.01 namespace.
 */
//@XmlSchema(xmlns = {@XmlNs(prefix = "", namespaceURI = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.01")}) package com.bank.acsw.domain.pacs;
//
//        import javax.xml.bind.annotation.XmlNs;
//        import javax.xml.bind.annotation.XmlSchema;
