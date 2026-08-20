package edu.eci.dosw.reto3;

public class Car extends Vehicle{
    
    /**
     * create a Car
     * 
     * @param maxSpeed maximum speed of the vehicle model
     * @param price price of the vehicle model
     */
    public Car(){
        super(120, 1000, null);
    }

    /**
     * Returns the description of the equipment that comes with the vehicle.
     * 
     * @return String with the description of the equipment that comes with the vehicle.
     */
    public String generatedEquiment(){
        StringBuilder data = new StringBuilder();
        
        data.append("\n\t").append("air conditioning.").append("\n\t");
        data.append("\n\t").append("radio/audio system.").append("\n\t");
        data.append("\n\t").append("airbags.").append("\n\t");
        data.append("\n\t").append("alloy wheels.");

        return data.toString();
    }

    /**
     * returns the type of this vehicle
     * 
     * @return returns a String that contains the type of family group to which this vehicle belongs
     */
    public String getType(){
        return "car";
    }

}
