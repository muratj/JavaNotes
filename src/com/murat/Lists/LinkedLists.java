package com.murat.Lists;

import java.util.LinkedList;

public class LinkedLists {
    public static void main(String[] args) {
        LinkedList<Integer> ns = new LinkedList<>();
        LinkedList numbers = new LinkedList();

        numbers.addFirst(10);
        numbers.add(1,20);
        numbers.addLast(30);
        numbers.addFirst("one");
        System.out.println(numbers);

        numbers.removeFirst();
        numbers.removeLast();
        numbers.remove(1);
        System.out.println(numbers);

        System.out.println(numbers.contains(10));
    }
}
