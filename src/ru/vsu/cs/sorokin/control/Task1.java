package ru.vsu.cs.sorokin.control;

public class Task1 {
    public static void main(String[] args) {

    }

    public static boolean solve(double x, double v2) {
        boolean res = false;

        if (x > -2 && x < 2 && v2 > -2 && v2 < 2) {
            if (v2 > 0 && x > 0 && 1 < (x * x + v2 * v2) && v2 > x) {
                res = true;
            }
            if (x < 0 && v2 > 0 && v2 < -x && 1 < (x * x + v2 * v2) && 2 * 2 > (x * x + v2 * v2)) {
                res = true;
            }

            if (v2 < 0 && v2 < x && x < 0 && 1 < (x * x + v2 * v2) && 2 * 2 > (x * x + v2 * v2)) {
                res = true;
            }

            if (v2 < 0 && x > 0 && 1 > (x * x + v2 * v2) && v2 < -x) {
                res = true;
            }
        }
        return res;
    }
}
