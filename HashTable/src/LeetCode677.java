import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/10/17.
 */
public class LeetCode677 {
    class MapSum {

        Map<String,Integer> map;
        Map<String,Integer> original;
        /** Initialize your data structure here. */
        public MapSum() {
            map=new HashMap<>();
            original=new HashMap<>();
        }

        public void insert(String key, int val) {
            val-=original.getOrDefault(key,0);
            String s="";
            for(char c:key.toCharArray()){
                s+=c;
                map.put(s,map.getOrDefault(s,0)+val);
            }
            original.put(key,original.getOrDefault(key,0)+val);
        }

        public int sum(String prefix) {
            return map.getOrDefault(prefix,0);
        }
    }
}
