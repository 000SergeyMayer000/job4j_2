package ru.job4j2.converter;

/**
 * 5. Конвертер валюты.[#235452]
 */
public class Converter {

    /**
     * метод конвертирует рубли в евро
     *
     * @param value - рубли
     * @return - евро
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     * метод конвертирует рубли в доллары
     * @param value - рубли
     * @return - доллары
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     * метод конвертирует евро в рубли
     * @param value - евро
     * @return - рубли
     */
    public static int euroToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }

    /**
     * метод конвертирует доллары в рубли
     * @param value - доллары
     * @return - рубли
     */
    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2 euro. Test result : " + passed);
        int in2 = 180;
        int expected2 = 3;
        int out2 = rubleToDollar(in2);
        boolean passed2 = expected == out;
        System.out.println("180 rubles are 3 dollars. Test result : " + passed);
    }
}