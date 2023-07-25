package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int expected = 2;
        int result = Max.max(1, 2);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To1To7Then7() {
        int left = 2;
        int right = 1;
        int forward = 7;
        int expected = 7;
        int result = Max.max(2, 1, 7);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax2To2To7To10Then10() {
        int left = 2;
        int right = 2;
        int forward = 7;
        int back = 10;
        int expected = 10;
        int result = Max.max(2, 2, 7, 10);
        assertThat(result).isEqualTo(expected);
    }
}
