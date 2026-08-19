package edu.eci.dosw.reto1;

public class FrequentCustomer extends CustomerDiscountTest {
    
    public FrequentCustomer(String name) {
        super(name, subtotal -> subtotal * 0.10); // Discount como lambda
    }
}