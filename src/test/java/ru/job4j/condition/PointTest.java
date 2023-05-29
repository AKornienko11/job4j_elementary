package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20Then2() {
        double expected = 2;
        double out = Point.distance(0, 0, 2, 0);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to02Then2() {
        double expected = 2;
        double out = Point.distance(0, 0, 0, 2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when00to22Then2dot83() {
        double expected = 2.83;
        double out = Point.distance(0, 0, 2, 2);
        Assert.assertEquals(expected, out, 0.01);
    }
}