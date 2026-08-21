package edu.eci.dosw.reto3;

public class LandVehicleFactory implements VehicleFactory{
    
    /**
     * Create a land vehicle factory
     */
    public LandVehicleFactory(){}

    /**
     * returns a motorized vehicle of this factory
     * 
     * @return Returns an object of the motor vehicle type with specific 
     * actions in its behaviors according to this factory.
     */
    public Vehicle getMotorizedVehicle(){
        return new Car();
    }

    /**
     * returns a light transport of this factory
     * 
     * @return returns an object of the light vehicle type with specific
     * actions in its behaviors according to this factory.
     */
    public Vehicle getLightVehicle(){
        return new Bicycle();
    }

    /**
     * returns a agile vehicle of this factory
     * 
     * @return returns an object of the agile vehicle type with specific
     * actions in its behaviors according to this factory.
     */
    public Vehicle getAgileVehicle(){
        return new Motorcycle();
    }

}
