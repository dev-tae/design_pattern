package main.java.stateexample;

public class RedState implements TrafficLightState {
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }

    @Override
    public void display() {
        System.out.println("Red Light - Stop!");
    }
}
