import java.util.Arrays;

/**
 * Created by OovEver on 2017/4/9.
 */
public class Let287 {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int findInt=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        if(nums.length>1){
            if(nums[nums.length-1]==nums[nums.length-2])
                return nums[nums.length-1];
        }
        return findInt;
    }
}
