package edu.eci.dosw.reto2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hamburger {

    private final List<Ingredient> ingredients;

    public Hamburger(List<Ingredient> ingredients) {
        this.ingredients = Collections.unmodifiableList(
                new ArrayList<>(ingredients)
        );
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public double getTotalPrice() {
        return ingredients.stream()
                .mapToDouble(Ingredient::getPrice)
                .sum();
    }

    @Override
    public String toString() {

        StringBuilder result = new StringBuilder();
        System.out.println();
        result.append("Thanks for your order!\n");
        result.append("Your hamburger with the ingredients:\n");

        ingredients.forEach(ingredient ->
                result.append("- ")
                        .append(ingredient)
                        .append("\n")
        );

        result.append("Final price: COP $")
                .append(String.format("%.0f", getTotalPrice()))
                .append("\n");

        return result.toString();
    }
}