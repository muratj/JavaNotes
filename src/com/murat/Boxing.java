package com.murat;

public class Boxing {
    public static void main(String[] args) {
        int i = 5;
        Integer j = new Integer(i);     // Boxing or Wrapping
        Integer.parseInt("123");     // Boxing String to integer

        Integer ab = i;                 // Autoboxing

        int ub = ab.intValue();         // Unboxing
        ub = ab;                        // Auto-unboxing

    }
}
