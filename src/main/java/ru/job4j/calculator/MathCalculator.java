package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double divAndDiff(double first, double second) {
        return division(first, second) + difference(first, second);
    }

    public static double allVoid(double first, double second) {
        return sum(first, second) + multiply(first, second) + division(first, second) + difference(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен : " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен:  " + divAndDiff(10, 20));
        System.out.println("Результат расчета равен: " + allVoid(10, 20));
    }
}
