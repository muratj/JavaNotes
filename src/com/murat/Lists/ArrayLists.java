package com.murat.Lists;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new java.util.ArrayList<>();
        ArrayList ns = new ArrayList();

        numbers.add(10);
        numbers.add(1, 10);
        numbers.addAll(Set.of(2,3,4,5));
        numbers.set(0, 5);
        numbers.remove(0);
        System.out.println(numbers.isEmpty());
        System.out.println(numbers.contains(5));
        Collections.sort(numbers);
        System.out.println(numbers.get(0));
        System.out.println(numbers.size());
        System.out.println(numbers.indexOf(20));
        System.out.println(Arrays.toString(numbers.toArray()));
        System.out.println(numbers);

        ns.add("five");
        ns.add(5);
        ns.add(true);
        System.out.println(ns);
    }
}
