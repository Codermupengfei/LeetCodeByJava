/**
 * Created by OovEver on 2017/4/12.
 */
public class Let55 {
    public boolean canJump(int[] nums) {
        boolean flag=false;
        if(nums.length==1)
            return true;
        int max=0;
        for(int i=0;i<nums.length;i++){
        if(i>max)
            return false;
            max=Math.max(nums[i]+i,max);
            if(max==nums.length-1)
                return true;
        }
        return true;
    }
}
