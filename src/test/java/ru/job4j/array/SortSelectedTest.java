package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortThree() {
        int[] data = new int[]{7, 5, 3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3, 5, 7};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSortFive() {
        int[] data = new int[]{8, 11, 6, 4, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{4, 5, 6, 8, 11};
        assertThat(result).containsExactly(expected);
    }

}
