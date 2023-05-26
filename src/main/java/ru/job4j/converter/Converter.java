package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float forEuro = value / 70;
        return forEuro;
    }

    public static float rubleToDollar(float value) {
        float forDollar = value / 60;
        return forDollar;
    }

    public static void main(String[] args) {
        float inForEuro = 140;
        float inForDollar = 120;
        float expectedEuro = 2;
        double expectedDollar = 2;
        float euro = Converter.rubleToEuro(inForEuro);
        float dollars = Converter.rubleToDollar(inForDollar);
        boolean passedEuro = expectedEuro == euro;
        boolean passedDollar = expectedDollar == dollars;
        System.out.println(" 140 rubles are 2. Test result: " + passedEuro);
        System.out.println(" 120 rubles are 2. Test result: " + passedDollar);

    }
}
