/**
 * Created by OovEver on 2017/10/24.
 */
public class LeetCode304 {
    private int[][] dp;

    private LeetCode304(int[][] matrix) {
        if(   matrix           == null
                || matrix.length    == 0
                || matrix[0].length == 0   ){
            return;
        }
        int m=matrix.length;
        int n=matrix[0].length;
        dp = new int[m + 1][n + 1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                dp[i][j]=-dp[i-1][j-1]+dp[i][j-1]+dp[i-1][j]+matrix[i-1][j-1];
            }
        }

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int rmax=Math.max(row1,row2);
        int rmin=Math.min(row1,row2);
        int cmax=Math.max(col1,col2);
        int cmin=Math.min(col1,col2);
        return dp[rmax+1][cmax+1]-dp[rmax+1][cmin]-dp[rmin][cmax+1]+dp[rmin][cmin];

    }
}
