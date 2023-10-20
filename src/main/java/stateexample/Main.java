package main.java.stateexample;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        for (int i = 0; i < 6; ++i) {
            trafficLight.display();
            trafficLight.change();
        }
    }
}
