import java.util.Arrays;

/**
 * Created by OovEver on 2017/4/23.
 */
public class Let561 {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length; i += 2) {
            result += nums[i];
        }
        return result;
    }
}
