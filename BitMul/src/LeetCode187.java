import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by OovEver on 2017/7/7.
 */
public class LeetCode187 {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> result = new ArrayList<>();
        if (s == null||s.length()<10) {
            return result;
        }
        Set seen = new HashSet<>();
        Set repeated = new HashSet<>();
        for(int i=0;i<s.length()-9;i++) {
            String temp = s.substring(i, i + 10);
            if (!seen.add(temp)) {
                repeated.add(temp);
            }
        }
        result = new ArrayList<>(repeated);
        return result;
    }
}
