package com.company.strategy_pattern;

public class Quack implements  QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack quack");
    }
}
