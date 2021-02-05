package com.murat.Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps {
    public static void main(String[] args) {
        // Hashmap is not thread safe
        // faster
        // works with single thread
        // allows one null key

        Map<String, String> states = new HashMap<>();
        states.put("NY", "New York");
        states.put("MA", "Maryland");
        states.put("DE", "Delaware");
        states.put(null, null);

        states.remove("MA");
        System.out.println(states);
        System.out.println(states.get("DE"));

        // get all value from Map
        // Method 1
        Set<String> keys = states.keySet();
        keys.forEach(key -> System.out.println("By keySet: \t\t" + key + " -> " + states.get(key)));

        // Method 2
        Set<Map.Entry<String, String>> set = states.entrySet();
        set.forEach(entry -> System.out.println("By entrySet:\t" + entry.getKey() + " -> " + entry.getValue()));
    }
}
