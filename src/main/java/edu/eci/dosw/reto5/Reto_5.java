package edu.eci.dosw.reto5;

import java.util.List;

public final class Reto_5 {

    private Reto_5() {
    }

    public static void run() {

        Topping milk = new Topping("Milk", 1000);
        Topping chocolate = new Topping("Chocolate", 1500);
        Topping caramel = new Topping("Caramel", 1200);
        Topping whippedCream = new Topping("Whipped Cream", 2000);
        Topping mint = new Topping("Mint", 1300);

        Coffee coffee1 = new NormalCoffee();
        coffee1 = new ToppingDecorator(coffee1, milk);
        coffee1 = new ToppingDecorator(coffee1, chocolate);

        Coffee coffee2 = new NormalCoffee();
        coffee2 = new ToppingDecorator(coffee2, caramel);
        coffee2 = new ToppingDecorator(coffee2, whippedCream);
        coffee2 = new ToppingDecorator(coffee2, mint);

        List<Coffee> coffees = List.of(coffee1, coffee2);

        System.out.println("CUSTOMIZED COFFEE");

        coffees.forEach(coffee -> System.out.printf(
                "%s - COP %.2f%n",
                coffee.getCoffeewithToppings (),
                coffee.getPrice()));

        double total = coffees.stream()
                .map(Coffee::getPrice)
                .reduce(0.0, Double::sum);

        System.out.printf(
                "Total of all coffees: COP %.2f%n",
                total);
    }
}