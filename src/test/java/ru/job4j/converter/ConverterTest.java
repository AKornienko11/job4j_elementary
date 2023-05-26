package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        float inForEuro = 140;
        float expectedEuro = 2;
        float euro = Converter.rubleToEuro(inForEuro);
        float esp = 0.0001f;
        Assert.assertEquals(expectedEuro, euro, esp);
    }

    @Test
    public void rubleToDollar() {
        float inForDollar = 180;
        double expectedDollar = 3;
        float dollars = Converter.rubleToDollar(inForDollar);
        float esp = 0.0001f;
        Assert.assertEquals(expectedDollar, dollars, esp);
    }
}