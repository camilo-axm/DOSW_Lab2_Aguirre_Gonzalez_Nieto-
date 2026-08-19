package edu.eci.dosw.reto5;

public final class Topping {

    private final String name;
    private final double price;

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}