package ru.job4j2.array;

/**
 * 6.5.2. Поиск минимума в диапазоне.[#235436]
 */
public class MinDiapason {

    /**
     *  минимум в массиве в диапазоне индексов
     * @param array - входящий массив.
     * @param start - индекс начало диапазона поска
     * @param finish - индекс конца диапазона
     * @return - min
     */
    public static int findMin(int[] array, int start, int finish) {
        int min = array[start];
        for (int index = start; index <= finish; index++) {
            if (array[index] < min) {
                min = array[index];
            }
        }
        return min;
    }
}