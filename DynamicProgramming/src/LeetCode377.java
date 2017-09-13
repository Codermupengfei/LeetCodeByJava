import java.util.Arrays;

/**
 * Created by OovEver on 2017/9/13.
 */
public class LeetCode377 {
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);
        int[] dp = new int[target + 1];
        for(int i=1;i<target+1;i++) {
            for (int num : nums) {
                if (num > i) {
                    break;
                } else {
                    if (num == i) {
                        dp[i] += 1;
                    } else {
                        dp[i] += dp[i - num];
                    }
                }
            }
        }
        return dp[target];
    }
}
