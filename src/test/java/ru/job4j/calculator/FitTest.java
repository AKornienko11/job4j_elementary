package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenman187Then100() {
        short in = 187;
        double expected = 100.05;
        double out = Fit.manWeight(in);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }

    @Test
    public void whenwoman187Then88() {
        short in = 187;
        double expected = 88.55;
        double out = Fit.womanWeight(in);
        double esp = 0.01;
        Assert.assertEquals(expected, out, esp);
    }
}