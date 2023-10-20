package main.java.stateexample;

public class GreenState implements TrafficLightState {

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }

    @Override
    public void display() {
        System.out.println("Green Light - Go!");
    }
}
