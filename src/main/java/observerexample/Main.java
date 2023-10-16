package main.java.observerexample;

public class Main {
    public static void main(String[] args) {
        ConcreteWeatherData weatherData = new ConcreteWeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();

        weatherData.registerObserver(currentDisplay);

        weatherData.setTemperature(80);
        weatherData.setTemperature(82);
        weatherData.setTemperature(78);
    }
}
