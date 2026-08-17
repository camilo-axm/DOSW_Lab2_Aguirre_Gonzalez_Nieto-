package edu.eci.dosw.reto7;

public class Door {

    private boolean open;

    public void open() {
        open = true;
        System.out.println("Door OPENED.");
    }

    public void close() {
        open = false;
        System.out.println("Door CLOSED.");
    }

    public boolean isOpen() {
        return open;
    }
}