/**
 * Created by OovEver on 2017/6/11.
 */
public class LeetCode28 {
    /**
     * 思路：
     * 1.计算两个字符的长度
     * 2.用过子串儿判断字符出现的位置
     * */
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (needle.length() == 0) {
            return 0;
        }
        for(int i=0;i<=haystack.length()-needle.length();i++) {
            if(haystack.substring(i,i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }
}
