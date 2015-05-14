package com.travellazy;

import org.junit.Test;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

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
        assertEquals(expectedCustomer, customer);
    }



}
