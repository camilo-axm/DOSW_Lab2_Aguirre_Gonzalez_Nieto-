package edu.eci.dosw.reto3;

public class WaterVehicleFactory implements VehicleFactory{
    
    /**
     * Create a Water vehicle factory
     */
    public WaterVehicleFactory(){}

    /**
     * returns a motorized vehicle of this factory
     * 
     * @return Returns an object of the motor vehicle type with specific 
     * actions in its behaviors according to this factory.
     */
    public Vehicle getMotorizedVehicle(){
        return new Motorboat();
    }

    /**
     * returns a light transport of this factory
     * 
     * @return returns an object of the light vehicle type with specific
     * actions in its behaviors according to this factory.
     */
    public Vehicle getLightVehicle(){
        return new Sailboat();
    }

    /**
     * returns a agile vehicle of this factory
     * 
     * @return returns an object of the agile vehicle type with specific
     * actions in its behaviors according to this factory.
     */
    public Vehicle getAgileVehicle(){
        return new JetSki();
    }

}
