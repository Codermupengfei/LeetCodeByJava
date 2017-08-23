import java.util.StringTokenizer;

/**
 * Created by OovEver on 2017/8/23.
 * 使用二重背包问题的解决方法。对于每一个字符串，统计0和1的个数，作为其占去的体积。对于其价值来说，全部都是1，因为是统计能组成字符串的个数。其状态转移方程为：
 * 　同样地，这道题需要通过动态规划来解决，因为不能贪心地去换尽量短的字符,当两个字符长度相同的时候，用贪心算法无法决定选哪一个。
 　　因此，这道题需要通过动态规划来解决。题目中给定m个0与n个1，dp[m][n]就标记了在当前的字符串序列下，能够用m个0与n个1取得的最多字符串。
 　　显然，dp[0][0] = 0,因为没有0与1可用的时候，必然得不到字符串
 　　　　dp[m][n] = max{dp[m][n],dp[m-m0][n-n0]+1}
 　　针对每一个字符串，实质上我们都采取两种策略，选这个字符串，还是不选。做决定之前，先统计这个字符串(第i个)有多少个0与1，分别记为m0与n0，如果不选这个字符串，那么dp[m][n]的值不会发生任何改变，但是选了之后，它的值就是用了m-m0个0 与n-n0个1，所得到的最多的字符串，也就是f[m-m0][n-n0]再加上1，有点类似于经典0-1背包问题
 */
public class LeetCode474 {
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String s : strs) {
            int num0 = 0;
            int num1 = 0;
            for(int i=0;i<s.length();i++) {
                if(s.charAt(i)=='0') num0++;
                if(s.charAt(i)=='1') num1++;
            }
            for(int i=m;i>=num0;i--) {
                for(int j=n;j>=num1;j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - num0][j - num1] + 1);
                }
            }
        }
        return dp[m][n];
    }
}
