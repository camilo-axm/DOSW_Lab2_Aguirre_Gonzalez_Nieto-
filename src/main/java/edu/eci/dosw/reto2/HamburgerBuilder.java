package edu.eci.dosw.reto2;


public interface HamburgerBuilder {

    HamburgerBuilder addBread(String name, double price);

    HamburgerBuilder addMeat(String name, double price);
    
    HamburgerBuilder addCheese(String name, double price);

    HamburgerBuilder addVegetable(String name, double price);

    HamburgerBuilder addSauce(String name, double price);

    HamburgerBuilder addIngredient(String name, double price);

    Hamburger build();
}