package ru.job4j2.sort;

import java.util.Arrays;

public class Merge {

    @SuppressWarnings("checkstyle:EmptyBlock")
    public int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0; //индекс левого имассива
        int j = 0; // индекс правого массива

        while (i + j != rsl.length) {
            if (i < left.length && j == right.length) {
                rsl[i + j] = left[i];
                i++;
            } else if (j < right.length && i == left.length) {
                rsl[i + j] = right[j];
                j++;
            } else {
                if (left[i] < right[j]) {
                    rsl[i + j] = left[i];
                    i++;
                } else {
                    rsl[i + j] = right[j];
                    j++;
                }
            }
            }
        return rsl;
    }

    public static void main(String[] args) {
        int i = 0;
     while (i < 5) {
            System.out.println(i + " < 5");
            i++;
        }
        System.out.println(i);
//        Merge process = new Merge();
//        int[] rsl = process.merge(
//                new int[]{1, 3, 5},
//                new int[]{2, 4}
//        );
//        System.out.println(Arrays.toString(rsl));
    }
}

