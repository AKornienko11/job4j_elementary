package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i = row; i < row + 1; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int colum) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            for (int j = colum; j <= colum; j++) {
                if (board[i][j] != 'X') {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}


