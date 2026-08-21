package edu.eci.dosw.reto7;

/**
 * Open the door, and close it when undone
 */
public class OpenDoorCommand implements Command {

    private final Door door;
    private final String user;

    public OpenDoorCommand(Door door, String user) {
        this.door = door;
        this.user = user;
    }

    @Override
    public void execute() {
        door.open();
    }

    @Override
    public void undo() {
        door.close();
    }

    @Override
    public String getDescription() {
        return "Open door";
    }

    @Override
    public String getUser() {
        return user;
    }
}