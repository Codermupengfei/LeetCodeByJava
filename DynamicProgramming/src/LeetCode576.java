/**
 * Created by OovEver on 2017/9/7.
 */
public class LeetCode576 {
    public static int findPaths(int m, int n, int N, int i, int j) {
       long [][][]dp=new long[N+1][m][n];
        for(int step=1;step<N+1;step++) {
            for(int row=0;row<m;row++) {
                for(int col=0;col<n;col++) {
                    dp[step][row][col] = ((row == 0 ? 1 : dp[step - 1][row - 1][col]) +
                            (row == m - 1 ? 1 : dp[step - 1][row + 1][col]) +
                            (col == 0 ? 1 : dp[step - 1][row][col - 1]) +
                            (col == n - 1 ? 1 : dp[step - 1][row][col + 1])
                    )% 1000000007;
                }
            }
        }
        return (int)dp[N][i][j];
    }

    public static void main(String[] args) {
        System.out.println(findPaths(2, 2, 2, 0, 0));
    }

}
