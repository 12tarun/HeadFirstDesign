package strategypattern;

import strategypattern.strategy.fly.FlyingBehaviour;
import strategypattern.strategy.quack.QuackBehaviour;

public abstract class Duck {

    FlyingBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void swim() {
        System.out.println("I am swimming.");
    }

    public void display() {
        System.out.println("I am a duck.");
    }

    public void performFly() { flyBehaviour.fly(); }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(FlyingBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}
