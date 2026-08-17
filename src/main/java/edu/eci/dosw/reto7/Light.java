package edu.eci.dosw.reto7;

/**
 * Simple device, only on/off
 */
public class Light {

    private boolean on;

    public void turnOn() {
        on = true;
        System.out.println("Lights turned ON.");
    }

    public void turnOff() {
        on = false;
        System.out.println("Lights turned OFF.");
    }

    public boolean isOn() {
        return on;
    }
}