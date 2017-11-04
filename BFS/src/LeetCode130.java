import sun.misc.FloatingDecimal;

import javax.crypto.Cipher;
import java.text.DateFormatSymbols;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by OovEver on 2017/11/4.
 */
public class LeetCode130 {
    public void solve(char[][] board) {
        if (board == null || board.length == 0 || board[0].length == 0) {
            return;
        }
        int height = board.length;
        int weidth = board[0].length;
        Deque<int[]> queue = new ArrayDeque<>();
        for(int i=0;i<weidth;i++) {
            if (board[0][i] == 'O') {
                queue.addLast(new int[]{0, i});
                board[0][i] = 'V';
            }
            if (board[height - 1][i] == 'O') {
                queue.addLast(new int[]{height - 1, i});
                board[height - 1][i] = 'V';
            }
        }
        for(int i=1;i<height-1;i++) {
            if (board[i][0] == 'O') {
                queue.addLast(new int[]{i,0});
                board[i][0] = 'V';
            }
            if (board[i][weidth - 1] == 'O') {
                queue.addLast(new int[]{i, weidth - 1});
                board[i][weidth - 1] = 'V';
            }
        }
        while (!queue.isEmpty()) {
            int[] cur = queue.removeFirst();
//           上
            if (cur[0] - 1 >= 0 && board[cur[0] - 1][cur[1]] == 'O') {
                queue.addLast(new int[]{cur[0] - 1, cur[1]});
                board[cur[0] - 1][cur[1]] = 'V';
            }
//           下
            if (cur[0] + 1 <height && board[cur[0] + 1][cur[1]] == 'O') {
                queue.addLast(new int[]{cur[0] + 1, cur[1]});
                board[cur[0] + 1][cur[1]] = 'V';
            }
//            左
            if (cur[1] - 1 >= 0 && board[cur[0]][cur[1] - 1] == 'O') {
                queue.addLast(new int[]{cur[0], cur[1] - 1});
                board[cur[0]][cur[1] - 1] = 'V';
            }
//            右
            if (cur[1] + 1 <weidth && board[cur[0]][cur[1] + 1] == 'O') {
                queue.addLast(new int[]{cur[0], cur[1] + 1});
                board[cur[0]][cur[1] + 1] = 'V';
            }
        }
        for(int i=0;i<height;i++) {
            for (int j=0;j<weidth;j++) {
                if(board[i][j]=='O')
                    board[i][j] = 'X';
                if (board[i][j] == 'V') {
                    board[i][j] = 'O';
                }
            }
        }
    }
}
