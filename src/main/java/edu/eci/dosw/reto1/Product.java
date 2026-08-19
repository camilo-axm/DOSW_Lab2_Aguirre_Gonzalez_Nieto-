package edu.eci.dosw.reto1;

public final class Product {
/**
 * Represents a product with an name and unit price.
 */

    private final String name; //Nadie puede modificar ni cambiar//
    private final double unitPrice;

    public Product(String name, double unitPrice) {
        this.name = name;
        this.unitPrice = unitPrice;
    }

    public String getName() {
        return name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}