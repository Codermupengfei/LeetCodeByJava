import java.util.Arrays;

/**
 * Created by OovEver on 2017/4/11.
 */
public class Let16 {
    public static int threeSumClosest(int[] nums, int target) {
            int result=0;
            if(nums.length<1)
                return result;
        result=nums[0]+nums[1]+nums[2];
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length-2;i++)
        {
            int j=i+1;
            int k=nums.length-1;
            while (j<k){
                sum=nums[i]+nums[j]+nums[k];
                if(sum==target)
                    return sum;
                if(sum<target){
                   j++;
                }else {
                    k--;
                }
                if(Math.abs(sum-target)<Math.abs(result-target)){
                    result=sum;
                }
            }

        }
           return result;
    }

    public static void main(String[] args) {
        int[] nums={-3,-2,-5,3,-4};
        int target=-1;
        System.out.println(threeSumClosest(nums,target));
    }
}
