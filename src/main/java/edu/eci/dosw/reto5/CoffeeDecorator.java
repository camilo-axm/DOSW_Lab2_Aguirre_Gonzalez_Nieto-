package edu.eci.dosw.reto5;

public abstract class CoffeeDecorator implements Coffee {

    protected final Coffee coffee;

    protected CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getCoffeewithToppings () {
        return coffee.getCoffeewithToppings ();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice();
    }
}