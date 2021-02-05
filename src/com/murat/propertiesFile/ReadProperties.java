package com.murat.propertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperties {
    private static String path = System.getProperty("user.dir");

    private static Properties properties = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream(path + "/src/com/murat/propertiesFile/config.properties");
            properties.load(file);
            file.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
