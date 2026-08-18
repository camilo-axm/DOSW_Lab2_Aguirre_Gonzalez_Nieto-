package edu.eci.dosw.reto3;

public class LuxuryCategory implements Category{
    
    /**
     * creates the luxury category
     */
    public LuxuryCategory(){
        
    }

    /**
     * Returns the maximum speed of the category based on the maximum speed of the vehicle model.
     * 
     * @param maximumSpeedModel maximum speed of a vehicle model.
     * @return a float that represents the maximum speed of the vehicle model in this category.
     */
    public float getMaximunSpeed(float maximumSpeedModel){
        return maximumSpeedModel*1.15f;
    }

    /**
     * Returns the comfort type of the category
     * 
     * @return String with the type of comfort that they have in the category "basic, standard, premium".
     */
    public String getComfort(){
        return "premiun";
    }
    
    /**
     * returns the value of this category according to the vehicle.
     * 
     * @param modelPrice price of the vehicle model.
     * @return Returns the price of the vehicle model in this category.
     */
    public float getPrice(float modelPrice){
        return modelPrice*1.10f;
    }

    /**
     * The equipment that comes with the vehicle model in this category is returned.
     * 
     * @param modelEquipment vehicle model equipment.
     * @return eturns a String with the equipment of the vehicle model plus what is added for being of this category.
     */
    public String getEquipment(String modelEquipment){
        return modelEquipment + "\n\tVIP maintenance service.\n\t24/7 customer support.\n\tStandard Warranty (1 year).";
    }

}