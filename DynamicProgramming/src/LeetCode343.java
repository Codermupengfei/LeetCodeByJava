/**
 * Created by OovEver on 2017/7/17.
 * n = 2 max = 1(1 + 1)

 n = 3 max = 2(1 + 2)

 n = 4 max = 4(2 + 2)

 n = 5 max = 6(2 + 3)

 n = 6 max = 9(3 + 3)

 n = 7 max = 12(3 + 2 + 2)

 n = 8 max = 16(2 + 2 + 2 + 2)

 n = 9 max = 27(3 + 3 + 3)

 n = 10 max = 36(2 + 2 + 3 + 3)

 大致也发现了一点规律，我们都分解为1 2 3这样的组合。

 很简单，如果组合为4，4又可以分解为2 + 2，如果组合为5，5又可以分解为2 + 3。

 以此类推~
 */
public class LeetCode343 {
    public static int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i=4;i<=n;i++) {
            dp[i] = Math.max(2 * dp[i - 2],3 * dp[i - 3]);
        }
        return dp[n];
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }
}
