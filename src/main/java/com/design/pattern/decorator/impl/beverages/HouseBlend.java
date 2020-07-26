package com.design.pattern.decorator.impl.beverages;

import com.design.pattern.decorator.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House blend";
    }

    @Override
    public double cost() {
        return 2.2;
    }
}
