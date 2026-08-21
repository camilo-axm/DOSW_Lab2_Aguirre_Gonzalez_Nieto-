package edu.eci.dosw.reto4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConverterCurrencyTest {

    @Test
    void shouldConvertUsingExchangeRate() {

        ExchangeRate rate = new ExchangeRate(
                Currency.USD,
                Currency.COP,
                3061.02
        );

        Converter converter = new ConverterCurrency(rate);

        assertEquals(
                306102,
                converter.convert(100),
                0.001
        );
    }

    @Test
    void shouldConvertZeroAmount() {

        ExchangeRate rate = new ExchangeRate(
                Currency.USD,
                Currency.EUR,
                0.8617
        );

        Converter converter = new ConverterCurrency(rate);

        assertEquals(
                0,
                converter.convert(0),
                0.001
        );
    }
}