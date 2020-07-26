package com.design.pattern.strategy.behavior.impl;

import com.design.pattern.strategy.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("can't fly");
    }
}
