package ru.job4j_2.array;

/**
 * 6.7.1. Моно строка в матрице.[#235437]
 * 6.7.2. Моно столбец в матрице.[#235438]
 */
public class MatrixCheck {

    /**
     * метод проверяет все ли элементы горизонтали (строки) массива заполнены 'X'
     *
     * @param board - проверяемый массив
     * @param row   - проверыемая горизонталь (строка)
     * @return - true в случае успеха
     */
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    /**
     * метод проверяет все ли элементы вертикали (столбца) массива заполнены 'X'
     *
     * @param board  - проверяемый массив
     * @param column - проверыемая вертикаль (столбец)
     * @return - true в случае успеха
     */
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}
