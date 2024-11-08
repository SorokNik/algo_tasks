package ru.vsu.cs.sorokin.task3;

public class Rectangle {
    public double x1;
    public double x2;
    public double y1;
    public double y2;

    public Rectangle(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

    }

    public boolean isPointInsideRectangle(double x, double y) {

        double upperLimit = Math.max(y1, y2);
        double lowerLimit = Math.min(y1, y2);
        double leftLimit = Math.min(x1, x2);
        double rightLimit = Math.max(x1, x2);

        return (leftLimit < x && x < rightLimit) && (y > lowerLimit && y < upperLimit);
    }
}