package edu.eci.dosw;

import edu.eci.dosw.reto3.AirVehicleFactory;
import edu.eci.dosw.reto3.Airplane;
import edu.eci.dosw.reto3.Bicycle;
import edu.eci.dosw.reto3.Car;
import edu.eci.dosw.reto3.Helicopter;
import edu.eci.dosw.reto3.JetSki;
import edu.eci.dosw.reto3.LandVehicleFactory;
import edu.eci.dosw.reto3.LightAircraft;
import edu.eci.dosw.reto3.Motorboat;
import edu.eci.dosw.reto3.Motorcycle;
import edu.eci.dosw.reto3.Sailboat;
import edu.eci.dosw.reto3.Vehicle;
import edu.eci.dosw.reto3.WaterVehicleFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

/**
 * Tests for the three VehicleFactory implementations of Challenge 3
 * (Abstract Factory pattern): verifies that each factory method
 * returns the correct concrete Vehicle type for its family.
 */
class VehicleFactoryTest {

    /**
     * Test 1:
     * Verifies that LandVehicleFactory returns the correct concrete
     * types for each of its three vehicle categories.
     */
    @Test
    void shouldCreateLandVehiclesCorrectly() {

        LandVehicleFactory factory = new LandVehicleFactory();

        Vehicle motorized = factory.getMotorizedVehicle();
        Vehicle light = factory.getLightVehicle();
        Vehicle agile = factory.getAgileVehicle();

        assertInstanceOf(Car.class, motorized);
        assertInstanceOf(Bicycle.class, light);
        assertInstanceOf(Motorcycle.class, agile);

        assertEquals("Land Vehicle", motorized.getType());
    }

    /**
     * Test 2:
     * Verifies that WaterVehicleFactory returns the correct concrete
     * types for each of its three vehicle categories.
     */
    @Test
    void shouldCreateWaterVehiclesCorrectly() {

        WaterVehicleFactory factory = new WaterVehicleFactory();

        Vehicle motorized = factory.getMotorizedVehicle();
        Vehicle light = factory.getLightVehicle();
        Vehicle agile = factory.getAgileVehicle();

        assertInstanceOf(Motorboat.class, motorized);
        assertInstanceOf(Sailboat.class, light);
        assertInstanceOf(JetSki.class, agile);

        assertEquals("Water vehicle", motorized.getType());
    }

    /**
     * Test 3:
     * Verifies that AirVehicleFactory returns the correct concrete
     * types for each of its three vehicle categories.
     */
    @Test
    void shouldCreateAirVehiclesCorrectly() {

        AirVehicleFactory factory = new AirVehicleFactory();

        Vehicle motorized = factory.getMotorizedVehicle();
        Vehicle light = factory.getLightVehicle();
        Vehicle agile = factory.getAgileVehicle();

        assertInstanceOf(Airplane.class, motorized);
        assertInstanceOf(LightAircraft.class, light);
        assertInstanceOf(Helicopter.class, agile);

        assertEquals("Air Vehicle", motorized.getType());
    }
}
