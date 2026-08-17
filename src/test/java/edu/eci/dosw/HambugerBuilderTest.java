package edu.eci.dosw.tests;

import edu.eci.dosw.reto2.ConcreteHamburgerBuilder;
import edu.eci.dosw.reto2.Hamburger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class HamburgerBuilderTest {

    /**
     * Test 1:
     * Verifies that the Builder can create a customized hamburger
     * using different types of ingredients.
     */
    @Test
    void shouldBuildCustomizedHamburger() {

        Hamburger hamburger = new ConcreteHamburgerBuilder()
                .addBread("Bread of brioche", 2500)
                .addMeat("Beef", 6000)
                .addCheese("Cheese cheddar", 1800)
                .addVegetable("Lettuce", 500)
                .addSauce("BBQ Sauce", 700)
                .addIngredient("Bacon", 2500)
                .build();

        assertNotNull(hamburger);
        assertEquals(6, hamburger.getIngredients().size());
    }

    /**
     * Test 2:
     * Verifies that the total price of the customized hamburger
     * is calculated correctly using the selected ingredients.
     */
    @Test
    void shouldCalculateTotalPriceCorrectly() {

        Hamburger hamburger = new ConcreteHamburgerBuilder()
                .addBread("Bread of brioche", 2500)
                .addMeat("Beef", 6000)
                .addCheese("Cheese cheddar", 1800)
                .addIngredient("Bacon", 2500)
                .build();

        assertEquals(12800, hamburger.getTotalPrice());
    }

    /**
     * Test 3:
     * Verifies that all selected ingredients are correctly stored
     * in the final hamburger in the same order in which they were added.
     */
    @Test
    void shouldContainSelectedIngredients() {

        Hamburger hamburger = new ConcreteHamburgerBuilder()
                .addBread("Bread of brioche", 2500)
                .addMeat("Beef", 6000)
                .addVegetable("Lettuce", 500)
                .addVegetable("Tomato", 300)
                .addIngredient("Bacon", 2500)
                .build();

        assertEquals("Bread of brioche",
                hamburger.getIngredients().get(0).getName());

        assertEquals("Beef",
                hamburger.getIngredients().get(1).getName());

        assertEquals("Lettuce",
                hamburger.getIngredients().get(2).getName());

        assertEquals("Tomato",
                hamburger.getIngredients().get(3).getName());

        assertEquals("Bacon",
                hamburger.getIngredients().get(4).getName());
    }
}
