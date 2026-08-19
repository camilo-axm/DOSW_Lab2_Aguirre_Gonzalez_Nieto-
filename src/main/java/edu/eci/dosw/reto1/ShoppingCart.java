package edu.eci.dosw.reto1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<ProductTest> products = new ArrayList<>();

    public void addProduct(ProductTest product) {
        products.add(product);
    }

    public List<ProductTest> getProducts() {
        return List.copyOf(products);
    }

    public double calculateSubtotal() {
        return products.stream()
                .map(ProductTest::getUnitPrice)
                .reduce(0.0, Double::sum);
    }

    public double calculateDiscount(CustomerDiscountTest customer) {
        return customer.getDiscountPercentage(calculateSubtotal());
    }

    public double calculateTotal(CustomerDiscountTest customer) {
        return calculateSubtotal() - calculateDiscount(customer);
    }
}