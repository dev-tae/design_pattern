package main.java.facadeexample;

public class Projector {
    public void on() {
        System.out.println("Projector is turned on");
    }

    public void play(String movie) {
        System.out.println("Projector is playing " + movie);
    }

    public void off() {
        System.out.println("Projector is turned off");
    }
}
