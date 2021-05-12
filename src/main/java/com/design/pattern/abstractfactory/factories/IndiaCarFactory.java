package com.design.pattern.abstractfactory.factories;

import com.design.pattern.abstractfactory.Car;
import com.design.pattern.abstractfactory.CarType;
import com.design.pattern.abstractfactory.Location;
import com.design.pattern.abstractfactory.impl.MicroCar;
import com.design.pattern.abstractfactory.impl.MiniCar;

public class IndiaCarFactory {
    public static Car buildCar(CarType carType) {
        switch (carType) {
            case MINI:
                return new MiniCar(Location.IN);
            case MICRO:
                return new MicroCar(Location.IN);
        }
        return null;
    }
}
