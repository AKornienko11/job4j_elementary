package ru.job4j.condition;

public class ThreeMax {
    public static int maxi(int first, int second, int third) {
        int result = first;

        if (second >= first && second >= third) {
            result = second;
        }
        if (third >= first && third >= second) {
            result = third;
        }
        return result;
    }
}

