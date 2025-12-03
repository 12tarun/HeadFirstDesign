package strategypattern;

import strategypattern.strategy.fly.FlyWithoutWings;
import strategypattern.strategy.quack.QuackWithoutSound;

public class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehaviour = new FlyWithoutWings();
        quackBehaviour = new QuackWithoutSound();
    }

    public static void main(String[] args) {
        Duck newMadeDuck = new WoodenDuck();
        newMadeDuck.display();
        newMadeDuck.swim();
        newMadeDuck.performFly();
        newMadeDuck.performQuack();
    }
}
