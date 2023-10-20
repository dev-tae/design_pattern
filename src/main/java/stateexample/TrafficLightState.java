package main.java.stateexample;

public interface TrafficLightState {
    void next(TrafficLight trafficLight);
    void display();
}