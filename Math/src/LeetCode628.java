import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by OovEver on 2017/7/12.
 */
public class LeetCode628 {
    public int maximumProduct(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        int a= nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        int b = nums[0] * nums[1] * nums[nums.length - 1];
        return a > b ? a : b;
    }
}
