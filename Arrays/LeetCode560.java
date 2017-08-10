/**
 * Created by admin on 2017/8/10.
 */
public class LeetCode560 {
    public static int subarraySum(int[] nums, int k) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            int sum = nums[i];
            if (sum == k) {
                count++;
            }
            for(int j=i+1;j<nums.length;j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {-1, -1, 1};
        System.out.println(subarraySum(nums,0));
    }
}
