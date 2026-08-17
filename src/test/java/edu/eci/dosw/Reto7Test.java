package edu.eci.dosw.reto7;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Reto7Test {

    private RemoteControl remoteControl;
    private Light light;
    private Door door;
    private MusicSystem musicSystem;
    private WindowBlinds windowBlinds;

    @BeforeEach
    void setUp() {
        remoteControl = new RemoteControl();
        light = new Light();
        door = new Door();
        musicSystem = new MusicSystem();
        windowBlinds = new WindowBlinds();
    }

    // Tests the initial state of the devices.

    // Verifies that the light starts turned off.
    @Test
    void lightShouldStartOff() {
        assertFalse(light.isOn());
    }

    // Verifies that the light can be turned on and off.
    @Test
    void lightShouldTurnOnAndOff() {
        light.turnOn();
        assertTrue(light.isOn());
        light.turnOff();
        assertFalse(light.isOn());
    }

    // Verifies that the music system starts at volume 30.
    @Test
    void musicSystemShouldStartAtDefaultVolume() {
        assertEquals(30, musicSystem.getVolume());
    }

    // Verifies that the window blinds start closed.
    @Test
    void windowBlindsShouldStartClosed() {
        assertEquals(0, windowBlinds.getPosition());
    }

    // Tests the individual commands.

    // Verifies that the light command turns the light on.
    @Test
    void turnOnLightCommandShouldTurnLightOn() {
        Command command = new TurnOnLightCommand(light, "Camilo");
        command.execute();
        assertTrue(light.isOn());
    }

    // Verifies that undoing the light command turns the light off.
    @Test
    void turnOnLightCommandUndoShouldTurnLightOff() {
        Command command = new TurnOnLightCommand(light, "Camilo");
        command.execute();
        command.undo();
        assertFalse(light.isOn());
    }

    // Verifies that the volume command changes the music volume.
    @Test
    void setVolumeCommandShouldChangeVolume() {
        Command command = new SetVolumeCommand(musicSystem, "Camilo", 70);
        command.execute();
        assertEquals(70, musicSystem.getVolume());
    }

    // Verifies that undoing the volume command restores the previous volume.
    @Test
    void setVolumeCommandUndoShouldRestorePreviousVolume() {
        Command command = new SetVolumeCommand(musicSystem, "Camilo", 70);
        command.execute();
        command.undo();
        assertEquals(30, musicSystem.getVolume());
    }

    // Verifies that the blind command changes the blind position.
    @Test
    void adjustBlindCommandShouldChangePosition() {
        Command command = new AdjustBlindCommand(windowBlinds, "Sara", 80);
        command.execute();
        assertEquals(80, windowBlinds.getPosition());
    }

    // Verifies that undoing the blind command restores the previous position.
    @Test
    void adjustBlindCommandUndoShouldRestorePreviousPosition() {
        Command command = new AdjustBlindCommand(windowBlinds, "Sara", 80);
        command.execute();
        command.undo();
        assertEquals(0, windowBlinds.getPosition());
    }

    // Verifies that the door command opens the door.
    @Test
    void openDoorCommandShouldOpenDoor() {
        Command command = new OpenDoorCommand(door, "Sara");
        command.execute();
        assertTrue(door.isOpen());
    }

    // Verifies that undoing the door command closes the door.
    @Test
    void openDoorCommandUndoShouldCloseDoor() {
        Command command = new OpenDoorCommand(door, "Sara");
        command.execute();
        command.undo();
        assertFalse(door.isOpen());
    }

    // Tests the ActionRecord class.

    // Verifies that a new action record starts with EXECUTED status.
    @Test
    void actionRecordShouldStartAsExecuted() {
        Command command = new TurnOnLightCommand(light, "Camilo");
        ActionRecord record = new ActionRecord(1, command, "Lights", "ON");

        assertFalse(record.isUndone());
        assertEquals("EXECUTED", record.getStatus());
    }

    // Verifies that marking a record as undone changes its status.
    @Test
    void actionRecordMarkAsUndoneShouldChangeStatus() {
        Command command = new TurnOnLightCommand(light, "Camilo");
        ActionRecord record = new ActionRecord(1, command, "Lights", "ON");

        record.markAsUndone();

        assertTrue(record.isUndone());
        assertEquals("UNDONE", record.getStatus());
    }

    // Tests the complete RemoteControl behavior.

    // Verifies that the remote control executes a command correctly.
    @Test
    void executeCommandShouldRunTheAction() {
        Command command = new TurnOnLightCommand(light, "Camilo");
        remoteControl.executeCommand(command, "Lights", "ON");
        assertTrue(light.isOn());
    }

    // Verifies that undoing an action reverts the device state.
    @Test
    void undoActionShouldRevertTheDevice() {
        Command command = new SetVolumeCommand(musicSystem, "Camilo", 70);
        remoteControl.executeCommand(command, "Music System", "70");

        remoteControl.undoAction(1);

        assertEquals(30, musicSystem.getVolume());
    }

    // Verifies that an invalid action ID does not cause an exception.
    @Test
    void undoActionWithInvalidIdShouldNotThrow() {
        assertDoesNotThrow(() -> remoteControl.undoAction(99));
    }

    // Verifies that undoing the same action twice does not fail.
    @Test
    void undoActionCalledTwiceShouldNotFailOnSecondCall() {
        Command command = new TurnOnLightCommand(light, "Camilo");
        remoteControl.executeCommand(command, "Lights", "ON");

        remoteControl.undoAction(1);
        assertDoesNotThrow(() -> remoteControl.undoAction(1));

        assertFalse(light.isOn());
    }

    // Verifies that multiple actions can be undone independently.
    @Test
    void multipleActionsShouldEachUndoIndependently() {
        Command lightCommand = new TurnOnLightCommand(light, "Camilo");
        Command volumeCommand = new SetVolumeCommand(musicSystem, "Camilo", 70);

        remoteControl.executeCommand(lightCommand, "Lights", "ON");
        remoteControl.executeCommand(volumeCommand, "Music System", "70");

        remoteControl.undoAction(2);

        assertTrue(light.isOn());
        assertEquals(30, musicSystem.getVolume());
    }
}