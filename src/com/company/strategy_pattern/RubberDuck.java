package com.company.strategy_pattern;

public class RubberDuck extends Duck {


    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, String duckType) {
        super(flyBehavior, quackBehavior, duckType);
    }
}
