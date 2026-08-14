package edu.eci.dosw.reto2;

import java.util.List;

public final class Reto2ChefHamburguesa {

    private Reto2ChefHamburguesa() {
    }

    public static void run() {
        System.out.println("Running Challenge 2 — The Five-Star Chef...");

        List<Topping> available = List.of(
                new Topping("Carne de res", 8000),
                new Topping("Queso cheddar", 3000),
                new Topping("Tocineta", 4000),
                new Topping("Lechuga", 1000),
                new Topping("Tomate", 1000),
                new Topping("Salsa BBQ", 1500)
        );

        List<Topping> select = List.of(
                available.get(0),
                available.get(1),
                available.get(2),
                available.get(5)
        );

        BuilderBurger builder = new BuilderBurgerImpl();
        Burger burger = builder
                .bread("Pan artesanal")
                .addToppings(select)
                .build();

        System.out.println("Selected toppings:");
        burger.getToppings().stream()
                .map(Topping::toString)
                .forEach(desc -> System.out.println("  - " + desc));

        double finalPrice = burger.calcularPrecioTotal();
        System.out.printf("%nPrecio final (calculado con Streams): COP %.2f%n", finalPrice);

        System.out.println();
        System.out.println(burger.resumen());

        System.out.println();
        ChefDirector director = new ChefDirector(new BuilderBurgerImpl());
        Burger clasica = director.prepararClasica(available);
        System.out.println("Receta del Director (Clásica):");
        System.out.println(clasica.resumen());
    }
}