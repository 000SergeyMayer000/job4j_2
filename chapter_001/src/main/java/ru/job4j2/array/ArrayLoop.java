package ru.job4j2.array;

/**
 * 6.0.3. Массивы и цикл for.[#235441]
 */
public class ArrayLoop {

    /**
     * Main
     *
     * @param args - String[] args
     */
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int index = 0; index < numbers.length; index++) {
            numbers[index] = index * 2 + 3;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
