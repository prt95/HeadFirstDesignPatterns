package com.design.pattern.abstractfactory.factories;

import com.design.pattern.abstractfactory.Car;
import com.design.pattern.abstractfactory.CarType;
import com.design.pattern.abstractfactory.Location;
import com.design.pattern.abstractfactory.impl.MicroCar;
import com.design.pattern.abstractfactory.impl.MiniCar;

public class UsCarFactory {
    public static Car buildCar(CarType carType) {
        switch (carType) {
            case MINI:
                return new MiniCar(Location.US);
            case MICRO:
                return new MicroCar(Location.US);
        }
        return null;
    }
}
