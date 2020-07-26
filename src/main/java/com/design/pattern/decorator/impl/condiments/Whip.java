package com.design.pattern.decorator.impl.condiments;

import com.design.pattern.decorator.Beverage;
import com.design.pattern.decorator.CondimentDecorator;

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
