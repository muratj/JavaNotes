package com.murat.SortObjects;

import java.util.*;
import java.util.stream.Collectors;

public class SortObjects {
    public static void main(String[] args) {
        Customer c1 = new Customer(102, "Joshua",true);
        Customer c2 = new Customer(101, "Mira",true);
        Customer c3 = new Customer(103, "Alex",false);
        Customer c4 = new Customer(104, "Max",true);
        Customer c5 = new Customer(105, "Jessica",false);

        // Method 1
        List<Customer> list = new ArrayList<>(Set.of(c1, c2, c3, c4, c5));
        //List<Customer> list1 = new ArrayList<>(Arrays.asList(c1, c2, c3, c4, c5));
        list.sort(Comparator.comparing(Customer::getId));
        list.sort(Comparator.comparing(Customer::isPrime).reversed());
        list.forEach(customer -> System.out.println(customer.toString()));

        System.out.println("================================================");
        // Method 2
        List<Customer> newList = list.stream()
                .sorted(Comparator.comparing(Customer::getId))
                .sorted(Comparator.comparing(Customer::isPrime).reversed())
                .collect(Collectors.toList());
        newList.forEach(customer -> System.out.println(customer.toString()));
    }
}
