import java.util.Arrays;

/**
 * Created by OovEver on 2017/10/9.
 */
public class LeetCode215 {
//    第一种方法
    public int findKthLargest(int[] nums, int k) {
        if(nums.length==0||k==0){
            return 0;
        }
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
