package edu.eci.dosw.reto1;

/**
 * Main example for Challenge 1: Don Pepe's Store.
 */
public final class Reto1TiendaDonPepe {

    private Reto1TiendaDonPepe() {
    }

    public static void run() {

        Product tShirt = new Product("T-shirt", 20000);
        Product cookies = new Product("Cookies", 500);
        Product naturalJuice = new Product("Natural Juice", 3000);
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct(tShirt);
        cart.addProduct(tShirt);

        for (int i = 0; i < 3; i++) {
            cart.addProduct(cookies);
        }
        for (int i = 0; i < 5; i++) {
            cart.addProduct(naturalJuice);
        }

        Customer customer = new FrequentCustomer("Sara");

        double subtotal = cart.calculateSubtotal();
        double discount = cart.calculateDiscount(customer);
        double total = cart.calculateTotal(customer);

        System.out.println("DON PEPE'S STORE");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Customer type: Frequent");

        System.out.println("Purchased products:");

        cart.getProducts().stream()
                .map(product -> "- " + product.getName()
                        + ": COP " + product.getUnitPrice())
                .forEach(System.out::println);

        long expensiveProductsCount = cart.getProducts().stream()
                .filter(product -> product.getUnitPrice() > 1000)
                .count();

        System.out.println(
                "Products over COP 1000: " + expensiveProductsCount);

        System.out.println("Subtotal: COP " + subtotal);
        System.out.println("Discount: COP " + discount);
        System.out.println("Total: COP " + total);
    }
}