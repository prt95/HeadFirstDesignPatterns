package com.design.pattern.decorator.basicexample.impl.condiments;

import com.design.pattern.decorator.basicexample.Beverage;
import com.design.pattern.decorator.basicexample.CondimentDecorator;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + "with Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.2;
    }
}
