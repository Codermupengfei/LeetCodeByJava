/**
 * Created by OovEver on 2017/8/16.
 */
public class LeetCode647 {
    int count = 0;
    public int countSubstrings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        for(int i=0;i<s.length();i++) {
//          奇数以i为中心 偶数以i和i+1为中心
            extendPalindrome(s, i, i);
            extendPalindrome(s, i, i + 1);
        }
        return count;
    }

    private void extendPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(right) == s.charAt(left)) {
            left--;
            right++;
            count++;
        }
    }
}
