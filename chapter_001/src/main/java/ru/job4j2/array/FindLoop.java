package ru.job4j2.array;

/**
 * 6.1. Классический поиск перебором.[#235426]
 */
public class FindLoop {

    /**
     * метод возвращает индех эллемента массива, если такой есть  и -1 если отсутствует
     *
     * @param data - массива для поиска
     * @param el   - эллемент массива, который необходимао найти
     * @return - индекс нойденой ячейки
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

    /**
     * метод возвращает индех эллемента из заданного диапазона массива, если такой есть  и -1 если отсутствует
     *
     * @param data   - массива для поиска
     * @param el     - эллемент массива, который необходимао найти
     * @param start  - индекс ячейки начала диапазона
     * @param finish - индекс ячейки конец диапазона
     * @return -  индекс нойденой ячейки
     **/
    public static int indexOf(int[] data, int el, int start, int finish) {
        int rst = -1;
        for (int index = start; index <= finish; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    /**
     * 6.5.3. Сортировка выборкой.[#235434]
     * @param - сортируемый массив
     * @return - отсортированнный массив
     */
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexOf(data, min, 0, data.length - 1);
            int tmp = data[i];
            data[i] = data[index];
            data[index] = tmp;
        }
        return data;
    }


}