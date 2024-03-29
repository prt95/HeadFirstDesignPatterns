package com.design.pattern;

import com.design.pattern.abstractfactory.Location;
import com.design.pattern.abstractfactory.factories.MainCarFactory;
import com.design.pattern.builder.BankAccount;
import com.design.pattern.decorator.basicexample.Beverage;
import com.design.pattern.decorator.basicexample.impl.beverages.Espresso;
import com.design.pattern.decorator.basicexample.impl.beverages.HouseBlend;
import com.design.pattern.decorator.basicexample.impl.condiments.Mocha;
import com.design.pattern.decorator.basicexample.impl.condiments.Whip;
import com.design.pattern.decorator.javaIODecorator.LowerCaseInputStream;
import com.design.pattern.factory.Vehiclefactory;
import com.design.pattern.observer.impl.CurrentConditionDisplay;
import com.design.pattern.observer.impl.WeatherData;
import com.design.pattern.singleton.Singleton;
import com.design.pattern.strategy.bean.Duck;
import com.design.pattern.strategy.bean.MallardDuck;

import java.io.*;

import static com.design.pattern.abstractfactory.CarType.MICRO;

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

        /*
            Factory pattern
         */

        Vehiclefactory vehiclefactory = new Vehiclefactory();
        vehiclefactory.createVehicle("CAR").ride();
        vehiclefactory.createVehicle("TAXI").ride();


       /*
        Abstract factory pattern
        */

        MainCarFactory mainCarFactory = new MainCarFactory();
        mainCarFactory.buildCar(MICRO, Location.IN);
        mainCarFactory.buildCar(MICRO, Location.US);


        /*
        Singleton
         */

        Singleton singleton = Singleton.getInstance();
        singleton.printHashCode();
        Singleton singleton2 = Singleton.getInstance();
        singleton2.printHashCode();

        /*
        Builder pattern
         */

        BankAccount bankAccount = new BankAccount.Builder(1).atBranch("KA").atRate(2).build();

    }
}
