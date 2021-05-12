package com.design.pattern.factory;

import com.design.pattern.factory.impl.Car;
import com.design.pattern.factory.impl.Taxi;

public class Vehiclefactory {
    public Vehicle createVehicle(String name) {
        switch (name) {
            case "CAR":
                return new Car();
            case "TAXI":
                return new Taxi();
            default:
                return null;

        }
    }
}
