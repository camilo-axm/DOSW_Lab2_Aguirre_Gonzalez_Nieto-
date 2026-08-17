package edu.eci.dosw.reto7;

/**
 * Command interface (Command design pattern).
 * Encapsulates a request to perform an action on a device as an object,
 * allowing the invoker ({@link RemoteControl}) to execute, undo, and log
 * actions without knowing the internal details of each device.
 */
public interface Command {

    /*Executes the action encapsulated by this command. */
    void execute();

    /**
     * Reverts the effect of execute(), restoring the device
     * to its previous state
     */
    void undo();

    /**Returns a human-readable description of the action performed */
    String getDescription();

    /**
     * Returns the user who requested the execution of this command.
     */
    String getUser();
}