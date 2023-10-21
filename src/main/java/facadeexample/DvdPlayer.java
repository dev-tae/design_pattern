package main.java.facadeexample;

public class DvdPlayer {
    public void on() {
        System.out.println("DVD Player is turned on");
    }

    public void play(String movie) {
        System.out.println("DVD Player is playing " + movie);
    }

    public void stop() {
        System.out.println("DVD Player has stopped");
    }

    public void eject() {
        System.out.println("DVD is ejected");
    }

    public void off() {
        System.out.println("DVD Player is turned off");
    }
}
