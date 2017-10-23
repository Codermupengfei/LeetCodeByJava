/**
 * Created by OovEver on 2017/4/19.
 */
public class Let45 {
    public static int jump(int[] nums) {
        if(nums.length==0)
            return 0;
        int index=0;
        int n=nums.length;
        int cur=0;
        int last=0;
        for(int i=0;i<=cur&&i<n;i++){
            if(i>last){
                index++;
                last=cur;
            }
            cur=Math.max(cur,nums[i]+i);
        }
        return cur>=n-1?index:0;
    }

    public static void main(String[] args) {
        int[] nums={5,9,3,2,1,0,2,3,3,1,0,0};
        jump(nums);
    }
}
