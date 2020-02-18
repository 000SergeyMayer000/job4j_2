package ru.job4j_2.array;

/**
 * 6.7.1. Моно строка в матрице.[#235437]
 */
public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = false;
        for (int i = 0; i < board.length - 1; i++) {
            if (board[row][i] == 'X' && (board[row][i] == board[row][i + 1])) {
                result = true;
            }
        }
        return result;
    }
}
