import java.util.Map;
import java.util.TreeMap;

/**
 * Created by OovEver on 2017/6/25.
 * 用treemap特性
 * 将间隔起点与位置存入treemap
 * 运用treemao特性ceilingEntry获取大于等于当前end的值存入result
 */

 class Interval {
     int start;
     int end;
     Interval() { start = 0; end = 0; }
     Interval(int s, int e) { start = s; end = e; }
  }

public class LeetCode436 {
    public int[] findRightInterval(Interval[] intervals) {
        int len = intervals.length;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        int[] result = new int[len];
        for(int i=0;i<len;i++) {
            treeMap.put(intervals[i].start, i);
        }
        for(int i=0;i<len;i++) {
            Map.Entry<Integer, Integer> entry = treeMap.ceilingEntry(intervals[i].end);
            result[i] = entry == null ? -1 : entry.getValue();
        }
        return result;
    }
}
