/**
 * Created by OovEver on 2017/7/9.
 */
public class LeetCode521 {
    public static int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }

    public static void main(String[] args) {
        String a = "aba";
        String b = "ab";
        System.out.println(findLUSlength(a,b));
    }
}
