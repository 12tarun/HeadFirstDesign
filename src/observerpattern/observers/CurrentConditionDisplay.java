package observerpattern.observers;

import observerpattern.interfaces.Display;
import observerpattern.interfaces.Observer;
import observerpattern.interfaces.Subject;

public class CurrentConditionDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private float pressure;

    public CurrentConditionDisplay(Subject weatherData) {
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Updating current conditions... ");
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        displayMessage();
    }

    @Override
    public void displayMessage() {
        System.out.println(
                "Current conditions: temperature - " + temperature +
                        " humidity - " + humidity + " pressure - " + pressure
        );
    }
}
