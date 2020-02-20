package ru.job4j2.array;

/**
 * 6.8. Дефрагментация массива.[#235447]
 */
public class Defragment {

    /**
     * метод переносит все пустые ячейки в конец массива
     *
     * @param array - исходный массив
     * @return - конечный массив
     */
    public static String[] compress(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                int point = i;
                while (point < array.length - 1) {
                    if (array[point + 1] != null) {
                        array[i] = array[point + 1];
                        array[point + 1] = null;
                        break;
                    }
                    point++;
                }
            }
        }
        return array;
    }

    /**
     * Main
     *
     * @param args - args
     */
    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] compressed = compress(input);
        System.out.println();
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}
