package edu.eci.dosw.reto7;

/**
 * Window blinds that can be opened and closed.
 */
public class WindowBlinds {

    /**
     * 0 = closed, 100 = fully open
     */
    private int position;

    public WindowBlinds() {
        this.position = 0;
    }

    public void setPosition(int position) {
        this.position = position;
        System.out.println("Window blinds position set to " + position + "%.");
    }

    public int getPosition() {
        return position;
    }
}