package ru.job4j2.condition;

public class Triangle {

    public static boolean exist(double ab, double ac, double bc) {
        return ((ab + bc) > ac && (bc + ac) > ab && (ac + ab) > bc);
    }
}