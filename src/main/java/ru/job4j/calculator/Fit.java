package ru.job4j.calculator;

public class Fit {
    public static double manWeight(int height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(int height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        double man = manWeight(187);
        System.out.println(" Man 187 is " + man);
        double woman = womanWeight(187);
        System.out.println(" Woman 187 is " + woman);

    }
}
