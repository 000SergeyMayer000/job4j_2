package ru.job4j2.array;

/**
 * 6.6.2. Двухмерный массив. Таблица умножения.[#235427]
 */
public class Matrix {

    /**
     * метод реализует таблицку умнажения
     *
     * @param size - размер таблицы
     * @return - таблица умнажения заданного размера
     */
    int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return array;
    }
}