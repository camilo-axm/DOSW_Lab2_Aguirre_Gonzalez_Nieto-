package edu.eci.dosw.reto4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RatesTest {

    @Test
    void shouldCreateUsdToCopConverter() {
        Converter converter = Rates.create(
                Currency.USD,
                Currency.COP);

        assertEquals(
                306102,
                converter.convert(100),
                0.001);
    }

    @Test
    void shouldCreateEurToCopConverter() {
        Converter converter = Rates.create(
                Currency.EUR,
                Currency.COP);

        assertEquals(
                358200,
                converter.convert(100),
                0.001);
    }

    @Test
    void shouldCreateJpyToUsdConverter() {
        Converter converter = Rates.create(
                Currency.JPY,
                Currency.USD);

        assertEquals(
                0.629,
                converter.convert(100),
                0.001);
    }
}
