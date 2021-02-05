package com.murat.FinalizeMethod;

public class Finalize {
    public static void main(String[] args) {
        while(true) {
            new Box();
        }
    }
}

class Box {
    public Box() {
        System.out.println("Created object with reference " + this);
    }
    public void finalize() {
        System.out.println("Finalize reference " + this);
    }
}
