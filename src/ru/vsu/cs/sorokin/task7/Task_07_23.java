package ru.vsu.cs.sorokin.task7;

import java.util.Scanner;

public class Task_07_23 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {5, 1, 3, 1, 3, 5, 1, 5, 3, 7, 8, 8, 9, 8, 8, 5, 1};
        // arr = ArrayUtils.readIntArrayFromConsole();

        // System.out.println(ArrayUtils.toString(arr));
        System.out.printf("Самая длинная симметричная последовательность: %s",  1);

    }

    public static int getSymLeft1(int[] arr, int c) {

        for (int i = 1; ; i++) {
            if (c - i < 0 || c + i >= arr.length || arr[c - i] != arr[c + i]) {
                return c - (i - 1);
            }
        }

    }

//    public static int getSymLeft2(int[] arr, int c) {
//
//        if (c >= arr.length - 1 || arr) {}
//
//        for (int i = 1; ; i++) {
//            if (c - i < 0 || c + i >= arr.length || arr[c - i] != arr[c + i]) {
//                return c - (i - 1);
//            }
//        }
//
//    }

}