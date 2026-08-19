package edu.eci.dosw.reto4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConversionTransactionTest {

    @Test
    void shouldStoreTransactionInformation() {

        ConversionTransaction transaction =
                new ConversionTransaction(
                        100,
                        Currency.USD,
                        306102,
                        Currency.COP
                );

        assertEquals(
                100,
                transaction.getOriginalAmount(),
                0.001
        );

        assertEquals(
                Currency.USD,
                transaction.getSourceCurrency()
        );

        assertEquals(
                306102,
                transaction.getConvertedAmount(),
                0.001
        );

        assertEquals(
                Currency.COP,
                transaction.getTargetCurrency()
        );
    }
}