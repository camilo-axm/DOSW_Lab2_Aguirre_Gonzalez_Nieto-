package edu.eci.dosw.reto1;

/**
 * Represents a discount strategy.
 */
@FunctionalInterface /**For the lambdas subtotal->subtotal*0.5 */
public interface Discount {

    double calculateDiscount(double subtotal);
}