import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        ValidSudoku start = new ValidSudoku();
        char[][] board = new char[][] { { '.', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '.', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };
        System.out.println(start.isValidSudoku(board));
    }

    public boolean isValidSudoku(char[][] board) {
        HashSet<String> check = new HashSet();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!check.add(b + i) || !check.add(j + b) || !check.add(i / 3 + b + j / 3))
                        return false;
                }
            }
        }
        return true;
    }
}