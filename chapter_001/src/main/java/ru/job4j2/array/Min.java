package ru.job4j2.array;

/**
 * 6.5.1. Поиск минимального числа в массиве.[#235435]
 */
public class Min {

    /**
     * метод находит минимальный элемент из массива
     *
     * @param array - входящий масив
     * @return - минимальный элемент
     */
    public static int findMin(int[] array) {
        int min = array[0];
        for (int index = 0; index < array.length; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}
