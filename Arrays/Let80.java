/**
 * Created by OovEver on 2017/4/12.
 */
public class Let80 {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int n:nums){
            if(i<2||n>nums[i-2]){
                nums[i++]=n;
            }
        }
        return i;
    }
}
