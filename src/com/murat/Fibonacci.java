package com.murat;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Fibonacci {
    public static void main(String[] args) {
        // Method 1
        System.out.println(fib1(20));

        // Method 2
        fib2(7);

        // Method 3
        fib3(10);
    }

    // solution 1
    public static int fib1(int num) {
        int result=0;
        int j=0;
        int z=1;
        for(int i=1; i<num; i++){
            result=j+z;
            j=z;
            z=result;
        }
        return result;
    }

    // solution 2
    public static void fib2(int num) {
        int start = 0;
        int next = 1;
        StringBuilder fib = new StringBuilder();
        fib.append(start).append(", ").append(next);

        for (int i = 1; i < num; i++){
            next = start + (start = next);
            fib.append(", ").append(next);
        }
        System.out.println(fib);
    }

    // solution 3
    public static void fib3(int num) {
        List<Integer> fibo = new ArrayList<>();
        fibo.add(0);
        fibo.add(1);

        for(int i = 1; i<10; i++) {
            int firstVal = fibo.get(i-1);
            int secondVal = fibo.get(i);
            fibo.add(firstVal+secondVal);
        }
        System.out.println(fibo);
    }
}
