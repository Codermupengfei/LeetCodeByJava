import java.util.logging.XMLFormatter;

/**
 * Created by OovEver on 2017/7/9.
 */
public class LeetCode38 {
    public static String countAndSay(int n) {
        String s = "1";
        for(int i=1;i<n;i++) {
            s = countIdx(s);
        }
        return s;
    }

    public static String countIdx(String s){
        char c = s.charAt(0);
        int count = 1;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=1;i<s.length();i++) {
            if (s.charAt(i) == c) {
                count++;
            } else {
                stringBuilder.append(count);
                stringBuilder.append(c);
                c = s.charAt(i);
                count=1;
            }

        }
        stringBuilder.append(count);
        stringBuilder.append(c);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        countAndSay(5);
    }
}
