/**
 * Created by OovEver on 2017/9/13.
 */
public class LeetCode221 {
    public static int maximalSquare(char[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int R = matrix.length;
        int C = matrix[0].length;
        int max_sum = 0;
        int dp[][] = new int[R][C];
        for(int i=0;i<R;i++) {
            dp[i][0] = matrix[i][0]-'0';
            if (dp[i][0] > max_sum) {
                max_sum = dp[i][0];
            }
        }
        for(int j=0;j<C;j++) {
            dp[0][j] = matrix[0][j]-'0';
            if (dp[0][j] > max_sum) {
                max_sum = dp[0][j];
            }
        }
        for(int i=1;i<R;i++) {
            for(int j=1;j<C;j++) {
                if (matrix[i][j] == '1') {
                    dp[i][j] = Math.min(dp[i - 1][j], Math.min(dp[i - 1][j - 1], dp[i][j - 1])) + 1;
                    if (dp[i][j] > max_sum) {
                        max_sum = dp[i][j];
                    }
                }else {
                    dp[i][j] = 0;
                }
            }
        }
        return max_sum*max_sum;
    }

    public static void main(String[] args) {
        char[][] matrix = {{'1'}};
        System.out.println(maximalSquare(matrix));
    }
}
