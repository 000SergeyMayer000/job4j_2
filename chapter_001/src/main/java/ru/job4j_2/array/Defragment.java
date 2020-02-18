package ru.job4j_2.array;

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
                for (int j = i; j < array.length; j++) {
                    if (array[j] != null) {
                        array[i] = array[j];
                        array[j] = null;
                        break;
                    }
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
