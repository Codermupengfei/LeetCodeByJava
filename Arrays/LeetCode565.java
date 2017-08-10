import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by admin on 2017/8/10.
 * 第一次错时间超限
 * 看了下答案，想法是一样的
 * 只不过自己用了hashset
 * 这样效率会低一些
 * 如果自己判断的话速度会快一些 就不会出现这样的问题了
 * 经过验证hashmap的速度也比较慢
 */
public class LeetCode565 {
    public int arrayNesting(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            Map<Integer, Integer> map = new HashMap<>();
            int len = 0;
//            此题要想不时间超限，得找到该有的规律，比如一次可以访问所有的元素，不管以谁为开始 都是这样访问，所以要找的就是可以按这种排列的不重复的组合，最后求其长度
            for(int j=i;nums[j]>=0;len++) {
                int temp = nums[j];
                nums[j] = -1;
                j = temp;
            }
            max = Math.max(len, max);
        }
        return max;
    }
}
