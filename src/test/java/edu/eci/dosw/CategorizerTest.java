package edu.eci.dosw;

import edu.eci.dosw.reto3.Car;
import edu.eci.dosw.reto3.Categorizer;
import edu.eci.dosw.reto3.EconomyCategorizer;
import edu.eci.dosw.reto3.EconomyCategory;
import edu.eci.dosw.reto3.LuxuryCategorizer;
import edu.eci.dosw.reto3.LuxuryCategory;
import edu.eci.dosw.reto3.UsedCategorizer;
import edu.eci.dosw.reto3.UsedCategory;
import edu.eci.dosw.reto3.Vehicle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

/**
 * Tests for the Categorizer hierarchy of Challenge 3 (Factory Method
 * pattern): verifies each concrete Categorizer creates the right
 * Category and correctly assigns it to a Vehicle.
 */
class CategorizerTest {

    /**
     * Test 1:
     * Verifies that each concrete Categorizer creates an instance
     * of the correct Category type.
     */
    @Test
    void shouldCreateTheCorrectCategoryType() {

        Categorizer economyCategorizer = new EconomyCategorizer();
        Categorizer luxuryCategorizer = new LuxuryCategorizer();
        Categorizer usedCategorizer = new UsedCategorizer();

        assertInstanceOf(EconomyCategory.class, economyCategorizer.createCategory());
        assertInstanceOf(LuxuryCategory.class, luxuryCategorizer.createCategory());
        assertInstanceOf(UsedCategory.class, usedCategorizer.createCategory());
    }

    /**
     * Test 2:
     * Verifies that assignCategory() sets the created category
     * on the given vehicle.
     */
    @Test
    void shouldAssignCategoryToVehicle() {

        Vehicle car = new Car();
        Categorizer categorizer = new LuxuryCategorizer();

        categorizer.assignCategory(car);

        assertEquals("luxury", car.getCategory());
    }
}
