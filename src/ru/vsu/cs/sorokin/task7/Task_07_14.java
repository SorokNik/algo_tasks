/*
Вводится массив целых чисел. Найти позицию последнего элемента массива, который
граничит с максимальным или минимальным элементом массива, однако сам не
является минимальным или максимальным элементом.
*/

package ru.vsu.cs.sorokin.task7;

import static ru.vsu.cs.sorokin.util.ArrayUtils.readIntArrayFromConsole;

public class Task_07_14 {
    public static void main(String[] args) {

        int[] arr = readIntArrayFromConsole();
        System.out.printf("%s", getNeighbour(arr));
    }

    public static int findMaxIndex(int[] arr) {
        int indexOfMax = 0;

        for (int i = 1; i < arr.length; i++) {
            indexOfMax = arr[indexOfMax] > arr[i] ? indexOfMax : i;
        }

        return indexOfMax;

    }

    public static int findMinIndex(int[] arr) {
        int indexOfMin = 0;

        for (int i = 1; i < arr.length; i++) {
            indexOfMin = arr[indexOfMin] < arr[i] ? indexOfMin : i;
        }

        return indexOfMin;

    }

    public static int getNeighbour(int[] arr) {
        int indexOfMax = findMaxIndex(arr);
        int indexOfMin = findMinIndex(arr);
        int maxValue = arr[indexOfMax];
        int minValue = arr[indexOfMin];

        int resultIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != minValue && arr[i] != maxValue) {
                if (i > 0 && (arr[i - 1] == minValue || arr[i - 1] == maxValue) ||
                        i < arr.length - 1 && (arr[i + 1] == minValue || arr[i + 1] == maxValue)) {
                    resultIndex = i;
                }
            }
        }

        return resultIndex;
    }
}
