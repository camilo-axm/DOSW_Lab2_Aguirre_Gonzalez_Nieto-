package edu.eci.dosw.reto6;

public enum Priority {
    LOW(1), MEDIUM(2), HEIGHT(3);

    private final int value;

    Priority(int value) {
        this.value = value;
    }

    public int getValor() {
        return value;
    }
}