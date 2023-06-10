package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int result = 0;
        while (ivan <= nik) {
            ivan *= 3;
            nik *= 2;
            result += 1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(calc(95, 90));
    }
}
