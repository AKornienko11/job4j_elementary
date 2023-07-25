package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PointTest {

    @Test
    public void when00to02Then2() {
        Point a = new Point(5, 1, 3);
        Point b = new Point(0, 1, 3);
        a.distance3d(b);
        double expected = 5.0;
        assertThat(a.distance3d(b)).isEqualTo(expected);
    }

    @Test
    public void when51to01Then5() {
        Point b = new Point(1, 1, 1);
        Point d = new Point(1, 1, 10);
        b.distance3d(d);
        double expected = 9.0;
        assertThat(b.distance3d(d)).isEqualTo(expected);
    }
}