package strategypattern.strategy.quack;

public class QuackWithoutSound implements QuackBehaviour {
    public void quack() {
        System.out.println("I cannot quack.");
    }
}
