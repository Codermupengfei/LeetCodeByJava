/**
 * Created by OovEver on 2017/4/14.
 */
public class Let33 {
    public static int search(int[] nums, int target) {
       if(nums.length==0)
           return -1;
        int i=0;
        int j=nums.length-1;
        if(nums[i]==target)
            return i;
        if(nums[j]==target)
            return j;
        while (i<=j){
            int middle=(i+j)/2;
            if(nums[middle]==target)
                return middle;
            if(nums[i]<=nums[middle]){
                if(target<nums[middle]&&target>=nums[i])
                    j=middle-1;
                else
                    i=middle+1;
            }
            if(nums[middle]<=nums[j]){
                if(target>nums[middle]&&target<=nums[j])
                    i=middle+1;
                else
                    j=middle-1;
            }

            }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        search(nums,0);
    }
}
