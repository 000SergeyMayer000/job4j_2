package ru.job4j2.condition;

import ru.job4j2.converter.Point;

/**
 * 9. Площадь треугольника.[#235459]
 */
public class TrgArea {
    /**
     * в поле прописаны объекты тпа Point представляющие вершины труегольника
     */
    private Point first;
    private Point second;
    private Point third;

    /**
     * конструктор приниящий объекты типа Point
     *
     * @param ap  - вершина треугольника Point
     * @param bp- вершина треугольника Point
     * @param cp  - вершина треугольника Point
     */
    public TrgArea(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    /**
     * Метод вычисления полупериметра по длинам сторон.
     *
     * @param a расстояние между точками a b
     * @param b расстояние между точками a c
     * @param c расстояние между точками b c
     * @return полупериметр.
     */
    public double halfPer(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    /**
     * метод вычисляет площадь треугольника
     *
     * @return - знчение площади, а если труегольник не сцществует - -1
     */
    public double area() {
        double rsl = -1;
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = halfPer(a, b, c);
        if (this.exist(a, b, c)) {
            rsl = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        return rsl;
    }

    /**
     * Метод проверяет можно ли построить треугольник с такими длинами сторон.
     *
     * @param a Длина от точки a b.
     * @param b Длина от точки a c.
     * @param c Длина от точки b c.
     * @return - true(false)
     */
    private boolean exist(double a, double c, double b) {
        return (a + b) > c && (b + c) > a && (c + a) > b;
    }
}