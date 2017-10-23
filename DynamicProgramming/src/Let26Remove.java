/**
 * Created by OovEver on 2017/4/4.
 */
public class Let26Remove {
    public int removeDuplicates(int[] nums) {
        int length=0;
        int flag=0;
        int i;
        if(nums.length>=2) {

            for (i = 0; i < nums.length - 1; i++) {
                if (nums[i] == nums[i + 1]) {

                    continue;
                }
                nums[length] = nums[i];
                length++;

            }
                nums[length++] = nums[i];
        }else {
            if(nums.length==0)
                return 0;
            else
                return 1;
        }
        return length;
    }


}
