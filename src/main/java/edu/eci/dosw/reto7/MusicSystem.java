package edu.eci.dosw.reto7;

public class MusicSystem {

    private int volume;

    /**
     * Starts at volume 30 by default.
     */
    public MusicSystem() {
        this.volume = 30;
    }

    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Music volume set to " + volume + ".");
    }

    public int getVolume() {
        return volume;
    }
}