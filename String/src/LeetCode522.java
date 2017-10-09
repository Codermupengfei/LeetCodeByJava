import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by OovEver on 2017/10/1.
 */
public class LeetCode522 {
    public static int findLUSlength(String[] strs) {
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length() - o1.length();
            }
        });
        Set<String> duplic = findDuplicStr(strs);
        for(int i=0;i<strs.length;i++) {
            if (!duplic.contains(strs[i])) {
                if (i == 0) {
                    return strs[0].length();
                }
                for(int j=0;j<i;j++) {
                    if (isSubSequence(strs[i], strs[j])) {
                        break;
                    }
                    if (j == i - 1) {
                        return strs[i].length();
                    }
                }
            }
        }
        return -1;
    }

   static boolean isSubSequence(String child, String parents) {
        int i=0;
        int j = 0;
        while (i < child.length() && j < parents.length()) {
            if (child.charAt(i) == parents.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == child.length();
    }
    public static Set<String> findDuplicStr(String[] strs) {
        Set<String> set = new HashSet<>();
        Set<String> duplic = new HashSet<>();
        for (String str : strs) {
            if (set.contains(str)) {
                duplic.add(str);
            }
            set.add(str);
        }
        return duplic;
    }

    public static void main(String[] args) {
        String[] str = {"aaa", "aaa", "aa"};
        System.out.println(findLUSlength(str));


    }
}
