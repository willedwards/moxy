package com.travellazy;

import java.io.InputStream;

import net.sf.json.JSON;
import net.sf.json.xml.XMLSerializer;

import org.apache.commons.io.IOUtils;
import org.junit.Test;

/**
 * Created by will on 5/14/15.
 */

public class ConvertXMLtoJSON {

    @Test
    public void convertTest() throws Exception {
        InputStream is = ConvertXMLtoJSON.class.getResourceAsStream("/sample-test.xml");
        String xml = IOUtils.toString(is);


        XMLSerializer xmlSerializer = new XMLSerializer();
        JSON json = xmlSerializer.read( xml );
        System.out.println( json.toString(2) );
    }


}
