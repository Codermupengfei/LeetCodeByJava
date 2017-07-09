/**
 * Created by OovEver on 2017/7/9.
 */
public class LeetCode459 {
    public static boolean repeatedSubstringPattern(String s) {
        if (s.length() == 0) {
            return true;
        }
        int length = s.length();
        for(int i=length/2;i>=1;i--) {
            if (length % i == 0) {
                int m = length / i;
                String str = s.substring(0, i);
                StringBuilder stringBuilder = new StringBuilder();
                for(int j=0;j<m;j++) {
                    stringBuilder.append(str);
                }
                if (stringBuilder.toString().equals(s)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abab";
        repeatedSubstringPattern(s);
    }
}
