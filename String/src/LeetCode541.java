import java.util.jar.JarEntry;

/**
 * Created by OovEver on 2017/7/9.
 */
public class LeetCode541 {
    public static String reverseStr(String s, int k) {
        if (s.length() < 1) {
            return s;
        }
        String result = "";
        int len = s.length();
        int i = 0;
        while (i<s.length()) {
            if (len > 2 * k) {
                for(int j=i+k-1;j>=i;j--) {
                    result =result+s.charAt(j);
                }
                i = i + k;
                for(int j=i;j<i+k;j++) {
                    result = result + s.charAt(j);
                }
                i += k;
                len = len - 2 * k;
            } else if (len > k) {
                for (int j = i + k - 1; j >= i; j--) {
                    result = result + s.charAt(j);
                }
                i = i + k;
                for (int j = i; j < s.length(); j++) {
                    result = result + s.charAt(j);
                }
                len = 0;
                i = s.length();
            } else {
                for (int j = s.length()- 1; j >= i; j--) {
                    result = result + s.charAt(j);
                }
                len = 0;
                i = s.length();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s,8));
    }
}
