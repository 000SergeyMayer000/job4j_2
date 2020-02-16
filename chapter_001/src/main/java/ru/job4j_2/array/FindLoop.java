package ru.job4j_2.array;

/**
 * 6.1. Классический поиск перебором.[#235426]
 */

public class FindLoop {

    /**
     * метод возвращает индех эллемента массива, если такой есть  и -1 если отсутствует
     * @param data - массива для поиска
     * @param el - эллемент массива, который необходимао найти
     * @return  - индекс нойденой ячейки
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
            for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}