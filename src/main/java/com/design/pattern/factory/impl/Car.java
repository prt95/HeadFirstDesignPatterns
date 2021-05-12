package com.design.pattern.factory.impl;

import com.design.pattern.factory.Vehicle;

public class Car implements Vehicle {
    @Override
    public void ride() {
        System.out.println("riding car");
    }
}
