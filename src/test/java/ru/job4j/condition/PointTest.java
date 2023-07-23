package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00to02Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        a.distance(b);
        double expected = 2.0;
        assertThat(a.distance(b)).isEqualTo(expected);
    }

    @Test
    public void when51to01Then5() {
        Point b = new Point(5, 1);
        Point d = new Point(0, 1);
        b.distance(d);
        double expected = 5.0;
        assertThat(b.distance(d)).isEqualTo(expected);
    }
}