package edu.eci.dosw.reto3;

public class Motorcycle extends Vehicle{

    /**
     * create a Motorcycle
     * 
     * @param maxSpeed maximum speed of the vehicle model
     * @param price price of the vehicle model
     */
    public Motorcycle(){
        super(180, 2500, null);
    }

    /**
     * Returns the description of the equipment that comes with the vehicle.
     * 
     * @return String with the description of the equipment that comes with the vehicle.
     */
    public String generatedEquiment(){
        StringBuilder data = new StringBuilder();

        data.append("\n\t").append("included helmet.").append("\n\t");
        data.append("\n\t").append("rearview mirrors.").append("\n\t");
        data.append("\n\t").append("ABS braking system.").append("\n\t");
        data.append("\n\t").append("rear storage box.");

        return data.toString();
    }

    /**
     * returns the type of this vehicle
     * 
     * @return returns a String that contains the type of family group to which this vehicle belongs
     */
    public String getType(){
        return "motorcycle";
    }

}