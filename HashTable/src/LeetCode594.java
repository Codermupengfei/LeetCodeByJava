import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/7/11.
 * 思路：
 * 存储每个数字出现的次数
 * 对于任意一个数 判断是否有相邻的数
 * 如果有 则判断该数加上相邻的数是否大于当前的结果
 * 如果大于则更新result
 */
public class LeetCode594 {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num, 0) + 1);
        }
        int result = 0;
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1)) {
                result = Math.max(result, map.get(key)+map.get(key+1));
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
