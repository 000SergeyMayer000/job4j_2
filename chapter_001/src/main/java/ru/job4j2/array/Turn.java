package ru.job4j2.array;

/**
 * 6.2.3. Перевернуть массив.[#235443]
 */
public class Turn {
    /**
     * метод back переставляет все эллементы массива в обратном порядке
     *
     * @param array -  исходный массив
     * @return - измененный массив
     */
    public static int[] back(int[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }
}