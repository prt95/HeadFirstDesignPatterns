package com.design.pattern.abstractfactory.impl;


import com.design.pattern.abstractfactory.Car;
import com.design.pattern.abstractfactory.CarType;
import com.design.pattern.abstractfactory.Location;

public class MiniCar extends Car {
    private Location location;
    public MiniCar(Location location){
        super(CarType.MINI, location);
        constructCar();
    }
    @Override
    public void constructCar() {
        System.out.println("creating micro car");
    }
}
