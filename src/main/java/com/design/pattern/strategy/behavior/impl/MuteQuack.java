package com.design.pattern.strategy.behavior.impl;


import com.design.pattern.strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("cam't strategy.behavior.impl.Quack");
    }
}
