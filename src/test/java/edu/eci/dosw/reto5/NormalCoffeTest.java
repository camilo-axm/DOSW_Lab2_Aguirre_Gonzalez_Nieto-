package edu.eci.dosw.reto5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalCoffeeTest {

    @Test
    void shouldHaveBaseDescription() {
        Coffee coffee = new NormalCoffee();

        assertEquals(
                "Normal Coffee",
                coffee.getCoffeewithToppings()
        );
    }

    @Test
    void shouldHaveBasePrice() {
        Coffee coffee = new NormalCoffee();

        assertEquals(
                5000,
                coffee.getPrice(),
                0.001
        );
    }
}