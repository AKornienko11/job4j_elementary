package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, double salary, double percent) {
        int year = 1;
        while ((amount + (amount * percent) / 100) > salary) {
            amount = (amount + (amount * percent) / 100) - salary;
            year++;
        }
        return year;
    }

    public static void main(String[] args) {
        System.out.println(year(3000, 1200, 30));
    }
}
