package edu.eci.dosw.reto2;

import java.util.ArrayList;
import java.util.List;

public class ConcreteHamburgerBuilder implements HamburgerBuilder {

    private final List<Ingredient> ingredients;

    public ConcreteHamburgerBuilder() {
        this.ingredients = new ArrayList<>();
    }

    @Override
    public HamburgerBuilder addBread(String name, double price) {
        ingredients.add(new Ingredient(name, price));
        return this;
    }

    @Override
    public HamburgerBuilder addMeat(String name, double price) {
        ingredients.add(new Ingredient(name, price));
        return this;
    }

    @Override
    public HamburgerBuilder addCheese(String name, double price) {
        ingredients.add(new Ingredient(name, price));
        return this;
    }

    @Override
    public HamburgerBuilder addVegetable(String name, double price) {
        ingredients.add(new Ingredient(name, price));
        return this;
    }

    @Override
    public HamburgerBuilder addSauce(String name, double price) {
        ingredients.add(new Ingredient(name, price));
        return this;
    }

    @Override
    public HamburgerBuilder addIngredient(String name, double price) {
        ingredients.add(new Ingredient(name, price));
        return this;
    }

    @Override   
    public Hamburger build() {
        return new Hamburger(ingredients);
    }
}