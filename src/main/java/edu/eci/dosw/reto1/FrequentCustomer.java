package edu.eci.dosw.reto1;

/**
 * Customer who receives a 10% discount.
 */
public class FrequentCustomer extends Customer {

    public FrequentCustomer(String name) {
        super(name, subtotal -> subtotal * 0.10);
    }
}