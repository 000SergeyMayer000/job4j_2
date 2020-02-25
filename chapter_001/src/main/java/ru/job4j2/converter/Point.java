package ru.job4j2.converter;

/**
 * 7. Расстояние между точками в системе координат[#235463]
 */
public class Point {

    /**
     * метод находит расстояне мужду двух точек с заданными координатами
     *
     * @param x1 - абсцисса первой точки
     * @param y1 - ордината первой точки
     * @param x2 - абсциса второй точки
     * @param y2 - ордината второй точки
     * @return - расстояние
     */
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return rsl;
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        double result = Point.distance(0, 3, 4, 0);
        System.out.println("result (0, 3) to (4, 0) " + result);
    }
}