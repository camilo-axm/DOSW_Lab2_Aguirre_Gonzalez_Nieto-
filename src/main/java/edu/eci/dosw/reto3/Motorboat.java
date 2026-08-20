package edu.eci.dosw.reto3;

public class Motorboat extends Vehicle{

    /**
     * create a Motorboat
     * 
     * @param maxSpeed maximum speed of the vehicle model
     * @param price price of the vehicle model
     */
    public Motorboat(){
        super(80, 5000, null);
    }

    /**
     * Returns the description of the equipment that comes with the vehicle.
     * 
     * @return String with the description of the equipment that comes with the vehicle.
     */
    public String generatedEquiment(){
        StringBuilder data = new StringBuilder();

        data.append("\n\t").append("outboard motor.").append("\n\t");
        data.append("\n\t").append("life jackets.").append("\n\t");
        data.append("\n\t").append("nautical GPS.").append("\n\t");
        data.append("\n\t").append("depth sounder.");

        return data.toString();
    }

    /**
     * returns the type of this vehicle
     * 
     * @return returns a String that contains the type of family group to which this vehicle belongs
     */
    public String getType(){
        return "motorboat";
    }

}