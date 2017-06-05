/**
 * Created by OovEver on 2017/4/9.
 */
public class Let287II {
    public int findDuplicate(int[] nums) {
            int[] nums2=new int[nums.length+1];
            for(int i=0;i<nums.length;i++){
                nums2[nums[i]]++;
                if(nums2[nums[i]]>1)
                    return nums[i];
            }
        return 0;
    }

}
