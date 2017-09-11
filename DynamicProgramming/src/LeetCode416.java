import javax.xml.stream.FactoryConfigurationError;
import java.util.Arrays;

/**
 * Created by OovEver on 2017/9/11.
 */
public class LeetCode416 {
    public boolean canPartition(int[] nums) {
        if (nums == null || nums.length == 0) {
            return true;
        }
        int n = nums.length;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        if ((sum & 1) == 1) {
            return false;
        }
        int volum = sum / 2;
        boolean[][] dp = new boolean[n + 1][volum + 1];
        for(int i=0;i<dp.length;i++) {
            Arrays.fill(dp[i], false);
        }
        dp[0][0] = true;
        for(int i=1;i<n+1;i++) {
            dp[i][0] = true;
        }
        for(int j=1;j<volum+1;j++) {
            dp[0][j] = false;
        }
        for(int i=1;i<n+1;i++) {
            for(int j=1;j<volum+1;j++) {
                dp[i][j] = dp[i-1][j];
                if (j >= nums[i - 1]) {
                    dp[i][j] = (dp[i][j] || dp[i - 1][j - nums[i - 1]]);
                }
            }
        }
        return dp[n][volum];
    }

}
