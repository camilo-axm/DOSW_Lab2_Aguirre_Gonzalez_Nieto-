package edu.eci.dosw.reto7;

import java.util.ArrayList;
import java.util.List;

/**
 * This is the class that "invokes" the commands, basically the remote control itself.
 * Before, there was one list of commands and another list of records separately,
 * but this is risky because if they become out of sync, everything breaks.
 * So instead, ActionRecord stores the command inside it, and one list is enough.
 */
public class RemoteControl {

    private final List<ActionRecord> history;
    private int nextActionId;

    public RemoteControl() {
        history = new ArrayList<>();
        nextActionId = 1;
    }

    public void executeCommand(Command command, String device, String parameters) {

        command.execute();

        ActionRecord record = new ActionRecord(
                nextActionId,
                command,
                device,
                parameters
        );

        history.add(record);

        System.out.println(
                "Action #" + nextActionId
                        + " executed by " + command.getUser()
        );

        nextActionId++;
    }

    /**
     * Undoes an action by its ID. If it does not exist or was already undone, it does nothing.
     */
    public void undoAction(int actionId) {

        if (actionId < 1 || actionId > history.size()) {
            System.out.println("Action not found.");
            return;
        }

        ActionRecord record = history.get(actionId - 1);

        if (record.isUndone()) {
            System.out.println("Action #" + actionId + " is already undone.");
            return;
        }

        record.getCommand().undo();
        record.markAsUndone();

        System.out.println("Action #" + actionId + " undone.");
    }

    public void showHistory() {

        System.out.println();
        System.out.println("Action History:");

        for (ActionRecord record : history) {
            System.out.println(
                    "#" + record.getId()
                            + " | User: " + record.getUser()
                            + " | Action: " + record.getAction()
                            + " | Device: " + record.getDevice()
                            + " | Parameters: " + record.getParameters()
                            + " | Status: " + record.getStatus()
            );
        }
    }
}