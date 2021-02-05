package com.murat.Sets;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSets {

    public static void main(String[] args) {
        // Set(interface) is list of unordered unique values
        Set<String> set = new HashSet<>();

        // add method returns true or false
        boolean added1 = set.add("Hello");
        boolean added2 = set.add("Hello");

        System.out.println(added1);
        System.out.println(added2);
        set.clear();
        System.out.println(set);

        Set<Integer> set2 = Set.of(0,1,2,3,4,5);

        Iterator<Integer> iterator = set2.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
