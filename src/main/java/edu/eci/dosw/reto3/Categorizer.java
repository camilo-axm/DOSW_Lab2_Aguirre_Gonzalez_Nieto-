package edu.eci.dosw.reto3;

public abstract class Categorizer {
    
    /**
     * Create a specific category for this factory
     * 
     * @return category of this factory
     */
    public abstract Category createCategory();

    /**
     * assigns a category to a given vehicle
     * 
     * @param vehicle vehicle to be assigned the category
     */
    public void assignCategory(Vehicle vehicle){
        Category category = createCategory();
        vehicle.setCategory(category);
    }

}
