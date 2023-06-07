package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        names[0] = "Aleksey Kornienko";
        names[1] = "Artem Bozhok";
        names[2] = "Aleksey Bozhok";
        names[3] = "Viktoria Klimova";
        String names1 = names[0];
        String names2 = names[1];
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.println(names1);
        System.out.println(names2);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
