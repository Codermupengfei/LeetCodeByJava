/**
 * Created by OovEver on 2017/4/19.
 */
public class Let41 {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            while (nums[i]>0&&nums[i]<n&&nums[i]!=i+1){
                int t=nums[i];
                if(nums[t-1]==t) break;
                nums[i]=nums[t-1];
                nums[t-1]=t;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i+1)
                return i+1;
        }
        return n+1;
    }
}
