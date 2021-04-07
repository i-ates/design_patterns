package com.company.strategy_pattern;

public class Fly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
