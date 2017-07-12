import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/7/11.
 * 思路
 * 遍历数组两次
 * 求出任意两点的距离
 * 将距离存入到Hashmap中
 * 根据value*value-1返回所有组合数
 *
 */
public class LeetCode447 {
    public int numberOfBoomerangs(int[][] points) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0;i<points.length;i++) {
            for(int j=0;j<points.length;j++) {
                if (i == j) {
                    continue;
                }
                int d = getDistance(points[i], points[j]);
                map.put(d, map.getOrDefault(d, 0) + 1);
            }
            for (int value : map.values()) {
                res += value * (value - 1);//此行返回所有组合数 n!/(n-2)! = n * (n-1).
            }
            map.clear();

        }
        return res;
    }

    private int getDistance(int[] a, int[] b) {
        return (a[0] - b[0]) * (a[0] - b[0]) + (a[1] - b[1]) * (a[1] - b[1]);
    }
}
