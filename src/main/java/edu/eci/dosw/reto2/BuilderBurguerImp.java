package edu.eci.dosw.reto2;

import java.util.ArrayList;
import java.util.List;

public class BuilderBurgerImpl implements BuilderBurger {

    private String bread = "Pan clásico";
    private final List<Topping> toppings = new ArrayList<>();

    @Override
    public BuilderBurger bread(String pan) {
        this.bread = pan;
        return this;
    }

    @Override
    public BuilderBurger addTopping(Topping topping) {
        this.toppings.add(topping);
        return this;
    }

    @Override
    public BuilderBurger addToppings(List<Topping> nuevos) {
        this.toppings.addAll(nuevos);
        return this;
    }

    @Override
    public Burger build() {
        if (toppings.isEmpty()) {
            throw new IllegalStateException("La hamburguesa debe tener al menos un topping");
        }
        return new Burger(bread, new ArrayList<>(toppings));
    }
}