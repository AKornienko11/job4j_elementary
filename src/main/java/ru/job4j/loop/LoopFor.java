package ru.job4j.loop;

public class LoopFor {
    public static void main(String[] args) {
        int result = 1;
        for (int i = 1; i <= 5; i++) {
            result *= i;
            System.out.println(result);
        }
    }
}
