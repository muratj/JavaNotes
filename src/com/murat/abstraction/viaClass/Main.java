package com.murat.abstraction.viaClass;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Suv("SUV", "BMW", "X5");
        Car car2 = new Sedan("Sedan", "Mercedes-Benz", "E");

        car1.drive();
        car2.stop();
    }
}
