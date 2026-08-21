package edu.eci.dosw.reto5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToppingDecoratorTest {

    @Test
    void shouldAddOneTopping() {
        Coffee coffee = new NormalCoffee();

        Topping milk = new Topping("Milk", 1000);

        coffee = new ToppingDecorator(coffee, milk);

        assertEquals(
                "Normal Coffee + Milk",
                coffee.getCoffeewithToppings());

        assertEquals(
                6000,
                coffee.getPrice(),
                0.001);
    }

    @Test
    void shouldAddMultipleToppings() {
        Coffee coffee = new NormalCoffee();

        Topping milk = new Topping("Milk", 1000);
        Topping chocolate = new Topping("Chocolate", 1500);
        Topping caramel = new Topping("Caramel", 1200);

        coffee = new ToppingDecorator(coffee, milk);
        coffee = new ToppingDecorator(coffee, chocolate);
        coffee = new ToppingDecorator(coffee, caramel);

        assertEquals(
                "Normal Coffee + Milk + Chocolate + Caramel",
                coffee.getCoffeewithToppings());

        assertEquals(
                8700,
                coffee.getPrice(),
                0.001);
    }

    @Test
    void shouldCreateMultipleDifferentCoffees() {
        Coffee coffee1 = new NormalCoffee();
        coffee1 = new ToppingDecorator(
                coffee1,
                new Topping("Milk", 1000));

        Coffee coffee2 = new NormalCoffee();
        coffee2 = new ToppingDecorator(
                coffee2,
                new Topping("Chocolate", 1500));

        assertEquals(6000, coffee1.getPrice(), 0.001);
        assertEquals(6500, coffee2.getPrice(), 0.001);
    }
}