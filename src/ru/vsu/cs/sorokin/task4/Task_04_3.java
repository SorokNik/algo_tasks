//Дано натуральное число n. Вычислить 1*2+2*3*4+…+n*…*2n.

package ru.vsu.cs.sorokin.task4;

import java.util.Scanner;

public class Task_04_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        System.out.printf("Результат 1*2+2*3*4+…+n*…*2n: %s", result(n));
    }

    public static int result(int n) {

        int sum = 0;


        for (int i = 1; i <= n; i++) {

            int product = 1;

            for (int j = i; j <= 2 * i; j++) {
                product *= j;
            }

            sum += product;
        }

        return sum;

    }
}
