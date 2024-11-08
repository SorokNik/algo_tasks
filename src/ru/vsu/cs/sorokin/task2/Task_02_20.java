package ru.vsu.cs.sorokin.task2;

import java.util.Scanner;

public class Task_02_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваш возраст: ");
        int age = scanner.nextInt();

        System.out.printf("Ваш возраст: %s", getAge(age));
    }

    public static String getAge(int age) {
        String year = "лет";
        if (age % 10 == 1 && age != 11) {
            year = "год";
        } else if (1 < age % 10 && age % 10 < 5 && age / 10 != 1) {
            year = "года";
        }

        return age + " " + year;
    }
}
