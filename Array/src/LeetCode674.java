/**
 * Created by OovEver on 2017/9/28.
 */
public class LeetCode674 {
    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            dp[i] = 1;
        }
        int max = 1;
        for(int i=1;i<nums.length;i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = Math.max(dp[i], dp[i-1] + 1);
                if (max < dp[i]) {
                    max = dp[i];
                }
            }
        }
        return max;

    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        System.out.println(findLengthOfLCIS(nums));

    }
}
