/**
 * Created by OovEver on 2017/4/8.
 */
public class Let53 {
    public static int maxSubArray(int[] nums) {
        if(nums==null)
            return 0;
        int max1=nums[0];
        int max2=nums[0];
        for(int i=1;i<nums.length;i++){
            if(max1<0){
                max1=nums[i];
            }else {
                max1+=nums[i];
            }
            max2=Math.max(max1,max2);
        }
        return max2;
    }

    public static void main(String[] args) {

    }
}
