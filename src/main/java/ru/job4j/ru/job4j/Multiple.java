package ru.job4j.ru.job4j;

import java.io.FileOutputStream;
import java.io.IOException;

/*
устранил пробелы для успешного прохождения задания
 */
public class Multiple {
    public static void main(String[] args) {
        try (FileOutputStream output = new FileOutputStream("C:/projects/job4j_design/data/result.txt")) {
            System.out.println(" 1 * 1 = 1 ");
            output.write("1".getBytes());
            output.write(System.lineSeparator().getBytes());
            System.out.println(" 1 * 2 = 2 ");
            output.write("2".getBytes());
            output.write(System.lineSeparator().getBytes());
            System.out.println(" 1 * 3 = 3 ");
            output.write("3".getBytes());
            output.write(System.lineSeparator().getBytes());
            System.out.println(" 1 * 4 = 4 ");
            output.write("4".getBytes());
            output.write(System.lineSeparator().getBytes());
            System.out.println(" 1 * 5 = 5 ");
            output.write("5".getBytes());
            output.write(System.lineSeparator().getBytes());
            System.out.println(" 1 * 6 = 6 ");
            output.write("6".getBytes());
            output.write(System.lineSeparator().getBytes());
            System.out.println(" 1 * 7 = 7 ");
            output.write("7".getBytes());
            output.write(System.lineSeparator().getBytes());
            System.out.println(" 1 * 8 = 8 ");
            output.write("8".getBytes());
            output.write(System.lineSeparator().getBytes());
            System.out.println(" 1 * 9 = 9 ");
            output.write("9".getBytes());
            output.write(System.lineSeparator().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
