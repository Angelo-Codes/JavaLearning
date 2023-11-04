import java.util.HashSet;

public class CheckIfSudokuIsValid {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 7, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 7, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        System.out.println(isValidSudoku(board));

    }

    private static boolean isValidSudoku(int[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                int num = board[i][j];
                if (num != 0) {
                    if (!seen.add(num + " in row " + i) || !seen.add(num + " in column " + i) || !seen.add(num + " in block " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
