package edu.eci.dosw.reto1;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a customer's shopping cart.
 */
public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return List.copyOf(products);
    }

    public double calculateSubtotal() {
        return products.stream()
                .map(Product::getUnitPrice)
                .reduce(0.0, Double::sum);
    }

    public double calculateDiscount(Customer customer) {
        return customer.getDiscountPercentage(calculateSubtotal());
    }

    public double calculateTotal(Customer customer) {
        return calculateSubtotal() - calculateDiscount(customer);
    }
}