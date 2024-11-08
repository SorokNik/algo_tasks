package ru.vsu.cs.sorokin.task1;

import java.util.Scanner;

public class Task_01_16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите переменную A (А должна быть больше либо равна 1000): ");
        double a = scanner.nextDouble();
        if (!(a >= 1000)) {
            System.out.print("А должна быть больше либо равна 1000!");
            return;
        }

        System.out.print("Введите переменную B: ");
        double b = scanner.nextDouble();

        System.out.print("Введите переменную C (C должна быть меньше либо равна 1000): ");
        double c = scanner.nextDouble();
        if (!(c <= 1000)) {
            System.out.print("C должна быть меньше либо равна 1000!");
            return;
        }

        c = a + b + c; // c - сумма a, b, c
        b = c - b - a; // b = первоначальное значение c
        a = c - b - a; // a = первоначальное значение b
        c = c - b - a; // c = первоначальное значение a

        System.out.printf("A->B: %.2f\n B->C: %.2f\n C->A: %.2f", a, b, c);
    }

}
