package edu.eci.dosw.reto4;

import java.util.List;

/**
 * Currency exchange system.
 */
public final class Reto4 {

    private Reto4() {
    }

    public static void run() {

        double amount = 100;

        Currency sourceCurrency = Currency.USD;

        List<Currency> targetCurrencies = List.of(
                Currency.COP,
                Currency.EUR,
                Currency.JPY);

        List<ConversionTransaction> transactions = targetCurrencies.stream()
                .map(targetCurrency -> {

                    Converter converter = Rates.create(
                            sourceCurrency,
                            targetCurrency);

                    double convertedAmount = converter.convert(amount);

                    return new ConversionTransaction(
                            amount,
                            sourceCurrency,
                            convertedAmount,
                            targetCurrency);
                })
                .toList();

        System.out.println("CURRENCY EXCHANGE");

        transactions.forEach(transaction -> System.out.printf(
                "%.2f %s -> %.2f %s%n",
                transaction.getOriginalAmount(),
                transaction.getSourceCurrency(),
                transaction.getConvertedAmount(),
                transaction.getTargetCurrency()));

        double totalConvertedAmount = transactions.stream()
                .map(ConversionTransaction::getConvertedAmount)
                .reduce(0.0, Double::sum);

        System.out.println(
                "Total converted amount: "
                        + totalConvertedAmount);
    }
}