package com.murat.Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Duplicates {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one", "two", "one", "tree", "three"));

        // Method 1
        // stream distinct gives only list without duplicates
        System.out.println(list.size() != list.stream().distinct().count());

        // Method 2
        // hashset contains only unique values
        HashSet<String> uniqueValues = new HashSet<>(list);
        System.out.println(list.size() != uniqueValues.size());
    }
}
