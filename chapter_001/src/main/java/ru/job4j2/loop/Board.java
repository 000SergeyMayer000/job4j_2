package ru.job4j2.loop;


/**
 *  5.3. Построить шахматную доску в псевдографике.[#235506]
 */
public class Board {

    /**
     * метод строит шахматную доску в псевдографике
     * @param width - размер по ширине
     * @param height - размер по высоте
     */
    public static void paint(int width, int height) {
        for (int row = 0; row < height; row++) {
            for (int cell = 0; cell < width; cell++) {
                if ((cell + row) % 2 == 0) {
                    System.out.print(" Х ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        paint(3, 3);
        System.out.println();
        paint(5, 4);
    }
}