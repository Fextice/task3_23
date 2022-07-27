package com.company;

public class Rectangle {
    public double x0;
    public double y0;
    public double width; // Ширина
    public double height; // Высота


    public Rectangle(double x0, double y0, double width, double height) {
        this.x0 = x0;
        this.y0 = y0;
        this.width = width;
        this.height = height;
    }

    public boolean isPointInRectangle(double x, double y) {
        return (x > x0) && (x < x0 + width) && (y > y0) && (y < y0 + height);
    }
}