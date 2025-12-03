package observerpattern.observers;

import observerpattern.interfaces.Display;
import observerpattern.interfaces.Observer;
import observerpattern.interfaces.Subject;

public class AverageConditionDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;

    public AverageConditionDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Updating average conditions... ");
        this.temperature = (this.temperature + temperature)/2;
        this.humidity = (this.humidity + humidity)/2;
        this.pressure = (this.pressure + pressure)/2;
        displayMessage();
    }

    @Override
    public void displayMessage() {
        System.out.println(
                "Average conditions: temperature - " + temperature +
                        " humidity - " + humidity + " pressure - " + pressure
        );
    }
}
