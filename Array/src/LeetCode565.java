import java.util.Arrays;

/**
 * Created by OovEver on 2017/7/16.
 */
public class LeetCode565 {
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int res = 0;
        for(int i=0;i<nums.length-1;i++) {
            for(int j=i+1,k=i+2;k<nums.length;k++) {
                while (j<k&&nums[i] + nums[j] <= nums[k]) {
                    j++;
                }
                res += k - j;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {200, 201, 301, 400};
        System.out.println(triangleNumber(nums));

    }
}
