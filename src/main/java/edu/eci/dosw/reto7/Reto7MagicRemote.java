package edu.eci.dosw.reto7;

/**
 * Runs the Challenge 7 demo: remote control using the Command pattern.
 */
public final class Reto7MagicRemote {

    private Reto7MagicRemote() {
    }

    public static void run() {

        System.out.println();
        System.out.println("Challenge 7");
        System.out.println("Magic Remote Control");

        Light light = new Light();
        Door door = new Door();
        MusicSystem musicSystem = new MusicSystem();
        WindowBlinds windowBlinds = new WindowBlinds();

        RemoteControl remoteControl = new RemoteControl();

        Command turnOnLights = new TurnOnLightCommand(light, "Camilo");
        Command setVolume = new SetVolumeCommand(musicSystem, "Camilo", 70);
        Command adjustBlinds = new AdjustBlindCommand(windowBlinds, "Sara", 80);
        Command openDoor = new OpenDoorCommand(door, "Sara");

        remoteControl.executeCommand(turnOnLights, "Lights", "ON");
        remoteControl.executeCommand(setVolume, "Music System", "70");
        remoteControl.executeCommand(adjustBlinds, "Window Blinds", "80%");
        remoteControl.executeCommand(openDoor, "Door", "OPEN");

        System.out.println();
        System.out.println("Undoing action #2");

        remoteControl.undoAction(2);

        remoteControl.showHistory();

        System.out.println();
        System.out.println("Final Device State");

        System.out.println("Lights: " + (light.isOn() ? "ON" : "OFF"));
        System.out.println("Music volume: " + musicSystem.getVolume());
        System.out.println("Window blinds: " + windowBlinds.getPosition() + "%");
        System.out.println("Door: " + (door.isOpen() ? "OPEN" : "CLOSED"));
    }
}