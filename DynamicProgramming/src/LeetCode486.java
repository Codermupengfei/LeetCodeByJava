/**
 * Created by OovEver on 2017/8/23.
 */
public class LeetCode486 {
    public boolean PredictTheWinner(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int n = nums.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<nums.length;i++) {
            dp[i][i] = nums[i];
        }
        for(int i=n-2;i>=0;i--) {
            for(int j=i+1;j<n;j++) {
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1]);
            }
        }
        return dp[0][n - 1] >= 0;
    }
}
