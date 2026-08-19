package edu.eci.dosw.reto5;

public class NormalCoffee implements Coffee {
    @Override
    public String getCoffeewithToppings() {
        return "Normal Coffee";
    }

    @Override
    public double getPrice() {
        return 5000;
    }

}
