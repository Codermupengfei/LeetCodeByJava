import org.omg.CORBA.INTERNAL;

/**
 * Created by OovEver on 2017/8/22.
 */
public class LeetCode494 {
    public static int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
        }
        if (S>sum||(sum + S) % 2 == 1) {
            return 0;
        }
        return subsetSum(nums, (sum + S) / 2);
    }

    private static int subsetSum(int[] nums, int S){
        int[] dp = new int[S+1];
        dp[0] = 1;
        for(int i=0;i<nums.length;i++) {
            for(int j=S;j>=nums[i];j--) {
                dp[j] += dp[j - nums[i]];
                if (i == nums.length-1) {
                    break;
                }
            }
        }
        return dp[S];
    }
    private static int subsetSum2(int[] nums, int S){
        int[] dp = new int[S + 1];
        dp[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = S; j >= nums[i]; j--) {
                dp[j] += dp[j - nums[i]];
            }
        }
        return dp[S];
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(findTargetSumWays(nums, 2));
    }
}
