package main.java.facadeexample;

public class Main {
    public static void main(String[] args) {
        Projector projector = new Projector();
        DvdPlayer dvdPlayer = new DvdPlayer();
        SurroundSoundSystem soundSystem = new SurroundSoundSystem();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(projector, dvdPlayer, soundSystem);

        homeTheaterFacade.watchMovie("Inception");
        System.out.println("======Finished watching the movie. Ending the movie...======");
        homeTheaterFacade.endMovie();
    }
}
