package edu.eci.dosw.reto1;

public abstract class Customer {

    private final String name;
    private final Discount discount;

    protected Customer(String name, Discount discount) {
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