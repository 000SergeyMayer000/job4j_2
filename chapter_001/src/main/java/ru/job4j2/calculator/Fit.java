package ru.job4j2.calculator;

/**
 * 6. Идеальный вес.[#235453]
 */
public class Fit {

    /**
     * метод вычесляет идеальный вес для мужчин
     *
     * @param height - рост
     * @return - вес
     */
    public static double manWeight(double height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    /**
     * метод вычесляет идеальный вес для женщин
     *
     * @param height - рост
     * @return - вес
     */
    public static double womanWeight(double height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    /**
     * Main
     *
     * @param args - args
     */
    public static void main(String[] args) {
        double man = Fit.manWeight(178);
        System.out.println("Man 178 cm is " + man + " kg");
        double woman = Fit.womanWeight(165);
        System.out.println("Woman 165 cm is " + woman + " kg");
    }
}