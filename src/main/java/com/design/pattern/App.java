package com.design.pattern;

import com.design.pattern.decorator.basicexample.Beverage;
import com.design.pattern.decorator.basicexample.impl.beverages.Espresso;
import com.design.pattern.decorator.basicexample.impl.beverages.HouseBlend;
import com.design.pattern.decorator.basicexample.impl.condiments.Mocha;
import com.design.pattern.decorator.basicexample.impl.condiments.Whip;
import com.design.pattern.decorator.javaIODecorator.LowerCaseInputStream;
import com.design.pattern.observer.impl.CurrentConditionDisplay;
import com.design.pattern.observer.impl.WeatherData;
import com.design.pattern.strategy.bean.Duck;
import com.design.pattern.strategy.bean.MallardDuck;

import java.io.*;

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
        Decorator Pattern : basic example
         */

        Beverage espresso = new Espresso();
        Beverage houseBlend = new HouseBlend();
        Beverage mochaEspresso = new Mocha(espresso);
        Beverage whipEspresso = new Whip(espresso);
        Beverage mochaHouseBlend = new Mocha(houseBlend);
        Beverage whipHouseBlend = new Whip(houseBlend);

        System.out.println(mochaEspresso.getDescription() + " costs you " + mochaEspresso.cost());
        System.out.println(whipEspresso.getDescription() + " costs you " + whipEspresso.cost());
        System.out.println(mochaHouseBlend.getDescription() + " costs you " + mochaHouseBlend.cost());
        System.out.println(whipHouseBlend.getDescription() + " costs you " + whipHouseBlend.cost());

        /*
        Decorator Pattern : Java io example
         */
        try {
            int c;
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("README.md")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();


    }
}
