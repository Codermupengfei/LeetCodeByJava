import java.util.Arrays;
import java.util.Collections;

/**
 * Created by OovEver on 2017/10/31.
 */
public class LeetCode473 {
    public boolean makesquare(int[] nums) {
        if(nums==null||nums.length<4) return false;
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%4!=0){
            return false;
        }
        Arrays.sort(nums);
        reverse(nums);
        int target=sum/4;
        return dfs(nums,new int[4],0,target);
    }
    private boolean dfs(int[] nums,int []sum,int index,int target){
        if(index==nums.length){
            if(sum[0]==target&&sum[1]==target&&sum[2]==target){
                return true;
            }
            return false;
        }
        for(int i=0;i<4;i++){
            if(sum[i]+nums[index]>target)
                continue;
            sum[i]+=nums[index];
            if (dfs(nums, sum, index + 1, target)) return true;
            sum[i]-=nums[index];
        }
        return false;
    }
    private void reverse(int[] nums) {
        int i = 0, j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++; j--;
        }
    }
}
