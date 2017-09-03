import com.sun.deploy.security.MSCryptoDSASignature;
import com.sun.prism.shader.DrawPgram_ImagePattern_Loader;

/**
 * Created by OovEver on 2017/9/3.
 */
public class LeetCode72 {
//    public int minDistance(String word1, String word2 ) {
//        return dfsSolve(word1, word2, word1.length(), word2.length());
//    }
//
//    private int dfsSolve(String word1, String word2, int len1, int len2) {
//        if (len1 == 0) {
//            return len2;
//        }
//        if (len2 == 0) {
//            return len1;
//        }
//        if (word1.charAt(len1 - 1) == word2.charAt(len2 - 1)) {
//            return dfsSolve(word1, word2, len1 - 1, len2 - 1);
//        }
//        return 1 + Math.min(dfsSolve(word1, word2, len1 - 1, len2), Math.min(dfsSolve(word1, word2, len1 - 1, len2 - 1), dfsSolve(word1, word2, len1, len2 - 1)));
//    }
    public static int minDistance(String word1, String word2 ) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] dp = new int[len1 + 1][len2 + 1];
        for(int i=0;i<=len1;i++) {
            for(int j=0;j<=len2;j++) {
                if (i == 0) {
                    dp[i][j] = j;
                }
                else  if (j == 0) {
                    dp[i][j] = i;
                }
                else if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = 1+Math.min(dp[i][j - 1], Math.min(dp[i - 1][j - 1], dp[i - 1][j]));
                }
            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        String word1 = "";
        String word2 = "";
        System.out.println(minDistance(word1, word2));
    }

}
