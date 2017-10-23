/**
 * Created by OovEver on 2017/4/15.
 */
public class Let34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res={-1,-1};
        int flag=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target&&flag==1){
                res[0]=i;
                flag=0;
                while (i<nums.length&&nums[i]==target)i++;
                res[1]=i-1;
            }

        }
        if(res[1]==-1)
            res[0]=-1;
        return res;
    }
}
