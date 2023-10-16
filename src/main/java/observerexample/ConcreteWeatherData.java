package main.java.observerexample;

import java.util.ArrayList;
import java.util.List;

public class ConcreteWeatherData implements WeatherData {
    private final List<Observer> observers;
    private float temperature;

    public ConcreteWeatherData() {
        this.observers = new ArrayList<>();
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}
