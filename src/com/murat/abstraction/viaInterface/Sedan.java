package com.murat.abstraction.viaInterface;

public class Sedan implements Car {
    String carType;
    String carBrand;
    String carSeries;

    public Sedan(String carType, String carBrand, String carSeries) {
        this.carType = carType;
        this.carBrand = carBrand;
        this.carSeries = carSeries;
    }

    @Override
    public void drive() {
        System.out.println(this.carBrand+" is on drive mode");
    }

    @Override
    public void stop() {
        System.out.println(this.carBrand+" is stopping");
    }

    @Override
    public void turnRight() {
        System.out.println(this.carBrand+" is turning right");
    }

    @Override
    public void turnLeft() {
        System.out.println(this.carBrand+" is turning left");
    }
}
