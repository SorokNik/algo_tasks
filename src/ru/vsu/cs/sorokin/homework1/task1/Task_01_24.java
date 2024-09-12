package ru.vsu.cs.sorokin.homework1.task1;

import java.util.Scanner;

public class Task_01_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите r1: ");
        double r1 = scanner.nextInt();

        System.out.print("Введите r2: ");
        double r2 = scanner.nextInt();

        System.out.print("Введите r3: ");
        double r3 = scanner.nextInt();

        System.out.printf("Площадь заштрихованной части фигуры: %.3f", getPaintedArea(r1, r2, r3));
    }

    public static double getCircleArea(double r) {
        return Math.PI * Math.pow(r, 2);
    }

    public static double getSquareArea(double r) {
        return Math.pow(r * 2, 2);
    }

    public static double getPaintedSquareArea(double r3) {
        return getSquareArea(r3) - getCircleArea(r3);
    }

    public static double getPaintedCircleArea(double r2, double r1) {
        return getCircleArea(r2) - getCircleArea(r1);
    }

    public static double getPaintedArea(double r1, double r2, double r3) {
        return getPaintedCircleArea(r2, r1) + getPaintedSquareArea(r3);
    }
}
