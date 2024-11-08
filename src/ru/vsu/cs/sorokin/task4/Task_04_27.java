/*
Найти n-ое по счету (начиная с 0) целое число, запись которого в десятичной системе
является палиндромом (т.е. симметрична относительно середины, например: 0, 7, 33, 99, 111, 121,
2332 и т.п.). Для определения, является ли число палиндромом функции функцию. Запрещено
использовать строки и массивы.
*/

package ru.vsu.cs.sorokin.task4;

import java.util.Scanner;

public class Task_04_27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        System.out.printf("Палиндром: %s", findNthPalindrome(n));
    }

    public static boolean isPalindrome(int n) {

        int originalN = n;
        int reversed = 0;

        while (n != 0) {
            int lastDigit = n % 10;
            reversed = reversed * 10 + lastDigit;
            n = n / 10;
        }

        return originalN == reversed;
    }

    public static int findNthPalindrome(int n) {
        int count = 0;
        int number = 0;

        while (count != n) {
            if (isPalindrome(number)) {
                count++;
                number++;
            } else {
                number++;
            }
        }

        return number - 1;
    }

}
