import sun.misc.FpUtils;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by OovEver on 2017/8/14.
 * dp代表以当前i结尾的最大的长度
 * 状态转移方程
 * max(dp[i], pairs[j][1] < pairs[i][0] ? dp[j]+1 : dp[j])
 */
public class LeetCode646 {
    public int findLongestChain(int[][] pairs) {
        if (pairs.length == 0 || pairs == null) {
            return 0;
        }
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int[] dp = new int[pairs.length];
        Arrays.fill(dp, 1);
        for(int i=1;i<pairs.length;i++) {
            for(int j=0;j<i;j++) {
                dp[i] = Math.max(dp[i], pairs[j][1] < pairs[i][0] ? dp[j]+1 : dp[j]);
            }
        }
        return dp[pairs.length-1];
    }
}
