package com.travellazy;


import org.apache.commons.io.IOUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 * Created by will on 5/14/15.
 */
public class ResourceHelper {

    public static String getFileContent(String fileName) throws IOException{
        ClassLoader classLoader = ResourceHelper.class.getClassLoader();
        String raw = IOUtils.toString(classLoader.getResourceAsStream(fileName));

        return raw.replaceAll("\n","").replaceAll("\\s","");
    }

    public static String getFileContentWithWhiteSpace(String fileName) throws IOException{
        ClassLoader classLoader = ResourceHelper.class.getClassLoader();
        return IOUtils.toString(classLoader.getResourceAsStream(fileName));
    }

    public static File getFile(String filename){
        URL resourceUrl = ResourceHelper.class.getResource("/"+ filename);
        String path = resourceUrl.getPath();
        return new File(path);
    }
}
