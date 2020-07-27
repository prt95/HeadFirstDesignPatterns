package com.design.pattern.strategy.bean;
//It is a compile time error to import a type from the unnamed package.
//Classes in the default package cannot be imported by classes in packages. This is why you should not use the default package.


import com.design.pattern.strategy.behavior.FlyBehavior;
import com.design.pattern.strategy.behavior.QuackBehavior;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;


    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        setFlyBehavior(flyBehavior);
        setQuackBehavior(quackBehavior);
    }

    public void swim() {
        System.out.println("all ducks swim");
    }



        /*
        To change strategy.behavior at runtime
         */

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /*
    Not exposing it.
     */
//    public strategy.behavior.QuackBehavior getQuackBehavior() {
//        return quackBehavior;
//    }

    //    public strategy.behavior.FlyBehavior getFlyBehavior() {
//        return flyBehavior;
//    }


}
