package edu.eci.dosw.reto3;

public class Bicycle extends Vehicle{

    /**
     * create a Bicycle
     * 
     * @param maxSpeed maximum speed of the vehicle model
     * @param price price of the vehicle model
     */
    public Bicycle(){
        super(25, 300, null);
    }

    /**
     * Returns the description of the equipment that comes with the vehicle.
     * 
     * @return String with the description of the equipment that comes with the vehicle.
     */
    public String generatedEquiment(){
        StringBuilder data = new StringBuilder();

        data.append("\n\t").append("gear shifting system.").append("\n\t");
        data.append("disc brakes.").append("\n\t");
        data.append("reflective lights.").append("\n\t");
        data.append("cargo rack.");

        return data.toString();
    }

    /**
     * returns the type of this vehicle
     * 
     * @return returns a String that contains the type of family group to which this vehicle belongs
     */
    public String getType(){
        return "Land Vehicle";
    }

}