import java.util.Arrays;

/**
 * Created by OovEver on 2017/4/8.
 */
public class Let217Contains {
    public boolean containsDuplicate(int[] nums) {
        boolean flag=false;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                return true;
            }
        }
        return flag;
    }
}
