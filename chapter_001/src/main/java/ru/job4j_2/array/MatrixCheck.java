package ru.job4j_2.array;

/**
 * 6.7.1. Моно строка в матрице.[#235437]
 * 6.7.2. Моно столбец в матрице.[#235438]
 * 6.7.3. Массив из диагонали матрицы. [#235439]
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

    /**
     * метод возвращает массив элементов, взятых по диагонали из исходного массива
     *
     * @param board - исходный массив
     * @return - rsl
     */
    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    /**
     * метод проверяет есть ли выигрышная ситуация  в игре сокобан
     *
     * @param board - исходный массив
     * @return - в случае наличия горизонтали (или вертикали) заполненой символами 'X' - возвращает true
     */
    public static boolean isWin(char[][] board) {
        boolean result = false;
        char[] diagonalArray = extractDiagonal(board);
        for (int i = 0; i < diagonalArray.length; i++) {
            if (diagonalArray[i] == 'X' || monoHorizontal(board, i) || monoVertical(board, i)) {
                result = true;
                break;
            }
        }
        return result;
    }
}
