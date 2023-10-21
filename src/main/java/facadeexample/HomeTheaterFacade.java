package main.java.facadeexample;

public class HomeTheaterFacade {
    private Projector projector;
    private DvdPlayer dvdPlayer;
    private SurroundSoundSystem soundSystem;

    public HomeTheaterFacade(Projector projector, DvdPlayer dvdPlayer, SurroundSoundSystem soundSystem) {
        this.projector = projector;
        this.dvdPlayer = dvdPlayer;
        this.soundSystem = soundSystem;
    }

    public void watchMovie(String movie) {
        System.out.println("Preparing to watch movie...");
        projector.on();
        projector.play(movie);
        dvdPlayer.on();
        dvdPlayer.play(movie);
        soundSystem.on();
        soundSystem.setVolume(5);
    }

    public void endMovie() {
        System.out.println("Shutting down movie theater...");
        projector.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
        soundSystem.off();
    }
}
