import java.util.Arrays;

/**
 * Created by OovEver on 2017/9/3.
 */
public class LeetCode518 {
    public static int change(int amount, int[] coins) {
        int len = coins.length;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 0);
        dp[0] = 1;
        for(int i=0;i<len;i++) {
            for(int j=coins[i];j<=amount;j++) {
                dp[j] += dp[j - coins[i]];
            }
        }
        return dp[amount];
    }

    public static void main(String[] args) {
        int[] dp = {1, 2, 5};
        System.out.println(change(5,dp));
    }

}
