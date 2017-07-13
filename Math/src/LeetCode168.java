import sun.plugin.WJcovUtil;

/**
 * Created by OovEver on 2017/7/12.
 */
public class LeetCode168 {
    public String convertToTitle(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        while (n != 0) {
            n--;
            stringBuilder.insert(0,(char) ('A' + n % 26));
            n /= 26;

        }
        return stringBuilder.toString();
    }
}
