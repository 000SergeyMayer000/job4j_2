package ru.job4j2.condition;

/**
 * 4.3. А существует ли треугольник?[#235423]
 */
public class Triangle {

    /**
     * метод проверяет существует ли треугольник с заданными параметрами
     *
     * @param ab - длина стороны
     * @param ac - длина стороны
     * @param bc - длина стороны
     * @return - true(false)
     */
    public static boolean exist(double ab, double ac, double bc) {
        return (ab + bc) > ac && (bc + ac) > ab && (ac + ab) > bc;
    }
}