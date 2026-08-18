package edu.eci.dosw.reto3;

public interface Category {
    
    /**
     * Returns the maximum speed of the category based on the maximum speed of the vehicle model.
     * 
     * @param maximumSpeedModel maximum speed of a vehicle model.
     * @return a float that represents the maximum speed of the vehicle model in this category.
     */
    float getMaximunSpeed(float maximumSpeedModel);

    /**
     * Returns the comfort type of the category
     * 
     * @return String with the type of comfort that they have in the category "basic, standard, premium".
     */
    String getComfort();
    
    /**
     * returns the value of this category according to the vehicle.
     * 
     * @param modelPrice price of the vehicle model.
     * @return Returns the price of the vehicle model in this category.
     */
    float getPrice(float modelPrice);

    /**
     * The equipment that comes with the vehicle model in this category is returned.
     * 
     * @param modelEquipment vehicle model equipment.
     * @return eturns a String with the equipment of the vehicle model plus what is added for being of this category.
     */
    String getEquipment(String modelEquipment);
}
