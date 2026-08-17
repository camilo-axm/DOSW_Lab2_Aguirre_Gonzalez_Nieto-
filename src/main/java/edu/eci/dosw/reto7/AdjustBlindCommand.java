package edu.eci.dosw.reto7;

/**
 * Moves the blinds to a new position and stores the previous position for undo.
 */
public class AdjustBlindCommand implements Command {

    private final WindowBlinds windowBlinds;
    private final String user;
    private final int newPosition;
    private int previousPosition;

    public AdjustBlindCommand(WindowBlinds windowBlinds, String user, int newPosition) {
        this.windowBlinds = windowBlinds;
        this.user = user;
        this.newPosition = newPosition;
    }

    @Override
    public void execute() {
        previousPosition = windowBlinds.getPosition();
        windowBlinds.setPosition(newPosition);
    }

    @Override
    public void undo() {
        windowBlinds.setPosition(previousPosition);
    }

    @Override
    public String getDescription() {
        return "Adjust blinds to " + newPosition + "%";
    }

    @Override
    public String getUser() {
        return user;
    }
}