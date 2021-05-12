package com.design.pattern.abstractfactory.factories;

import com.design.pattern.abstractfactory.Car;
import com.design.pattern.abstractfactory.CarType;
import com.design.pattern.abstractfactory.Location;

public class MainCarFactory {
    public Car buildCar(CarType carType, Location location){
        switch (location){
            case IN:
                return IndiaCarFactory.buildCar(carType);
            case US:
                return UsCarFactory.buildCar(carType);
        }
        return null;

    }
}
