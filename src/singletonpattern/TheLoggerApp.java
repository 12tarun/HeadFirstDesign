package singletonpattern;

public class TheLoggerApp {
    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.performLogging();
    }
}
