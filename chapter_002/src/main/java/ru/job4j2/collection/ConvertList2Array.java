package ru.job4j2.collection;


import java.util.List;

/**
 * 3. Конвертация ArrayList в двухмерный массив[#235531]
 */
public class ConvertList2Array {
    /**
     * метод конвертирует список List<Integer> в двумерный размер заданного размера
     * @param list - исходий список
     * @param cells - колличество элементов в массиве
     * @return - двумерный массив
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell] = num;
            if (cell < cells-1) {
                cell++;
            } else {
                row++;
                cell = 0;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 7);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}