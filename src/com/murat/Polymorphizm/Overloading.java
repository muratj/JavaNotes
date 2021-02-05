package com.murat.Polymorphizm;


public class Overloading {
    public static void main(String[] args) {
        MotoBike bike = new MotoBike();
        bike.add("Tesla", "ATV", 2020, 4);
    }
}


class Vehicle {
    private final void add(String make, String model, int year) {}

    public static void add(String type, String make, String model, int year) {}
}
class MotoBike extends Vehicle{
    public void add(String make, String model, int year, int wheels) {}
}