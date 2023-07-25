package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int forward) {
        return max(max(left, right), forward);
    }

    public static int max(int left, int right, int forward, int back) {
        return max(max(left, right), max(forward, back));
    }

    public static void main(String[] args) {
        int result = Max.max(7, 2, 3);
        System.out.println(result);

    }
}
