package edu.eci.dosw.reto3;

public class JetSki extends Vehicle{

    /**
     * create a JetSki
     * 
     * @param maxSpeed maximum speed of the vehicle model
     * @param price price of the vehicle model
     */
    public JetSki(){
        super(100, 3000, null);
    }

    /**
     * Returns the description of the equipment that comes with the vehicle.
     * 
     * @return String with the description of the equipment that comes with the vehicle.
     */
    public String generatedEquiment(){
        StringBuilder data = new StringBuilder();

        data.append("\n\t").append("safety kill switch cord.").append("\n\t");
        data.append("padded seat.").append("\n\t");
        data.append("waterproof storage compartment.");

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