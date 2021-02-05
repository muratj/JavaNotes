package com.murat.CloneArraysList;

public class Main {
    public static void main(String[] args) {
        Array numbers = new Array(3);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        numbers.insert(50);
        numbers.removeAt(3);
        System.out.println(numbers.indexOf(0));
        numbers.print();
    }
}
