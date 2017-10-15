import java.util.HashSet;

/**
 * Created by OovEver on 2017/7/11.
 */
public class LeetCode36 {
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> cube = new HashSet<>();
            for(int j=0;j<9;j++) {
                if (board[i][j] != '.' && !row.add(board[i][j])) {
                    return false;
                }
                if (board[j][i] != '.' && !col.add(board[j][i])) {
                    return false;
                }
                int rowIndex = (i / 3) * 3 + j / 3;
                int colIndex = 3 * (i % 3) + j % 3;
                if (board[rowIndex][colIndex] != '.' && !cube.add(board[rowIndex][colIndex])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char [][]bord={{'.','8','7','6','5','4','3','2','1'},{'2','7','.','.','.','.','.','.','.'},{'3','.','.','.','.','.','.','.','.'},{'4','.','.','.','.','.','.','.','.'},{'5','.','.','.','.','.','.','.','.'},{'6','.','.','.','.','.','.','.','.'},{'7','.','.','.','.','.','.','.','.'},{'8','.','.','.','.','.','.','.','.'},{'9','.','.','.','.','.','.','.','.'}};
        System.out.println(isValidSudoku(bord));
}
}
