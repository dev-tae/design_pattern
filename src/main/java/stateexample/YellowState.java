package main.java.stateexample;

public class YellowState implements TrafficLightState {
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }

    @Override
    public void display() {
        System.out.println("Yellow Light - Get Ready!");
    }
}
