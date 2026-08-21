package edu.eci.dosw.reto3;

public abstract class Vehicle {

    private float maxSpeed;
    private float price;
    private Category category;

    /**
     * create a vehicle
     * 
     * @param maxSpeed maximum speed of the vehicle model
     * @param price price of the vehicle model
     */
    protected Vehicle(float maxSpeed, float price, Category category){

        this.maxSpeed = maxSpeed;
        this.price = price;
        this.category = category;

    }

    /**
     * Returns the maximun speed of this vehicle
     * 
     * @return returns a float that represents the maximum speed of this vehicle, taking into account its category
     */
    public float getMaxSpeed(){
        return category.getMaximunSpeed(maxSpeed);
    }

    /**
     * It returns the comfort level in which the vehicle is classified.
     * 
     * @return It returns a String with the comfort type in which the vehicle is classified: "basic, standard, premium".
     */
    public String getComfort(){
        return category.getComfort();
    }

    /**
     * returns the price of the vehicle
     * 
     * @return returns a float that represents the price of the vehicle taking into account the category
     */
    public float getPrice(){
        return category.getPrice(price);
    }

    /**
     * Returns the description of the equipment that comes with the vehicle.
     * @return String with the description of the equipment that comes with the vehicle.
     */
    public abstract String generatedEquiment();

    /**
     * return the equipment that came with the vehicle
     * 
     * @return It returns a String with the equipment that comes with the vehicle, 
     * taking into account what is added according to the category.
     */
    public String getEquipment(){
        return category.getEquipment(generatedEquiment());
    }
    
    /**
     * returns the type of this vehicle
     * 
     * @return returns a String that contains the type of family group to which this vehicle belongs
     */
    public abstract String getType();

    /**
     * Returns the category to which the vehicle belongs
     * 
     * @return returns a String with the category to which the vehicle belongs
     */
    public String getCategory(){
        return category.getType();
    }

    /**
     * obtains vehicle information
     * 
     * @return retrieves a string with the vehicle information
     */
    public String getData(){
        StringBuilder data = new StringBuilder();
        
        data.append("type: ").append(getType()).append("\n");
        data.append("category: ").append(getCategory()).append("\n");
        data.append("maxSpeed: ").append(getMaxSpeed()).append("\n");
        data.append("price: $").append(getPrice()).append(" US\n");
        data.append("special equipment: ").append(getEquipment()).append("\n");

        return data.toString();
    }

    /**
     * assigns a category to the vehicle
     * 
     * @param category category to be assigned to the vehicle
     */
    public void setCategory(Category category){
        this.category = category;
    }
}