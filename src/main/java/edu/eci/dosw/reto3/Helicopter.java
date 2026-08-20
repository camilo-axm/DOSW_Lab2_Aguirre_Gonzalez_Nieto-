package edu.eci.dosw.reto3;

public class Helicopter extends Vehicle{

    /**
     * create a Helicopter
     * 
     * @param maxSpeed maximum speed of the vehicle model
     * @param price price of the vehicle model
     */
    public Helicopter(){
        super(250, 20000, null);
    }

    /**
     * Returns the description of the equipment that comes with the vehicle.
     * 
     * @return String with the description of the equipment that comes with the vehicle.
     */
    public String generatedEquiment(){
        StringBuilder data = new StringBuilder();

        data.append("\n\t").append("tail rotor.").append("\n\t");
        data.append("landing skids.").append("\n\t");
        data.append("radio communication system.");

        return data.toString();
    }

    /**
     * returns the type of this vehicle
     * 
     * @return returns a String that contains the type of family group to which this vehicle belongs
     */
    public String getType(){
        return "Air Vehicle";
    }

}