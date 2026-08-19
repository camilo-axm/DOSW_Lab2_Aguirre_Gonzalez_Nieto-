package edu.eci.dosw.reto4;

/**
* Create currency converters with the exchange rate corresponding to each currency pair.*/
public final class Rates {

    private Rates() {
    }

    public static Converter create(
            Currency sourceCurrency,
            Currency targetCurrency) {

        double rate = getRate(sourceCurrency, targetCurrency);

        ExchangeRate exchangeRate =
                new ExchangeRate(sourceCurrency, targetCurrency, rate);

        return new ConverterCurrency(exchangeRate);
    }

    private static double getRate(
            Currency sourceCurrency,
            Currency targetCurrency) {

        if (sourceCurrency == Currency.COP
                && targetCurrency == Currency.USD) {
            return 0.000327;
        }

        if (sourceCurrency == Currency.COP
                && targetCurrency == Currency.EUR) {
            return 0.000280;
        }

        if (sourceCurrency == Currency.COP
                && targetCurrency == Currency.JPY) {
            return 0.0522;
        }

        if (sourceCurrency == Currency.USD
                && targetCurrency == Currency.COP) {
            return 3061.02;
        }

        if (sourceCurrency == Currency.USD
                && targetCurrency == Currency.EUR) {
            return 0.8617;
        }

        if (sourceCurrency == Currency.USD
                && targetCurrency == Currency.JPY) {
            return 159.1;
        }

        if (sourceCurrency == Currency.EUR
                && targetCurrency == Currency.COP) {
            return 3582.0;
        }

        if (sourceCurrency == Currency.EUR
                && targetCurrency == Currency.USD) {
            return 1.1605;
        }

        if (sourceCurrency == Currency.EUR
                && targetCurrency == Currency.JPY) {
            return 184.62;
        }

        if (sourceCurrency == Currency.JPY
                && targetCurrency == Currency.COP) {
            return 19.10;
        }

        if (sourceCurrency == Currency.JPY
                && targetCurrency == Currency.USD) {
            return 0.00629;
        }

        if (sourceCurrency == Currency.JPY
                && targetCurrency == Currency.EUR) {
            return 0.005416;
        }

        throw new IllegalArgumentException(
                "Unsupported currency conversion: "
                        + sourceCurrency + " -> " + targetCurrency);
    }
}