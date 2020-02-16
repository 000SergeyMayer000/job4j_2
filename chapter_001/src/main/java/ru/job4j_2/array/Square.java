package ru.job4j_2.array;

/**
 * 6.0.4. Заполнить массив степенями чисел.[#235425]
 */
public class Square {

    /**
     * метод возвращает квадрат числа переданного в параметры
     *
     * @param bound - аргумент
     * @return - rst
     */
    public static int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int index = 0; index < rst.length; index++) {
            rst[index] = index * index;
        }
        return rst;
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        int[] array = calculate(4);
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
}