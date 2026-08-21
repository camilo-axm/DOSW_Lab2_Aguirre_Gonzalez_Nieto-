package edu.eci.dosw.reto1;

public abstract class Customer {
/**
 * Represents a customer and its discount strategy.
 */

    private final String name;
    private final Discount discount;

    protected Customer(String name, Discount discount) {
        /*polimorfismo customer represent diferent types of customers */
        this.name = name;
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public double getDiscountPercentage(double subtotal) {
        return discount.calculateDiscount(subtotal);
    }
}