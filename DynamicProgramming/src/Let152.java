/**
 * Created by OovEver on 2017/4/16.
 */
public class Let152 {
    public static int maxProduct(int[] nums) {
        int maxNum=0;
        if(nums.length==0)
            return 0;
        else if(nums.length==1)
            return nums[0];
        int global=nums[0];
        int min=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
           int a=min*nums[i];
            int b=max*nums[i];
            min=Math.min(nums[i],Math.min(a,b));
            max=Math.max(nums[i],Math.max(a,b));
            global=Math.max(global,max);
        }
        return global;


    }

    public static void main(String[] args) {
        int[]nums={2,3,1,-1,5,6};
        maxProduct(nums);
    }
}
