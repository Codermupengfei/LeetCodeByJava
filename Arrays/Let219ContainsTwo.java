import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/4/8.
 */
public class Let219ContainsTwo {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean flag=false;
        if(nums.length<2)
            return false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int j=map.get(nums[i]);
                if((i-j)<=k)
                    return true;
                else map.put(nums[i],i);
            }else {
                map.put(nums[i],i);
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[] nums={1,0,1,1};
        System.out.println(containsNearbyDuplicate(nums,1));


    }
}
