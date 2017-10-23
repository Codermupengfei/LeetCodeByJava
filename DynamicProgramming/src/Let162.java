/**
 * Created by OovEver on 2017/4/15.
 */
public class Let162 {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        if(nums.length==1)
            return 0;
        if(nums[0]>nums[1])
            return 0;
        if(nums[n-1]>nums[n-2])
            return n-1;
        for(int i=1;i<nums.length-1;i++)
            if(nums[i]>nums[i-1]&&nums[i+1]<nums[i])
                return i;
        return 0;

    }
}
