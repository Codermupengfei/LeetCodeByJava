import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/7/11.
 * 这里有一个把0转换成-1来进行计算的过程，然后存储一个hashmap用来存放sum，如果接下来的sum在hashmap里面出现过，则说明hashmap里面出现的那个值的索引的开始（不包括索引），到目前的索引的和为0，代码如下：
 */
public class LeetCode525 {
    public static int findMaxLength(int[] nums) {
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int sum = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                max = Math.max(max, i - map.get(sum));
            } else {
                /*
                 必须加else
                 否则如遇到1010的情况到第1个1的时候会更新Map
                 导致到最后一个0时是与第一个0想减
            */
                map.put(sum, i);
            }


        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1};
        System.out.println(findMaxLength(nums));

    }
}
