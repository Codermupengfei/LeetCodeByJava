/**
 * Created by OovEver on 2017/4/24.
 */
public class Let136 {
    public int singleNumber(int[] nums) {
        int result=0;
        for(int i=0;i!=nums.length;i++){
            result^=nums[i];
        }
        return result;
    }
}
