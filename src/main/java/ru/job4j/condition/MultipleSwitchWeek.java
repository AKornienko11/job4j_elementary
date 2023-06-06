package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saturday" -> 6;
            case "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        int result1 = MultipleSwitchWeek.numberOfDay("Monday");
        System.out.println(result1);
        int result2 = MultipleSwitchWeek.numberOfDay("Tuesday");
        System.out.println(result2);
        int result3 = MultipleSwitchWeek.numberOfDay("Wednesday");
        System.out.println(result3);
        int result4 = MultipleSwitchWeek.numberOfDay("Thursday");
        System.out.println(result4);
        int result5 = MultipleSwitchWeek.numberOfDay("Friday");
        System.out.println(result5);
        int result6 = MultipleSwitchWeek.numberOfDay("Saturday");
        System.out.println(result6);
        int result7 = MultipleSwitchWeek.numberOfDay("Sunday");
        System.out.println(result7);
        int result8 = MultipleSwitchWeek.numberOfDay("Ошибка");
        System.out.println(result8);
    }
}
