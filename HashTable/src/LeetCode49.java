import java.util.*;

/**
 * Created by OovEver on 2017/7/11.
 * 思路
 * 遍历str
 * 对str的内容排序
 * 并放到map中
 * 如果新的string不在map中则重新建立map
 *
 */
public class LeetCode49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] sToChar = s.toCharArray();
            Arrays.sort(sToChar);
            String charToS = String.valueOf(sToChar);
            if (!map.containsKey(charToS)) {
                map.put(charToS, new ArrayList<>());
            }
            map.get(charToS).add(s);
        }
        return new ArrayList<List<String>>(map.values());

    }
}
