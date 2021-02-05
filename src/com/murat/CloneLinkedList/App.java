package com.murat.CloneLinkedList;

public class App {
    public static void main(String[] args) {
        var list = new LinkedList();

        list.addFirst(3);
        list.addFirst(2);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        System.out.println(list.size());
        System.out.println(list.contains(3));

        list.removeFirst();
        System.out.println(list.contains(2));

        list.removeLast();
        System.out.println(list.contains(6));
    }
}
