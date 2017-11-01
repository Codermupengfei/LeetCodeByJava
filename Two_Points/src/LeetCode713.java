/**
 * Created by OovEver on 2017/10/31.
 */
public class LeetCode713 {
    public static int numSubarrayProductLessThanK(int[] nums, int k) {
        if (k < 2) {
            return 0;
        }
        int count = 0;
        int pro = 1;
        for(int i=0,right=0;right<nums.length;right++) {
            pro *= nums[right];
            while (i < nums.length && pro >= k) {
                pro  /= nums[i++];
            }
            count += right - i + 1;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        System.out.println(numSubarrayProductLessThanK(nums, 100));
    }
}
