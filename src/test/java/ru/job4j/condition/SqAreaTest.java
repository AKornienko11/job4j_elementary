package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
    int expected = 2;
    double out = SqArea.square(6, 2);
    Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K3Then3() {
        int expected = 3;
        double out = SqArea.square(8, 3);
        Assert.assertEquals(expected, out, 0.01);
    }
}