package com.murat.Sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {

        // TreeSet has somehow order of values | ascending order
        Set<String> set = new TreeSet<>();

        set.add("One");
        set.add("Two");
        set.add("1");
        set.add("2");
        set.addAll( Set.of("3", "4") );

        set.remove("One");
        set.removeAll( Set.of("3","4") );

        for (String e : set) {
            System.out.println(e);
        }
        set.clear();


    }
}
