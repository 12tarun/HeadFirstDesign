package observerpattern;

import observerpattern.observers.AverageConditionDisplay;
import observerpattern.observers.CurrentConditionDisplay;
import observerpattern.subject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentCondition = new CurrentConditionDisplay(weatherData);
        AverageConditionDisplay averageCondition = new AverageConditionDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
