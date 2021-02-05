package com.murat.abstraction.viaClass;

abstract class Car {
    String carType;
    String carBrand;
    String carSeries;

    public Car(String carType, String carBrand, String carSeries) {
        this.carType = carType;
        this.carBrand = carBrand;
        this.carSeries = carSeries;
    }

    abstract void drive();
    abstract void stop();
    abstract void turnRight();
    abstract void turnLeft();

    public String getCarType() {
        return carType;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getCarSeries() {
        return carSeries;
    }
}
