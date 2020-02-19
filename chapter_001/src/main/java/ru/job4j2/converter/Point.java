package ru.job4j2.converter;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 3, 4, 0);
        System.out.println("result (0, 3) to (4, 0) " + result);
    }
}