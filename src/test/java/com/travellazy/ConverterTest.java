package com.travellazy;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.dataformat.xmljson.XmlJsonDataFormat;
import org.apache.camel.main.Main;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

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

    private String xml2Json(String xml) throws Exception
    {

        XmlJsonDataFormat xmlJsonFormat = new XmlJsonDataFormat();
        xmlJsonFormat.setEncoding("UTF-8");
        xmlJsonFormat.setForceTopLevelObject(true);
        xmlJsonFormat.setTrimSpaces(true);
        xmlJsonFormat.setRootName("newRoot");
        xmlJsonFormat.setSkipNamespaces(true);
        xmlJsonFormat.setRemoveNamespacePrefixes(true);
        xmlJsonFormat.setExpandableProperties(Arrays.asList("d", "e"));

        RouteBuilder rb = new MyRouteBuilder(xmlJsonFormat);
        Main main = new Main();
        main.addRouteBuilder(rb);
        main.enableHangupSupport();
        main.run();

                               rb.
     }

    class MyRouteBuilder extends RouteBuilder{
        XmlJsonDataFormat format;
        MyRouteBuilder(XmlJsonDataFormat format){
            this.format = format;
        }
        @Override
        public void configure() throws Exception
        {
            from("direct:unmarshal").unmarshal(format).to("mock:xml");
        }
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
