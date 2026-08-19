package edu.eci.dosw.reto1;

public final class Reto1TiendaDonPepe {

    private Reto1TiendaDonPepe() {

    }

    public static void run() {

        ProductTest rice = new ProductTest("rice", 2000);
        ProductTest milk = new ProductTest("milk", 6000);
        ProductTest soda = new ProductTest("soda", 4000);

        ShoppingCartTest cart = new ShoppingCartTest();

        cart.addProduct(rice);
        cart.addProduct(rice);
        cart.addProduct(milk);
        cart.addProduct(milk);
        cart.addProduct(milk);

        for (int i = 0; i < 5; i++) {
            cart.addProduct(soda);
        }

        CustomerDiscountTest customer = new FrequentCustomer("Sara");

        double subtotal = cart.calculateSubtotal();
        double discount = cart.calculateDiscount(customer);
        double total = cart.calculateTotal(customer);

        System.out.println("DON PEPE'S STORE");
        System.out.println("Customer: " + customer.getName());
        System.out.println("Customer type: Frequent");
        System.out.println("Purchased products:");
        cart.getProducts().stream()
            .map(p -> "- " + p.getName() + ": COP " + p.getUnitPrice())
            .forEach(System.out::println);
            
        long expensiveProductsCount = cart.getProducts().stream()
                .filter(p -> p.getUnitPrice() > 1000)
                .count();
        System.out.println("Products over COP 1000: " + expensiveProductsCount);


        System.out.println("Subtotal: COP " + subtotal);
        System.out.println("Discount: COP " + discount);
        System.out.println("Total: COP " + total);
    }
}