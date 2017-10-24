import java.util.Arrays;

/**
 * Created by OovEver on 2017/10/19.
 */
public class LeetCode698 {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        if(nums==null||nums.length==0||k==0){
            return false;
        }
        Arrays.sort(nums);
        int sum=0;
        for(int num:nums){
            sum+=num;
        }
        if(sum%k!=0||sum<k){
            return false;
        }
        sum/=k;
        return possible(nums,new int[k],sum,nums.length-1);
    }
    private boolean possible(int []nums,int []p,int sum,int idx){
        if(idx==-1){
            for(int s:p){
                if(s!=sum){
                    return false;
                }
            }
            return true;
        }
        int num=nums[idx];
        for(int i=0;i<p.length;i++){
            if(p[i]+num<=sum){
                p[i]+=num;
                if(possible(nums,p,sum,idx-1)) return true;
                p[i]-=num;
            }
        }
        return false;
    }
}
