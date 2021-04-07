package com.company.strategy_pattern;

public class MallardDuck  extends Duck{


    public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, String duckType) {
        super(flyBehavior, quackBehavior, duckType);
    }
}
