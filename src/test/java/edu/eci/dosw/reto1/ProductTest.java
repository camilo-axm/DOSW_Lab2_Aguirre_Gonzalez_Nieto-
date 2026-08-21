package edu.eci.dosw.reto1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductTest {

    @Test
    void productShouldKeepImmutablePrice() {
        Product product = new Product("Cookies", 500);
        assertEquals(500, product.getUnitPrice(), 0.001);
        assertEquals("Cookies", product.getName());
    }
}