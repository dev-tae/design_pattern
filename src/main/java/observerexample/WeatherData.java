package main.java.observerexample;

public interface WeatherData {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
