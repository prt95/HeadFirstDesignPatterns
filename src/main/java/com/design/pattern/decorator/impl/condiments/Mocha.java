package com.design.pattern.decorator.impl.condiments;

import com.design.pattern.decorator.Beverage;
import com.design.pattern.decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ "with Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.1;
    }
}
