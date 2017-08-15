/**
 * Created by OovEver on 2017/7/15.
 */
public class LeetCode303 {
    class NumArray {
        int []nums;
        public NumArray(int[] nums) {
            for(int i=1;i<nums.length;i++) {
                nums[i] = nums[i] + nums[i - 1];
            }
            this.nums = nums;
        }

        public int sumRange(int i, int j) {
            if (i == 0) {
                return nums[j];
            }else
                return nums[j] - nums[i - 1];
        }
    }


}
