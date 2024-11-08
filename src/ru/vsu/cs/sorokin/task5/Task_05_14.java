/*
*-----*
|*---*|
||*-*||
|||*|||
||*-*||
|*---*|
*-----*
*
* */

package ru.vsu.cs.sorokin.task5;

import java.util.Scanner;

public class Task_05_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер фигуры: ");
        int s = scanner.nextInt();

//        printSquare(s);
        printStarAndDash(s);
    }

    public static void printStarAndDash(int s) {
        System.out.print("*");
        for (int i = 0; i < (s - 2); i++) {
            System.out.print("-");
        }
        if (s > 1 ) {
            System.out.print("*");
        }
    }

//    public static void printSquare(int s) {
//
//        printStarAndDash(s);
//        System.out.println();
//
//        for (int i = 0; i < s ; i++) {
//            System.out.print("|");
//            printStarAndDash(s - (i + 2));
//            System.out.print("|");
//            System.out.println();
//        }
//    }
}
