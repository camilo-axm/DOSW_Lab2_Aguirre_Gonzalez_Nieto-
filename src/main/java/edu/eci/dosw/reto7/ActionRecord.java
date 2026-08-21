package edu.eci.dosw.reto7;

/**
 * Stores the record of an already executed action for history and undo.
 * Instead of having two separate lists (one for commands and another for records),
 * the record directly stores the command so it can be undone later.
 */
public class ActionRecord {

    private final int id;
    private final Command command;
    private final String device;
    private final String parameters;
    private boolean undone;

    public ActionRecord(
            int id,
            Command command,
            String device,
            String parameters) {

        this.id = id;
        this.command = command;
        this.device = device;
        this.parameters = parameters;
        this.undone = false;
    }

    public int getId() {
        return id;
    }

    public Command getCommand() {
        return command;
    }

    /**
     * Gets the user directly from the command, so there is no need to store it twice.
     */
    public String getUser() {
        return command.getUser();
    }

    public String getAction() {
        return command.getDescription();
    }

    public String getDevice() {
        return device;
    }

    public String getParameters() {
        return parameters;
    }

    public boolean isUndone() {
        return undone;
    }

    public void markAsUndone() {
        undone = true;
    }

    public String getStatus() {
        return undone ? "UNDONE" : "EXECUTED";
    }
}
