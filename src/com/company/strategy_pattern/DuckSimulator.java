package com.company.strategy_pattern;

public class DuckSimulator {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck(new Fly(),new Quack(),"mallardDuck");
        Duck rubberDuck = new RubberDuck(new NoFly(),new Squeak(),"rubberDuck");

        mallardDuck.display();
        rubberDuck.display();
    }
}
