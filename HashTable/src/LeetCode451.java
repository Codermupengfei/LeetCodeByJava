import com.sun.javafx.collections.MappingChange;

import java.util.*;

/**
 * Created by OovEver on 2017/7/11.
 */
public class LeetCode451 {
    public String frequencySort(String s) {
        /*
        * 桶排序解法
        *     Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        List<Character> [] bucket = new List[s.length() + 1];
        for (char key : map.keySet()) {
            int frequency = map.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }
        StringBuilder sb = new StringBuilder();
        for (int pos = bucket.length - 1; pos >=0; pos--) {
            if (bucket[pos] != null) {
                for (char num : bucket[pos]) {
                    for (int i = 0; i < pos; i++) {
                        sb.append(num);
                    }
                }
            }
        }
        return sb.toString();
        * */
        if (s == null) {
            return s;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> priorityQueue = new PriorityQueue<>(new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        priorityQueue.addAll(map.entrySet());
//        stringBuilder效率比string在频繁插入时效率高
//        String在频繁插入时会频繁新建对象时间较长
        StringBuilder res = new StringBuilder();
        while (!priorityQueue.isEmpty()) {
            Map.Entry e  = priorityQueue.poll();
            for(int i=0;i<(int)e.getValue();i++) {
                res.append(e.getKey());
            }
        }

        return res.toString();
    }
}
