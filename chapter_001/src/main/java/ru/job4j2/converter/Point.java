package ru.job4j2.converter;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * 7. Расстояние между точками в системе координат[#235463]
 */
public class Point {

    /**
     * Это поле объекта. Оно доступно только конкретному объекту.
     */
    private int x;
    private int y;
    private int z;

    /**
     * конструктор - особый метод класса, инициализирующий состояние объекта во время его создания
     *
     * @param first  - первый параметр - X
     * @param second - второй параметр - Y
     */
    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    /**
     * конструктор - особый метод класса, инициализирующий состояние объекта во время его создания
     *
     * @param first  - первый параметр - X
     * @param second - второй параметр - Y
     * @param third  - второй параметр - Z
     */
    public Point(int first, int second, int third) {
        this.x = first;
        this.y = second;
        this.z = third;
    }

    /**
     * метод определяет расстояние от точки на которой
     * вызван метод до точки, которая передается в качестве параметра
     *
     * @param that - вторая точка
     * @return - растояние
     */
    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    /**
     * метод для трехмерного пространства(перегруженный) определяет расстояние от точки на которой
     * вызван метод до точки, которая передается в качестве параметра
     *
     * @param that - вторая точка
     * @return - растояние
     */
    public double distance3D(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }


    /**
     * Main
     *
     * @param args - args
     */
    public static void main(String[] args) {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double dist = a.distance(b);
        System.out.println(dist);
    }
}