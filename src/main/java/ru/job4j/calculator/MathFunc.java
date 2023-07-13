package ru.job4j.calculator;

public class MathFunc {

    public static int plus1(int x) {
        int y = x * x + 1;
        return y;
    }

    public static int plus2(int x) {
        int y1 = 1 / x;
        return y1;
    }

    public static void main(String[] args) {
        int result1 = MathFunc.plus1(3);
        int result2 = MathFunc.plus2(5);
        int total = result1 + result2;
        int result3 = MathFunc.plus1(100);
        System.out.println(total);
        System.out.println(result3);
    }
}
