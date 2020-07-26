package com.design.pattern.decorator.impl.beverages;

import com.design.pattern.decorator.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.1;
    }
}
