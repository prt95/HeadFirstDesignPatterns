package com.design.pattern.singleton;

public class Singleton {

    public static Singleton singleton=null;

    public static  Singleton getInstance() {
        if(singleton==null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;

    }

    public void printHashCode(){
        System.out.println(this.hashCode());
    }

}
