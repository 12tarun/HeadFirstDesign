package singletonpattern;

public class Logger {
    public void performLogging() {
        ActiveSingleton kibanaLogger = ActiveSingleton.getInstance();
        kibanaLogger.log("Kibana logs");

        LazySingleton grafanaLogger = LazySingleton.getInstance();
        grafanaLogger.log("Grafana logs");
    }
}
