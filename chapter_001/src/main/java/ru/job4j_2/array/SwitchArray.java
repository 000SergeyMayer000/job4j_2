package ru.job4j_2.array;

/**
 * 6.2.1. Выход за границу массива.[#235444]
 */

public class SwitchArray {

    /**
     * Метод swapBorder - меняет местами нулевой элемент и последний элемент в массиве.
     * @param array - исходный массив
     * @return - измененный массив
     */
    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }
}