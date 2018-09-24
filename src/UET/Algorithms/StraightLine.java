package UET.Algorithms;

import java.util.Scanner;

class Point {
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    void scanPoint() {
        Scanner scanner = new Scanner(System.in);
        double x, y;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        this.x = x;
        this.y = y;
    }
}

public class StraightLine {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.scanPoint();
    }
}
