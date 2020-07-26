package com.design.pattern.strategy.bean;


import com.design.pattern.strategy.behavior.impl.FlyWithWings;
import com.design.pattern.strategy.behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck(){
        super(new FlyWithWings(), new Quack());
    }

    @Override
    public void display() {
        System.out.println("me a mallard duck");
    }
}
