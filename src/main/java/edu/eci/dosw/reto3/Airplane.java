package edu.eci.dosw.reto3;

public class Airplane extends Vehicle{

    /**
     * create a Airplane
     * 
     * @param maxSpeed maximum speed of the vehicle model
     * @param price price of the vehicle model
     */
    public Airplane(){
        super(900, 50000, null);
    }

    /**
     * Returns the description of the equipment that comes with the vehicle.
     * 
     * @return String with the description of the equipment that comes with the vehicle.
     */
    public String generatedEquiment(){
        StringBuilder data = new StringBuilder();

        data.append("\n\t").append("avionics system.").append("\n\t");
        data.append("\n\t").append("landing gear.").append("\n\t");
        data.append("\n\t").append("weather radar.").append("\n\t");
        data.append("\n\t").append("executive seating.");

        return data.toString();
    }

    /**
     * returns the type of this vehicle
     * 
     * @return returns a String that contains the type of family group to which this vehicle belongs
     */
    public String getType(){
        return "airplane";
    }

}