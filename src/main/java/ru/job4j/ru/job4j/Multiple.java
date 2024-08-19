package ru.job4j.ru.job4j;

import java.io.FileOutputStream;
import java.io.IOException;

public class Multiple {
    public static void main(String[] args) {
        int res;
        try (FileOutputStream output = new FileOutputStream("C:/projects/job4j_design/data/result.txt")) {
            for (int i = 0; i < 10; i++) {
                res = i;
                output.write(String.valueOf(res).getBytes());
                output.write(System.lineSeparator().getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
