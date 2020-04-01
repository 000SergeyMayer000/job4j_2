package ru.job4j2.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Конвертация листа массивов в один лист Integer[#235532]
 */
public class ConvertList {
    /**
     *конвертирует список массивов в список чисел
     * @param list - List<int[]>
     * @return - List<Integer>
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] ints : list) {
            for (int anInt : ints) {
                rsl.add(anInt);
            }
        }
        return rsl;
    }
}