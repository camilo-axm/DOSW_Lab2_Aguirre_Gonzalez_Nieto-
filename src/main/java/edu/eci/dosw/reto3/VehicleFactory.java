package edu.eci.dosw.reto3;

public interface VehicleFactory {

    /**
     * returns a motorized vehicle of this factory
     * 
     * @return Returns an object of the motor vehicle type with specific 
     * actions in its behaviors according to this factory.
     */
    Vehicle getMotorizedVehicle();

    /**
     * returns a light transport of this factory
     * 
     * @return returns an object of the light vehicle type with specific
     * actions in its behaviors according to this factory.
     */
    Vehicle getLightVehicle();

    /**
     * returns a agile vehicle of this factory
     * 
     * @return returns an object of the agile vehicle type with specific
     * actions in its behaviors according to this factory.
     */
    Vehicle getAgileVehicle();
    
}