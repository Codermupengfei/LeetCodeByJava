/**
 * Created by OovEver on 2017/10/31.
 */
public class LeetCode718 {
    public int findLength(int[] A, int[] B) {
        if (A == null || B == null) {
            return 0;
        }
        int m = A.length;
        int n = B.length;
        int[][] dp = new int[m + 1][n + 1];
        int max = 0;
        for(int i=0;i<=m;i++) {
            for(int j=0;j<=n;j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
                else if(A[i-1]==B[j-1]){
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }
}
