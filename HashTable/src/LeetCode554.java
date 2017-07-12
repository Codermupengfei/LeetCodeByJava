import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by OovEver on 2017/7/11.
 * 可以从图片中看出，如果能够同时go through说明每一层左边的和是相等的，图中go through的位置和为4，第2、3、5、6层的均满足，

 而brick总共6层，于是最少穿过的brick为2层。

 于是想到出现同一个和的个数越多，即满足穿过的brick越少。

 用一个map来统计即可。
 */
public class LeetCode554 {
    public int leastBricks(List<List<Integer>> wall) {
        if (wall.size() == 0) {
            return 0;
        }
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (List<Integer> list : wall) {
            int length = 0;
            for(int i=0;i<list.size()-1;i++) {
                length += list.get(i);
                map.put(length, map.getOrDefault(length, 0) + 1);
                count = Math.max(count, map.get(length));
            }
        }
        return wall.size() - count;
    }
}
