package ru.job4j.array;

import java.util.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length - 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 6, 2};
        int[] rsl = back(nums);
        for (int num : rsl) {
            System.out.println(num);
        }
    }
}