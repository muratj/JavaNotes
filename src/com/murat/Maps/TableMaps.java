package com.murat.Maps;

import java.util.Map;
import java.util.TreeMap;

public class TableMaps {
    public static void main(String[] args) {
        // similar to HashMap but:
        // TableMap is thread safe
        // not faster
        // works with multiple thread
        // doesn't allows null key

        Map<String, String> phonebook = new TreeMap<>();
        phonebook.put("Maria", "632515783");
        phonebook.put("Jane", "632515783");
        phonebook.put("Ane", "632515783");
//        phonebook.put(null, null);    // throws NullPointerException


    }
}
