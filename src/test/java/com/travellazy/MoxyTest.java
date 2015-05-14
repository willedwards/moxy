package com.travellazy;

import org.eclipse.persistence.jaxb.MarshallerProperties;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by will on 5/14/15.
 */

public class MoxyTest {


    @Test
    public void customerXMLtoPojo() throws JAXBException, IOException {

        PhoneNumber expectedPhone = new PhoneNumber("work","555-1111");
        Customer expectedCustomer = new Customer(123,"Jane",null, Arrays.asList(expectedPhone));

        File xml = ResourceHelper.getFile("customerMoxyInput.xml");
        JAXBContext jc = JAXBContext.newInstance(Customer.class);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        Customer customer = (Customer) unmarshaller.unmarshal(xml);
        Assert.assertEquals(expectedCustomer, customer);



        }

    @Test
    public void customerPojoToXML() throws JAXBException, IOException {

        PhoneNumber expectedPhone = new PhoneNumber("work","555-1111");
        Customer expectedCustomer = new Customer(123,"Jane",null, Arrays.asList(expectedPhone));

        String expectedXml = ResourceHelper.getFileContent("customerMoxyInput.xml");

        JAXBContext jc = JAXBContext.newInstance(Customer.class);
        Marshaller marshaller = jc.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        //issue is here...
        marshaller.setProperty(MarshallerProperties.MEDIA_TYPE, "application/json");
        marshaller.setProperty(MarshallerProperties.JSON_INCLUDE_ROOT, false);
        marshaller.marshal(expectedCustomer, System.out);

    }

}
