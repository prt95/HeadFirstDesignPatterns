package com.design.pattern.abstractfactory;


public abstract class Car {

    private  CarType carType;
    private  Location location;

    public Car(CarType carType, Location location){
        this.carType = carType;
        this.location = location;
    }



    public abstract void constructCar();
}
