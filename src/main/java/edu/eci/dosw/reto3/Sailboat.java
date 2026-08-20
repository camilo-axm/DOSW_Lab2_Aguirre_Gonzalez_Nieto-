package edu.eci.dosw.reto3;

public class Sailboat extends Vehicle{

    /**
     * create a Sailboat
     * 
     * @param maxSpeed maximum speed of the vehicle model
     * @param price price of the vehicle model
     */
    public Sailboat(){
        super(40, 4000, null);
    }

    /**
     * Returns the description of the equipment that comes with the vehicle.
     * 
     * @return String with the description of the equipment that comes with the vehicle.
     */
    public String generatedEquiment(){
        StringBuilder data = new StringBuilder();

        data.append("\n\t").append("main sail and jib.").append("\n\t");
        data.append("rudder.").append("\n\t");
        data.append("anchor.").append("\n\t");
        data.append("nautical compass.");

        return data.toString();
    }

    /**
     * returns the type of this vehicle
     * 
     * @return returns a String that contains the type of family group to which this vehicle belongs
     */
    public String getType(){
        return "Water vehicle";
    }

}