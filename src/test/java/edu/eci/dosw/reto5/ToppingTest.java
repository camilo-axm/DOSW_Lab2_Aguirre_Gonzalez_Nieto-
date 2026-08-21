package edu.eci.dosw.reto5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToppingTest {

    @Test
    void shouldStoreToppingInformation() {
        Topping topping = new Topping("Milk", 1000);

        assertEquals("Milk", topping.getName());
        assertEquals(1000, topping.getPrice(), 0.001);
    }
}