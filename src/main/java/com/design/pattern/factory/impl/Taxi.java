package com.design.pattern.factory.impl;

import com.design.pattern.factory.Vehicle;

public class Taxi implements Vehicle {
    @Override
    public void ride() {
        System.out.println("riding taxi");
    }
}
