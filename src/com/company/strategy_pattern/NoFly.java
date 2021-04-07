package com.company.strategy_pattern;

public class NoFly implements  FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can not fly");
    }
}
