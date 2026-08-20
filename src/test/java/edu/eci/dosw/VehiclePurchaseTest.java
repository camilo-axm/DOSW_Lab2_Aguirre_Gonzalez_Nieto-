package edu.eci.dosw;

import edu.eci.dosw.reto3.AirVehicleFactory;
import edu.eci.dosw.reto3.Car;
import edu.eci.dosw.reto3.EconomyCategorizer;
import edu.eci.dosw.reto3.LandVehicleFactory;
import edu.eci.dosw.reto3.LuxuryCategorizer;
import edu.eci.dosw.reto3.LuxuryCategory;
import edu.eci.dosw.reto3.UsedCategorizer;
import edu.eci.dosw.reto3.Vehicle;
import edu.eci.dosw.reto3.WaterVehicleFactory;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Integration tests for Challenge 3 (The Kingdom of Vehicles): verifies
 * that a vehicle correctly combines its assigned Category with its base
 * data, and that a list of vehicles can be summarized using Java Streams,
 * as required by the challenge.
 */
class VehiclePurchaseTest {

    /**
     * Test 1:
     * Verifies that a Car with EconomyCategory reports the discounted
     * price and the reduced speed.
     */
    @Test
    void carWithEconomyCategoryShouldApplyDiscount() {

        Vehicle car = new Car();
        new EconomyCategorizer().assignCategory(car);

        assertEquals(950.0f, car.getPrice(), 0.001f);
        assertEquals(108.0f, car.getMaxSpeed(), 0.001f);
        assertEquals("economy", car.getCategory());
    }

    /**
     * Test 2:
     * Verifies that getEquipment() combines the model's base equipment
     * with the extras added by the assigned category.
     */
    @Test
    void getEquipmentShouldCombineModelAndCategoryEquipment() {

        Vehicle car = new Car();
        new LuxuryCategorizer().assignCategory(car);

        String equipment = car.getEquipment();

        assertTrue(equipment.contains("air conditioning."));
        assertTrue(equipment.contains("VIP maintenance service."));
    }

    /**
     * Test 3:
     * Verifies that setCategory() overrides a previously assigned
     * category, changing the reported price.
     */
    @Test
    void setCategoryShouldOverridePreviousCategory() {

        Vehicle car = new Car();
        new EconomyCategorizer().assignCategory(car);
        assertEquals(950.0f, car.getPrice(), 0.001f);

        car.setCategory(new LuxuryCategory());

        assertEquals(1100.0f, car.getPrice(), 0.001f);
    }

    /**
     * Test 4:
     * Boundary case: calling getPrice() on a vehicle with no assigned
     * category should throw NullPointerException, since category
     * starts as null until a Categorizer assigns one.
     */
    @Test
    void getPriceWithoutCategoryShouldThrowException() {

        Vehicle car = new Car();

        assertThrows(NullPointerException.class, car::getPrice);
    }

    /**
     * Test 5:
     * Verifies that the subtotal of several vehicles from different
     * families and categories is calculated correctly using Streams.
     */
    @Test
    void subtotalShouldBeCalculatedWithStreams() {

        List<Vehicle> selectedVehicles = new ArrayList<>();

        Vehicle car = new LandVehicleFactory().getMotorizedVehicle();
        new EconomyCategorizer().assignCategory(car);
        selectedVehicles.add(car);

        Vehicle boat = new WaterVehicleFactory().getMotorizedVehicle();
        new LuxuryCategorizer().assignCategory(boat);
        selectedVehicles.add(boat);

        Vehicle helicopter = new AirVehicleFactory().getAgileVehicle();
        new UsedCategorizer().assignCategory(helicopter);
        selectedVehicles.add(helicopter);

        double subtotal = selectedVehicles.stream()
                .mapToDouble(Vehicle::getPrice)
                .sum();

        double expectedSubtotal = 950.0 + 5500.0 + 18000.0;

        assertEquals(expectedSubtotal, subtotal, 0.01);
    }

    /**
     * Test 6:
     * Boundary case: an empty vehicle list should produce a subtotal
     * of zero.
     */
    @Test
    void emptyListShouldProduceZeroSubtotal() {

        List<Vehicle> selectedVehicles = new ArrayList<>();

        double subtotal = selectedVehicles.stream()
                .mapToDouble(Vehicle::getPrice)
                .sum();

        assertEquals(0.0, subtotal, 0.001);
    }

    /**
     * Test 7:
     * Verifies that applying a discount percentage to the subtotal
     * reduces the total by the expected amount.
     */
    @Test
    void discountShouldReduceTotalCorrectly() {

        double subtotal = 1000.0;
        double discount = 0.10;

        double total = subtotal - (subtotal * discount);

        assertEquals(900.0, total, 0.001);
    }
}
