/**
 * Created by OovEver on 2017/4/15.
 */
public class Let162II {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while (low<high){
            int middle=(low+high)/2;
            if(nums[middle]>nums[middle+1])
                high=middle;
            else
                low=middle+1;
        }
        return low;
    }
}
