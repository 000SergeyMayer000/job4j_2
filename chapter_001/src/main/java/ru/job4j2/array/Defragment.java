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
        for (int index = 0; index < array.length; index++) {
            if (array[index] == null) {
                int point = index;
                while (array[index] == null) {
                    if (array[point] != null) {
                        String count = array[point];
                        array[point] = array[index];
                        array[index] = count;
                    }
                    point++;
                    if (point == array.length) {
                        break;
                    }
                }
            }
        }
        return array;
    }

//    public static String[] compress(String[] array) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == null) {
//                int point = i;
//                while (point < array.length - 1) {
//                    if (array[point + 1] != null) {
//                        array[i] = array[point + 1];
//                        array[point + 1] = null;
//                        break;
//                    }
//                    point++;
//                }
//            }
//        }
//        return array;
//    }

//      public static String[] compress(String[] array) {
//            int pointer = -1; // указатель на последнюю ячейку со значением
//            for (int c = 0; c < array.length; c++) {
//                if (array[c] != null) {
//                    array[++pointer] = array[c];
//                }
//            }
//            if (pointer > -1) {
//                for (int c = pointer + 1; c < array.length; c++)
//                    array[c] = null;
//            }
//            return array;
//        }

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
