package com.murat.propertiesFile;

public class GetPropertiesDemo {
    public static void main(String[] args) {
        String url = ReadProperties.getProperty("url");
        String username = ReadProperties.getProperty("username");

        System.out.println(url);
    }
}
