import java.util.HashSet;
import java.util.Set;

/**
 * Created by OovEver on 2017/6/12.
 */
public class LeetCode3 {
    /**
     *思路
     * 用set集合处理
     * */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0 || s == null) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        int max = Integer.MIN_VALUE;
        int i=0;
        int j=0;
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}
