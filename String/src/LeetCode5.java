/**
 * Created by OovEver on 2017/10/2.
 */
public class LeetCode5 {
    public static String longestPalindrome(String s) {
        int currentLen = 0;
        String res = "";
        for(int i=0;i<s.length();i++) {
            //长度+2
            if (isPalindromic(s, i - currentLen - 1, i)) {
                res = s.substring(i - currentLen - 1, i + 1);
                currentLen += 2;
            } else if (isPalindromic(s, i - currentLen, i)) {
                res = s.substring(i - currentLen, i+1);
                currentLen += 1;
            }
        }
        return res;
    }

    private static boolean isPalindromic(String s, int begin, int end) {
        if (begin < 0) {
            return false;
        }
        while (begin < end) {
            if (s.charAt(begin++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "babad";
        System.out.println(longestPalindrome(test));

    }
}
