package com.murat;

import java.util.ArrayList;
import java.util.Collection;

public class SandBox {
    public SandBox() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j >= 0; j--) {
                if (i==j) continue;
                System.out.println(i + " " + j);
            }
        }
    }
}
