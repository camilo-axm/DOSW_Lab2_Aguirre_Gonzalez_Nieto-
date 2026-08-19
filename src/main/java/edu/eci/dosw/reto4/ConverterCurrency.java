package edu.eci.dosw.reto4;

/**
 * Performs currency conversion using a specific exchange rate.
 */
public class ConverterCurrency implements Converter {

    private final ExchangeRate exchangeRate;

    public ConverterCurrency(ExchangeRate exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    @Override
    public double convert(double amount) {
        return amount * exchangeRate.getRate();
    }
}