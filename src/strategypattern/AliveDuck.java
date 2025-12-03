package strategypattern;

import strategypattern.strategy.fly.FlyWithWings;
import strategypattern.strategy.fly.FlyWithoutWings;
import strategypattern.strategy.quack.QuackWithSound;
import strategypattern.strategy.quack.QuackWithoutSound;

public class AliveDuck extends Duck {
    public AliveDuck() {
        flyBehaviour = new FlyWithoutWings();
        quackBehaviour = new QuackWithoutSound();
    }

    public static void main(String[] args) {
        Duck newBornDuck = new AliveDuck();
        newBornDuck.display();
        newBornDuck.swim();
        newBornDuck.performFly();
        newBornDuck.performQuack();
        newBornDuck.setFlyBehaviour(new FlyWithWings());
        newBornDuck.setQuackBehaviour(new QuackWithSound());
        newBornDuck.performFly();
        newBornDuck.performQuack();
    }
}
