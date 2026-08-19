package edu.eci.dosw.reto1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomerDiscountTest {

    @Test
    void newCustomerShouldGetFivePercentDiscount() {
        Customer customer = new NewCustomer("Juan");
        double discount = customer.getDiscountPercentage(100000);
        assertEquals(5000, discount, 0.001);
    }

    @Test
    void frequentCustomerShouldGetTenPercentDiscount() {
        Customer customer = new FrequentCustomer("Sara");
        double discount = customer.getDiscountPercentage(100000);
        assertEquals(10000, discount, 0.001);
    }
}