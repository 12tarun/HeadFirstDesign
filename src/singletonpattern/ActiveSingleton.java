package singletonpattern;

public class ActiveSingleton {
    private static final ActiveSingleton activeInstance = new ActiveSingleton();

    private ActiveSingleton() {}

    public static ActiveSingleton getInstance() {
        return activeInstance;
    }

    public void log(String message) {
        System.out.println("ActiveSingleton logging message: " + message);
    }
}
