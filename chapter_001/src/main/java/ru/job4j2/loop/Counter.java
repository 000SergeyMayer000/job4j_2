package ru.job4j2.loop;

/**
 * 5.0.1. Сумма чисел.[#235500]
 * 5.1. Подсчет суммы чётных чисел в диапазоне[#235502]
 */
public class Counter {

    /**
     * метод складывает все числа в диапазоне
     *
     * @param start  - начало диапазона
     * @param finish - конец диапазона
     * @return - сумма
     */
    public static int sum(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }
        return sum;
    }

    /**
     * метод складывает все четные числа из диапазона
     *
     * @param start  - начало диапазона
     * @param finish - конец диапазона
     * @return - сумма
     */
    public static int sumByEven(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        System.out.println(sum(-2, 10));
        System.out.println(sum(3, 10));
        System.out.println(sum(1, 1));
        System.out.println(sum(0, 3) + " + " + sum(4, 5) + " = " + sum(0, 5));
        System.out.println(sumByEven(0, 10));
        System.out.println(sumByEven(5, 0));
        System.out.println(sumByEven(1, 1));
    }
}