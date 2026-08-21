package edu.eci.dosw.reto4;

/**
 * Represents an exchange rate between two currencies.
 */
public final class ExchangeRate {

    private final Currency sourceCurrency;
    private final Currency targetCurrency;
    private final double rate;

    public ExchangeRate(
            Currency sourceCurrency,
            Currency targetCurrency,
            double rate) {

        this.sourceCurrency = sourceCurrency;
        this.targetCurrency = targetCurrency;
        this.rate = rate;
    }

    public Currency getSourceCurrency() {
        return sourceCurrency;
    }

    public Currency getTargetCurrency() {
        return targetCurrency;
    }

    public double getRate() {
        return rate;
    }
}