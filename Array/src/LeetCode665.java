/**
 * Created by OovEver on 2017/9/28.
 */
public class LeetCode665 {
    public static boolean checkPossibility(int[] nums) {
        if (nums.length == 0) {
            return true;
        }
        int changeNum = 0;

        for(int i=1;i<nums.length&&changeNum<=1;i++) {
            if (nums[i] < nums[i - 1]) {
                changeNum++;
                if (i - 2 < 0 || nums[i - 2] <= nums[i]) {
                    nums[i - 1] = nums[i];
                } else {
                    nums[i] = nums[i - 1];
                }
            }
        }
        return changeNum <= 1;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 3};
        System.out.println(checkPossibility(nums));
    }
}
