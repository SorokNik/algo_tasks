//Написать программу перевода обычных координат в полярные координаты (на плоскости).
//Проверить корректность программы для точек во всех координатных четвертях.

package ru.vsu.cs.sorokin.task2;


import java.util.Locale;
import java.util.Scanner;

public class Task_02_03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.getDefault());

        System.out.print("Введите координату x: ");
        double x = scanner.nextInt();

        System.out.print("Введите координату y: ");
        double y = scanner.nextInt();

        CartesianCoordinates cartesianCoordinates = new CartesianCoordinates(x, y);

        PolarCoordinates polarCoordinates = cartesianCoordinates.toPolarCoordinates();

        System.out.printf("Декартовы координаты: (%.2f, %.2f)\nПолярные координаты: (%.2f, %.2f)", cartesianCoordinates.x, cartesianCoordinates.y, polarCoordinates.r, polarCoordinates.a);
    }

    public static class PolarCoordinates {
        public double r, a;

        public PolarCoordinates(double r, double a) {
            this.r = r;
            this.a = a;
        }

        public CartesianCoordinates toCartesianCoordinates() {
            double x = Math.cos(Math.toRadians(a)) * r;
            double y = Math.sin(Math.toRadians(a)) * r;
            return new CartesianCoordinates(x, y);
        }
    }

    public static class CartesianCoordinates {
        public double x, y;

        public CartesianCoordinates(double x, double y) {
            this.x = x;
            this.y = y;
        }

        public PolarCoordinates toPolarCoordinates() {
            double r = Math.sqrt(x * x + y * y);
            double a = Math.toDegrees(Math.atan2(y, x));
            return new PolarCoordinates(r, a);
        }
    }
}
