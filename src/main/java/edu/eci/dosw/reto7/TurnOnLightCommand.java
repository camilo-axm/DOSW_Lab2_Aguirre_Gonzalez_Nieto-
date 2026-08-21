package edu.eci.dosw.reto7;

/**
 * Turns the light on, and turns it off again when undone.
 */
public class TurnOnLightCommand implements Command {

    private final Light light;
    private final String user;

    public TurnOnLightCommand(Light light, String user) {
        this.light = light;
        this.user = user;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }

    @Override
    public String getDescription() {
        return "Turn ON lights";
    }

    @Override
    public String getUser() {
        return user;
    }
}