import java.util.Arrays;

/**
 * Created by OovEver on 2017/4/4.
 */
public class Let268MissNumber {
    public int missingNumber(int[] nums) {
        int i=0;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++){
            if(i!=nums[i]){
                return i;
            }
        }
        return i;

    }
}
