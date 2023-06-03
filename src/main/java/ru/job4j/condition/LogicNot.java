package ru.job4j.condition;

public class LogicNot {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !isEven(num);
    }

    public static boolean notPositive(int num) {
        return !isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !isEven(num) && isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return isEven(num) && !isPositive(num);
    }

    public static void main(String[] args) {
        int num = 4;
        boolean result1 = LogicNot.isEven(num);
        System.out.println(result1);
        boolean result2 = LogicNot.isPositive(num);
        System.out.println(result2);
        boolean result3 = LogicNot.notEven(num);
        System.out.println(result3);
        boolean result4 = LogicNot.notPositive(num);
        System.out.println(result4);
        boolean result5 = LogicNot.notEvenAndPositive(num);
        System.out.println(result5);
        boolean result6 = LogicNot.evenOrNotPositive(num);
        System.out.println(result6);
    }

}
