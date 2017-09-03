import sun.awt.image.IntegerInterleavedRaster;

import java.util.Arrays;

/**
 * Created by OovEver on 2017/9/3.
 */
public class LeetCode322 {
    public static int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }
        for(int i=0;i<coins.length;i++) {
            if (coins[i] == amount) {
                return 1;
            }
        }
        int len = coins.length;
//        组成当前count最小的方式
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 0);
        for(int i=0;i<len;i++) {
            if (coins[i] <= amount) {
                dp[coins[i]] = 1;
            }
        }
        for(int i=0;i<len;i++) {
            for(int j=coins[i];j<=amount;j++) {
                if(dp[j]!=0&&dp[j-coins[i]]!=0)
                dp[j] = Math.min(dp[j], dp[j - coins[i]] + 1);
                else if (dp[j - coins[i]] != 0) {
                    dp[j] = dp[j - coins[i]] + 1;
                }

            }
        }
        if (dp[amount] == 0) {
            return -1;
        }
        return dp[amount];

    }

    public static void main(String[] args) {
        int[] conis = {1,2,5};
        System.out.println(coinChange(conis,11));

    }
}
