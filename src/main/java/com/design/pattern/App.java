package com.design.pattern;

import com.design.pattern.decorator.Beverage;
import com.design.pattern.decorator.impl.beverages.Espresso;
import com.design.pattern.decorator.impl.beverages.HouseBlend;
import com.design.pattern.decorator.impl.condiments.Mocha;
import com.design.pattern.decorator.impl.condiments.Whip;
import com.design.pattern.observer.impl.CurrentConditionDisplay;
import com.design.pattern.observer.impl.WeatherData;
import com.design.pattern.strategy.bean.Duck;
import com.design.pattern.strategy.bean.MallardDuck;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        /*
        Strategy Pattern
         */
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        /*
         Observer Pattern
         */
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        //create different implementations of display
        // CurrentConditionDisplay2 currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        // CurrentConditionDisplay3 currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(10, 10, 10);
        weatherData.setMeasurements(20, 20, 20);

        /*
        Decorator Pattern
         */

        Beverage espresso = new Espresso();
        Beverage houseBlend = new HouseBlend();
        Beverage mochaEspresso = new Mocha(espresso);
        Beverage whipEspresso = new Whip(espresso);
        Beverage mochaHouseBlend = new Mocha(houseBlend);
        Beverage whipHouseBlend = new Whip(houseBlend);

        System.out.println(mochaEspresso.getDescription()+ " costs you "+ mochaEspresso.cost());
        System.out.println(whipEspresso.getDescription()+ " costs you "+ whipEspresso.cost());
        System.out.println(mochaHouseBlend.getDescription()+ " costs you "+ mochaHouseBlend.cost());
        System.out.println(whipHouseBlend.getDescription()+ " costs you "+ whipHouseBlend.cost());



    }
}
