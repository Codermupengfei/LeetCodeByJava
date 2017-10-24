import org.omg.CORBA.IMP_LIMIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/9/16.
 */
public class LeetCode368 {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        Arrays.sort(nums);
        int[] dp = new int[nums.length];
        for(int i = 0; i<dp.length;i++) {
            dp[i] = 1;
        }
        for(int i=1;i<dp.length;i++) {
            for(int j=i-1;j>=0;j--) {
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        int maxIndex = 0;
        for(int i=1;i<nums.length;i++) {
            if (dp[i] > dp[maxIndex]) {
                maxIndex = i;
            }

        }

        int temp = nums[maxIndex];
        int curDp = dp[maxIndex];
        for(int i=maxIndex;i>=0;i--) {
            if (temp % nums[i] == 0 && curDp == dp[i]) {
                res.add(nums[i]);
                temp = nums[i];
                curDp--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 8, 9, 27};
        System.out.println(largestDivisibleSubset(nums));

    }
}
