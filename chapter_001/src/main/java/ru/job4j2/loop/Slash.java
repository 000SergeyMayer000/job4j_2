package ru.job4j2.loop;

/**
 * 5.9. Крест в псевдографике. [#235499]
 */
public class Slash {

    /**
     * метод draw выволдит в консоль крест в псевдографике
     *
     * @param size - параметр задает размер креста
     */
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int cell = 0; cell < size; cell++) {
                boolean left = (cell == row);
                boolean right = (((cell + row) + 1) == size);
                if (left) {
                    System.out.print("0");
                } else if (right) {
                    System.out.print("0");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    /**
     * Main
     *
     * @param args - String[] args
     */
    public static void main(String[] args) {
        System.out.println("Draw by 3");
        draw(3);
        System.out.println("Draw by 5");
        draw(5);
        System.out.println("Draw by 7");
        draw(7);
    }
}