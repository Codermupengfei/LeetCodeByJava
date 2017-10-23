/**
 * Created by OovEver on 2017/4/14.
 */
public class Let81 {
    public boolean search(int[] nums, int target) {
        boolean flag=false;
        if(nums.length==0)
            return false;
        if(nums.length==1)
            return nums[0]==target;
        int i=0;
        int j=nums.length-1;
        while (i<j){
            if(nums[i]>target&&nums[j]<target)
                return false;
            if(nums[i]==target)
                return true;
            if(nums[j]==target)
                return true;
            while(i<j&&nums[j]>target)
                j--;
            if(nums[j]==target)
                return true;
            while (i<j&&nums[i]<target)
                i++;
            if(nums[i]==target)
                return true;
        }
        return flag;
    }
}
