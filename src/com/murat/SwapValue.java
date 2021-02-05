package com.murat;

public class SwapValue {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;

        // method 1
        int temp = a;
        a = b;
        b = temp;

        // method 2
        a = a + b - (b=a);

        // method 3
        a = a ^ b ^ (b = a);


        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
