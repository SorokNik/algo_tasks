package ru.vsu.cs.sorokin.task7;

public class Program {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 3, 2, 1, 2, 3, 4, 2};
        SubArray sa1 = getMaxLengthSymSubArray(arr1);
        System.out.printf("left index = %d, right index = %d%n", sa1.left, sa1.right);

        int[] arr2 = {1, 3, 3, 2, 1, 2, 2, 1, 3, 4, 2};
        SubArray sa2 = getMaxLengthSymSubArray(arr2);
        System.out.printf("left index = %d, right index = %d%n", sa2.left, sa2.right);
    }

    public static int getSymLeft1(int[] arr, int c) {
        for (int i = 1; ; i++) {
            if (c - i < 0 || c + i >= arr.length ||
                arr[c - i] != arr[c + i]) {
                return c - (i - 1);
            }
        }
    }

    public static int getSymLeft2(int[] arr, int c) {
        if (c >= arr.length - 1 || arr[c] != arr[c + 1]) {
            return -1;
        }
        for (int i = 1; ; i++) {
            if (c - i < 0 || c + i + 1 >= arr.length ||
                    arr[c - i] != arr[c + i + 1]) {
                return c - (i - 1);
            }
        }
    }

    public static class SubArray {
        public int left, right;

        public SubArray(int left, int right) {
            this.left = left;
            this.right = right;
        }
    }

    public static SubArray getMaxLengthSymSubArray(int[] arr) {
        int l, r;
        l = r = 0;
        for (int c = 0; c < arr.length; c++) {
            int l1 = getSymLeft1(arr, c);
            if ((c - l1) * 2 + 1 > r - l + 1) {
                l = l1;
                r = c + (c - l1);
            }
            int l2 = getSymLeft2(arr, c);
            if (l2 >= 0 && (c - l2) * 2 + 2 > r - l + 1) {
                l = l2;
                r = c + (c - l2) + 1;
            }
        }
        return new SubArray(l, r);
    }
}
