package ru.job4j2.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 4. Конвертация двумерного массива в ArrayList[#235530]
 */
public class ConvertMatrix2List {
    /**
     * метод конвертируем двумерный массив в список List<Integer>
     *
     * @param array - входящий список
     * @return - двумерный масив
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}

