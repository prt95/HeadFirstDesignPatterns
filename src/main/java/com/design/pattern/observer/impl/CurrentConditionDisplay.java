package com.design.pattern.observer.impl;

import com.design.pattern.observer.DisplayElement;
import com.design.pattern.observer.Observer;
import com.design.pattern.observer.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private float temp;
    private float humid;
    private float pressue;
    private Subject weatherdata;

    public CurrentConditionDisplay(Subject weatherdata) {
        this.weatherdata = weatherdata;
        weatherdata.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current conditions: " + temp + "degrees F and " + humid + "% humidity");
    }

    @Override
    public void update(float temp, float humid, float pressure) {
        this.temp = temp;
        this.humid = humid;
        this.pressue = pressure;
        this.display();
    }
}
