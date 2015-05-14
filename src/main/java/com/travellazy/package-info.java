@XmlSchema(
        xmlns = {
                @XmlNs(prefix = "",
                        namespaceURI = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.01")
        }
)
@XmlAccessorType(XmlAccessType.FIELD)
package com.travellazy;

//@XmlSchema(
//        namespace="http://earth.google.com/kml/2.0",
//        elementFormDefault=XmlNsForm.QUALIFIED,
//        xmlns={
//                @XmlNs(prefix = "ns",
//                        namespaceURI="urn:oasis:names:tc:ciq:xsdschema:xAL:2.0")
//        }
//)
//@XmlAccessorType(XmlAccessType.FIELD)

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlNs;
import javax.xml.bind.annotation.XmlSchema;




 /*
 This package-info.java file defines package level properties that are used during the Jaxb marshalling of classes
 to xml for pacs messages. The @XmlSchema annotation ensures that there is no 'ns0' type namespace prefix added
 by default to elements in the urn:iso:std:iso:20022:tech:xsd:pacs.008.001.01 namespace.
 */
//@XmlSchema(xmlns = {@XmlNs(prefix = "", namespaceURI = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.01")}) package com.bank.acsw.domain.pacs;
//
//        import javax.xml.bind.annotation.XmlNs;
//        import javax.xml.bind.annotation.XmlSchema;
