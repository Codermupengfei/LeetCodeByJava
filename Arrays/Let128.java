import java.util.HashMap;

/**
 * Created by OovEver on 2017/4/15.
 */
public class Let128 {
    public int longestConsecutive(int[] nums) {
        int res=0;
        HashMap<Integer,Integer>map=new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
               int left=map.containsKey(nums[i]-1)?map.get(nums[i]-1):0;
                int right=map.containsKey(nums[i]+1)?map.get(nums[i]+1):0;
                int sum=left+right+1;
                map.put(nums[i],sum);
                res=Math.max(sum,res);
                map.put(nums[i]-left,sum);
                map.put(nums[i]+right,sum);
            }else continue;;
        }
        return res;
    }
}
