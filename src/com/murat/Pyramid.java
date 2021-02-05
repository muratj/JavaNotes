package com.murat;

public class Pyramid {

    static void pyramid(int n) {
        for (int i = 1; i <= n; i++) {
            printStar(i);
        }
        for (int i = n-1; i > 0; i--) {
            printStar(i);
        }
    }
    static void printStar(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
