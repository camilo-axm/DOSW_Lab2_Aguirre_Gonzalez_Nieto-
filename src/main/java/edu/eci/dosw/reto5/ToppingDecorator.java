package edu.eci.dosw.reto5;

public class ToppingDecorator extends CoffeeDecorator {

    private final Topping topping;

    public ToppingDecorator(Coffee coffee, Topping topping) {
        super(coffee);
        this.topping = topping;
    }

    @Override
    public String getCoffeewithToppings () {
        return coffee.getCoffeewithToppings ()
                + " + "
                + topping.getName();
    }

    @Override
    public double getPrice() {
        return coffee.getPrice()
                + topping.getPrice();
    }
}