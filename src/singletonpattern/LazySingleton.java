package singletonpattern;

public class LazySingleton {
    private static LazySingleton lazyInstance;

    private LazySingleton() {}

    // Synchronized is used so that multiple threads do not end up creating multiple instances.
    // Synchronized is costly. It should be avoided if getInstance is heavily used.
    // Use Synchronized inside lazyInstance == null check, for optimization here.
    // Use ActiveSingleton if runtime aspects of Singleton are not difficult.

    public static synchronized LazySingleton getInstance() {
        if (lazyInstance == null) {
            lazyInstance = new LazySingleton();
        }

        return lazyInstance;
    }

    public void log(String message) {
        System.out.println("LazySingleton logging message: " + message);
    }
}
