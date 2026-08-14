package edu.eci.dosw.reto2;

import java.util.List;

public interface BuilderBurger {
    BuilderBurger bread(String pan);
    BuilderBurger addTopping(Topping topping);
    BuilderBurger addToppings(List<Topping> toppings);
    Burger build();
}
