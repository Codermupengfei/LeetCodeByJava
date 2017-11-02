import java.util.TreeSet;

/**
 * Created by OovEver on 2017/11/2.
 */
public class LeetCode220 {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        TreeSet<Long> ts = new TreeSet<>();
        for(int i=0;i<nums.length;i++) {
            if(i-k-1>=0) ts.remove((long)nums[i - k - 1]);
//            大于等于nums[i]
            Long temp = ts.ceiling((long)nums[i]);
            if (temp != null && Math.abs(nums[i] - temp) <= t) {
                return true;
            }
//            小于等于nums[i]
            temp = ts.floor((long)nums[i]);
            if (temp != null && Math.abs(temp - nums[i]) <= t) {
                return true;
            }
            ts.add((long) nums[i]);
        }
        return false;
    }
}
