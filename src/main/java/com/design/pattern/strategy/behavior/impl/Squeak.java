package com.design.pattern.strategy.behavior.impl;

import com.design.pattern.strategy.behavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("squeak");
    }
}
