/**
 * Created by OovEver on 2017/7/9.
 */
public class LeetCode14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String pre = strs[0];
        int i = 0;
        while (i < strs.length) {
//            前缀字符不是第一个字符
            while (strs[i].indexOf(pre)!=0) {
                pre = pre.substring(0, pre.length() - 1);
            }
            i++;
        }
        return pre;
    }
}
