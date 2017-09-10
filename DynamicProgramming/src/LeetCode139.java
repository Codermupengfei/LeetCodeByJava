import java.util.List;

/**
 * Created by OovEver on 2017/9/7.
 */
public class LeetCode139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp = new boolean[s.length() + 1];
//        dp[i]第I个是否可切割
        dp[0] = true;
        for(int i=1;i<=s.length();i++) {
            for(int j=0;j<i;j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {

    }
}
