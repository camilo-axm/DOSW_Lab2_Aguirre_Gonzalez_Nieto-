package edu.eci.dosw.reto7;

/**
 * Changes the volume of the music system.
 * Stores the previous volume before changing it so it can be restored with undo.
 */
public class SetVolumeCommand implements Command {

    private final MusicSystem musicSystem;
    private final String user;
    private final int newVolume;
    private int previousVolume;

    public SetVolumeCommand(MusicSystem musicSystem, String user, int newVolume) {
        this.musicSystem = musicSystem;
        this.user = user;
        this.newVolume = newVolume;
    }

    @Override
    public void execute() {
        previousVolume = musicSystem.getVolume();
        musicSystem.setVolume(newVolume);
    }

    @Override
    public void undo() {
        musicSystem.setVolume(previousVolume);
    }

    @Override
    public String getDescription() {
        return "Set volume to " + newVolume;
    }

    @Override
    public String getUser() {
        return user;
    }
}