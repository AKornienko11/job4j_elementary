package ru.job4j.condition;

public class Max {
    public static int maxi(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static void main(String[] args) {
        int result = Max.maxi(1, 2);
        System.out.println(result);
    }
}
