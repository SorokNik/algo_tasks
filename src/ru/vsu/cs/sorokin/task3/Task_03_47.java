package ru.vsu.cs.sorokin.task3;

import java.util.Scanner;

public class Task_03_47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите координату x: ");
        double x = scanner.nextInt();

        System.out.print("Введите координату y: ");
        double y = scanner.nextInt();


        System.out.printf("%s", getColor(x, y));
    }

    public static final Line HorizontalLine = new Line(0, 2, 0);
    public static final Rectangle Rec = new Rectangle(-2, -6, 4, -3);
    public static final HorizontalParabola HP = new HorizontalParabola(4, 4, -0.5);
    public static final Line ObliqueLine = new Line(0, 0.5, 0.25);
    public static final VerticalParabola VP = new VerticalParabola(0, -3, -1.0 / 8);

    public static SimpleColor getColor(double x, double y) {
        if (HorizontalLine.isPointAboveLine(x, y) && Rec.isPointInsideRectangle(x, y)) {
            return SimpleColor.BLUE;
        }else if (HorizontalLine.isPointAboveLine(x, y)) {
            return SimpleColor.GREEN;
        }else if (HorizontalLine.isPointBelowLine(x, y) && Rec.isPointInsideRectangle(x, y) && HP.isPointLeftOfParabola(x, y)) {
            return SimpleColor.BLUE;
        }else if (HorizontalLine.isPointBelowLine(x, y) && HP.isPointLeftOfParabola(x, y)) {
            return SimpleColor.ORANGE;
        }else if (ObliqueLine.isPointAboveLine(x, y) && !Rec.isPointInsideRectangle(x, y)) {
            return SimpleColor.BLUE;
        }else if (VP.isPointBelowOfParabola(x, y)) {
            return SimpleColor.GRAY;
        }else {
            return SimpleColor.WHITE;
        }
    }
}