package com.company;
// Нужна вертикальная парабола
/**
 * "Горизонтальная" парабола вида x = a * (y - y0) + x0
 */
public class VerticalParabola {
    public double x0;
    public double y0;
    public double a;

    public VerticalParabola(double x0, double y0, double a) {
        this.x0 = x0; // 0
        this.y0 = y0; // -5
        this.a = a; //0.25
    }

    /**
     * Проверяет, находится ли точка (x, y) справа
     * (сверху, если повернуть изображение на 90 градусов
     * против часовой стрелки)
     * от параболы
     */
    public boolean isPointAboveOfParabola(double x, double y) {
        return y > a * Math.pow(x - x0, 2) + y0;
    }
}