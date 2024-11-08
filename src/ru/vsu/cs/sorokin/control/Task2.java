package ru.vsu.cs.sorokin.control;

import java.util.Locale;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите a: ");
        double a = scanner.nextDouble();

        System.out.print("Введите b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите n: ");
        int n = scanner.nextInt();


        System.out.printf("%.06f%n", solve(a, b, n));
    }

    public static double solve(double a, double b, int n) {

        double result = a * n - b;

        for (double i = n - 1; i > 0 ; i--) {

            result = (result * i) - b;

        }

        return result;
    }
}
