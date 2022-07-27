package com.company;

public class Line {
    public double x0;
    public double y0;
    public double a;

    public Line(double x0, double y0, double a) {
        this.x0 = x0; // = -1
        this.y0 = y0; // = 2
        this.a = a; // -2
    }

    /**
     * Проверяет, находится ли точка (x, y) выше линии
     */
    public boolean isPointAboveLine(double x, double y) {
        return y > a * (x - x0) + y0;
    }
}
