package ru.job4j2.sort;

import java.util.Arrays;

/**
 * Объединить два массива [#124482]
 */
public class Merge {
    /**
     * метод объединяет два отсортированных массива в третий
     * @param left - первый массив
     * @param right - второй массив
     * @return - объединенны массив
     */
    public int[] merge(int[] left, int[] right) {
        int indexLeft = 0;
        int indexRight = 0;
        int indexArr = 0;
        int[] arr = new int[left.length + right.length];
        while (indexArr < arr.length) {
            if (indexLeft == left.length) {
                arr[indexArr++] = right[indexRight++];
            } else if (indexRight == right.length) {
                arr[indexArr++] = left[indexLeft++];
            } else if (right[indexRight] > left[indexLeft]) {
                arr[indexArr++] = left[indexLeft++];
            } else {
                arr[indexArr++] = right[indexRight++];
            }

        }
        return arr;
    }

    /**
     * Main
     * @param args - args
     */
    public static void main(String[] args) {
        Merge mergingArrays = new Merge();
        int[] a = {1, 3, 5};
        int[] b = {2, 4};
        System.out.println(Arrays.toString(mergingArrays.merge(a, b)));
    }
}


