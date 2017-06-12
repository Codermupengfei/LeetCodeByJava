/**
 * Created by OovEver on 2017/6/12.
 */
public class LeetCode567 {
    /**
     * 思路
     * 以一种滑动窗口的方法
     * 以一个26大小的count数组来记录
     * 首先对s1中的字符-'a'转化为数字数组
     * 接着对s2做处理
     * */
    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) {
            return false;
        }
        int[] count=new int[26];
        int len1=s1.length();
        int len2 = s2.length();
        for(int i=0;i<len1;i++) {
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        if (allzero(count)) {
            return true;
        }
        for(int i=len1;i<len2;i++) {
            count[s2.charAt(i)-'a']--;
            count[s2.charAt(i-len1)-'a']++;
            if (allzero(count)) {
                return true;
            }
        }
        return false;

    }

    boolean allzero(int[] count) {
        for(int i=0;i<26;i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
