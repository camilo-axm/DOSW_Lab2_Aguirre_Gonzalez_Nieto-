package edu.eci.dosw.reto1;

public class NewCustomer extends CustomerDiscountTest {
    public NewCustomer(String name) {
        super(name, subtotal -> subtotal * 0.05);
    }
}