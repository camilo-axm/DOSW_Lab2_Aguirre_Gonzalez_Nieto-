package edu.eci.dosw.reto1;

/**
 * Customer who receives a 5% discount.
 */
public class NewCustomer extends Customer {

    public NewCustomer(String name) {
        super(name, subtotal -> subtotal * 0.05);
    }
}