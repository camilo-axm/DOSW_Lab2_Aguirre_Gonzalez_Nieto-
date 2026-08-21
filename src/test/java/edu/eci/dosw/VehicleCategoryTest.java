package edu.eci.dosw;

import edu.eci.dosw.reto3.Category;
import edu.eci.dosw.reto3.EconomyCategory;
import edu.eci.dosw.reto3.LuxuryCategory;
import edu.eci.dosw.reto3.UsedCategory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for the three Category implementations of Challenge 3
 * (Strategy pattern): verifies the price/speed adjustment factors
 * and the equipment text appended by each category.
 */
class VehicleCategoryTest {

    /**
     * Test 1:
     * Verifies that EconomyCategory reduces speed by 10% and applies
     * a 5% discount to the price.
     */
    @Test
    void shouldApplyEconomyAdjustmentsCorrectly() {

        Category category = new EconomyCategory();

        assertEquals(108.0f, category.getMaximunSpeed(120f), 0.001f);
        assertEquals(950.0f, category.getPrice(1000f), 0.001f);
        assertEquals("standard", category.getComfort());
        assertEquals("economy", category.getType());
    }

    /**
     * Test 2:
     * Verifies that LuxuryCategory increases speed by 15% and applies
     * a 10% surcharge to the price, plus VIP equipment extras.
     */
    @Test
    void shouldApplyLuxuryAdjustmentsCorrectly() {

        Category category = new LuxuryCategory();

        assertEquals(138.0f, category.getMaximunSpeed(120f), 0.001f);
        assertEquals(1100.0f, category.getPrice(1000f), 0.001f);
        assertEquals("luxury", category.getType());

        String equipment = category.getEquipment("\n\tair conditioning.");
        assertTrue(equipment.contains("VIP maintenance service."));
    }

    /**
     * Test 3:
     * Verifies that UsedCategory increases speed by 5% but applies
     * a 10% discount to the price, plus a shorter warranty.
     */
    @Test
    void shouldApplyUsedAdjustmentsCorrectly() {

        Category category = new UsedCategory();

        assertEquals(126.0f, category.getMaximunSpeed(120f), 0.001f);
        assertEquals(900.0f, category.getPrice(1000f), 0.001f);
        assertEquals("basic", category.getComfort());

        String equipment = category.getEquipment("\n\tair conditioning.");
        assertTrue(equipment.contains("Standard Warranty (3 months)."));
    }
}
