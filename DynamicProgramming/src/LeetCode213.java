/**
 * Created by OovEver on 2017/9/16.
 */
public class LeetCode213 {
    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(maxRob(nums, 0, nums.length - 2), maxRob(nums, 1, nums.length - 1));
    }

    int maxRob(int[] nums, int s, int e) {
        int n = e - s + 1;
        int[] dp = new int[n];
        dp[0] = nums[s];
        dp[1] = Math.max(nums[s], nums[s + 1]);
        for(int i=2;i<n;i++) {
            dp[i] = Math.max(dp[i - 2] + nums[s + i], dp[i - 1]);
        }
        return dp[n - 1];
    }
}
