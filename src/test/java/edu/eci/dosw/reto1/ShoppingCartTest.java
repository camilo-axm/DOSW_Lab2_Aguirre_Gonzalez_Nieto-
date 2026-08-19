package edu.eci.dosw.reto1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
        cart.addProduct(new Product("rice", 20000));
        cart.addProduct(new Product("rice", 20000));
        cart.addProduct(new Product("milk", 500));
        cart.addProduct(new Product("milk", 500));
        cart.addProduct(new Product("milk", 500));
        for (int i = 0; i < 5; i++) {
            cart.addProduct(new Product("soda", 3000));
        }
    }

    @Test
    void shouldCalculateCorrectSubtotal() {
        assertEquals(56500, cart.calculateSubtotal(), 0.001);
    }

    @Test
    void shouldCalculateCorrectDiscountForFrequentCustomer() {
        Customer customer = new FrequentCustomer("Sara");
        assertEquals(5650, cart.calculateDiscount(customer), 0.001);
    }

    @Test
    void shouldCalculateCorrectTotalForFrequentCustomer() {
        Customer customer = new FrequentCustomer("Sara");
        assertEquals(50850, cart.calculateTotal(customer), 0.001);
    }

    @Test
    void shouldCalculateCorrectTotalForNewCustomer() {
        Customer customer = new NewCustomer("Juan");
        double expectedTotal = 56500 - (56500 * 0.05);
        assertEquals(expectedTotal, cart.calculateTotal(customer), 0.001);
    }
}