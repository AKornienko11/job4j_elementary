package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double subtractionX = (x2 - x1);
        double subtractionY = (y2 - y1);
        double squaringX = Math.pow(subtractionX, 2);
        double squaringY = Math.pow(subtractionY, 2);
        double additionsXY = squaringX + squaringY;
        double lsr = Math.sqrt(additionsXY);
        return lsr;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 0, 2);
        System.out.println(" result (0, 0) to (2, 0) " + result);

    }
}
