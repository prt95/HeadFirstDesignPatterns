package com.design.pattern.abstractfactory.impl;

import com.design.pattern.abstractfactory.Car;
import com.design.pattern.abstractfactory.CarType;
import com.design.pattern.abstractfactory.Location;

public class MicroCar extends Car {

    private Location location;
    public MicroCar(Location location){
        super(CarType.MICRO, location);
        constructCar();
    }
    @Override
    public void constructCar() {
        System.out.println("creating micro car");
    }
}
