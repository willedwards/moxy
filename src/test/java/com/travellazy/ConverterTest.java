package com.travellazy;

import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

/**
 * Created by will on 5/14/15.
 */

@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class ConverterTest {

    @Test
    public void xml2JsonTest() throws Exception {
        String xml = ResourceHelper.getFileContent("customer.xml");
        String convertedJson = xml2Json(xml);
        String expectedJson = readCustomerJson();
        assertEquals(expectedJson, convertedJson);
    }

    private String xml2Json(String xml){
        return "";//write your code here
    }

    @Test
    public void json2xmlTest() throws Exception {
       String inputJson = readCustomerJson();
       String convertedXML = json2xml(inputJson);
       String expectedXML =  ResourceHelper.getFileContent("customer.xml");
        assertEquals(expectedXML,convertedXML);
    }

    private String json2xml(String inputJson)
    {
        return ""; //your code here
    }

    private String readCustomerJson() throws IOException{
        InputStream is=ConverterTest.class.getResourceAsStream("/customer.json");
        return IOUtils.toString(is);
    }


}
