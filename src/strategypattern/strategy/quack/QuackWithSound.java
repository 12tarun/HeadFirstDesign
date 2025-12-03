package strategypattern.strategy.quack;

public class QuackWithSound implements QuackBehaviour {
    public void quack() {
        System.out.println("I am quacking.");
    }
}
