package strategypattern.strategy.fly;

public class FlyWithoutWings implements FlyingBehaviour {
    public void fly() {
        System.out.println("I cannot fly.");
    }
}
