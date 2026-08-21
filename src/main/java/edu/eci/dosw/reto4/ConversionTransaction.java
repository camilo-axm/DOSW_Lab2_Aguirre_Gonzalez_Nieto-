package edu.eci.dosw.reto4;

/**
 * Represents a currency conversion transaction.
 */
public final class ConversionTransaction {

    private final double originalAmount;
    private final Currency sourceCurrency;
    private final double convertedAmount;
    private final Currency targetCurrency;

    public ConversionTransaction(
            double originalAmount,
            Currency sourceCurrency,
            double convertedAmount,
            Currency targetCurrency) {

        this.originalAmount = originalAmount;
        this.sourceCurrency = sourceCurrency;
        this.convertedAmount = convertedAmount;
        this.targetCurrency = targetCurrency;
    }

    public double getOriginalAmount() {
        return originalAmount;
    }

    public Currency getSourceCurrency() {
        return sourceCurrency;
    }

    public double getConvertedAmount() {
        return convertedAmount;
    }

    public Currency getTargetCurrency() {
        return targetCurrency;
    }
}