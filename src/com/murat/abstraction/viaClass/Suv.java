package com.murat.abstraction.viaClass;

public class Suv extends Car{

    public Suv(String carType, String carBrand, String carSeries) {
        super(carType, carBrand, carSeries);
    }

    @Override
    void drive() {
        System.out.println(this.carBrand+" is on drive mode");
    }

    @Override
    void stop() {
        System.out.println(this.carBrand+" is stopping");
    }

    @Override
    void turnRight() {
        System.out.println(this.carBrand+" is turning right");
    }

    @Override
    void turnLeft() {
        System.out.println(this.carBrand+" is turning left");
    }
}
