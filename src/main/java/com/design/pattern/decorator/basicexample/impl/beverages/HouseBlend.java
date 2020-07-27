package com.design.pattern.decorator.basicexample.impl.beverages;

import com.design.pattern.decorator.basicexample.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House blend";
    }

    @Override
    public double cost() {
        return 2.2;
    }
}
