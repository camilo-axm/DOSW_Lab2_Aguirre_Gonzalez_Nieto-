package edu.eci.dosw.reto3;

public class EconomyCategory {
    
    /**
     * creates the Economy Category
     */
    public EconomyCategory(){
        
    }

    /**
     * Returns the maximum speed of the category based on the maximum speed of the vehicle model.
     * 
     * @param maximumSpeedModel maximum speed of a vehicle model.
     * @return a float that represents the maximum speed of the vehicle model in this category.
     */
    public float getMaximunSpeed(float maximumSpeedModel){
        return maximumSpeedModel*0.90f;
    }

    /**
     * Returns the comfort type of the category
     * 
     * @return String with the type of comfort that they have in the category "basic, standard, premium".
     */
    public String getComfort(){
        return "standard";
    }
    
    /**
     * returns the value of this category according to the vehicle.
     * 
     * @param modelPrice price of the vehicle model.
     * @return Returns the price of the vehicle model in this category.
     */
    public float getPrice(float modelPrice){
        return modelPrice*0.95f;
    }

    /**
     * The equipment that comes with the vehicle model in this category is returned.
     * 
     * @param modelEquipment vehicle model equipment.
     * @return eturns a String with the equipment of the vehicle model plus what is added for being of this category.
     */
    public String getEquipment(String modelEquipment){
        return modelEquipment + "\n\tUser manual.\n\tStandard Warranty (1 year).";
    }

    /**
     * return the type of this category
     * 
     * @return returns a String with the name of this category
     */
    public String getType(){
        return "economy";
    }
}
