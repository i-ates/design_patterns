package com.company.strategy_pattern;

public class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    String duckType;
    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, String duckType) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.duckType=duckType;
    }

    public void swim(){
        System.out.println("I can swim");
    }
    public void display(){
        System.out.println("my type is: "+duckType);
        swim();
        fly();
        quack();
        System.out.println("");
    }

    public  void fly(){
        flyBehavior.fly();
    }
    public void quack(){
        quackBehavior.quack();
    }

}
