package com.design.pattern.observer.impl;

import com.design.pattern.observer.Observer;
import com.design.pattern.observer.Subject;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers = new ArrayList<>();
    private float temp;
    private float humid;
    private float pressure;
    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i= observers.indexOf(observer);
        if(i>=0) {
            this.observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers){
            o.update(this.temp, this.humid, this.pressure);
        }
    }
    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp, float humid, float pressure){
        this.temp = temp;
        this.humid = humid;
        this.pressure= pressure;
        this.measurementsChanged();
    }
}
