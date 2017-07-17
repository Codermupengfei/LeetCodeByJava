/**
 * Created by OovEver on 2017/7/16.
 * 滑动窗口法
 */
public class LeetCode643 {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++) {
            sum += nums[i];
        }
        int maxSum=sum;
        for(int i=0,j=k;j<nums.length;i++,j++) {
            sum = sum - nums[i] + nums[j];
            maxSum = Math.max(sum, maxSum);
        }
        return (double) maxSum / (double) k;
    }
}
