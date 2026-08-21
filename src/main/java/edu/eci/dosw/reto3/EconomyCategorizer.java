package edu.eci.dosw.reto3;

public class EconomyCategorizer extends Categorizer{
    
    /**
     * Create a specific category for this factory
     * 
     * @return category of this factory
     */
    public Category createCategory(){
        return new EconomyCategory();
    }

}