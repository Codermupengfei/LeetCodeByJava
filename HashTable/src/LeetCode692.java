import java.util.*;

/**
 * Created by OovEver on 2017/10/13.
 */
public class LeetCode692 {
    public static List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap();
        for(String s : words){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey())
                : a.getValue() - b.getValue());
        for(Map.Entry<String, Integer> m : map.entrySet()){
            if (pq.size() < k) {
                pq.offer(m);
            } else if (pq.peek().getValue() < m.getValue()) {
                pq.poll();
                pq.offer(m);
            } else if (pq.peek().getValue() == m.getValue() && pq.peek().getKey().compareTo(m.getKey())>0) {
                pq.poll();
                pq.offer(m);
            }


        }
        List<String> rs = new ArrayList<>();
        while(!pq.isEmpty()) rs.add(0, pq.poll().getKey());
        return rs;
    }

    public static void main(String[] args) {
        String[] s = {"i", "love", "leetcode", "i", "love", "coding"};
        System.out.println(topKFrequent(s, 2));
    }
}
