import java.util.ArrayList;

/**
 * Created by OovEver on 2017/7/15.
 * 这是一个动态规划的题目：
 n = 1 时 ways = 1；
 n = 2 时 ways = 2；
 n = 3 时 ways = 3；
 …
 n = k 时 ways = ways[k-1] + ways[k-2]；

 明显的，这是著名的斐波那契数列问题。有递归和非递归两种方式求解，但是亲测递归方式会出现 The Time Limit异常，所以只能采用非递归计算，可以用一个动态数组保存结果。
 */
public class LeetCode70 {
    public int climbStairs(int n) {
        if (n <= 0 || n == 1 || n == 2) {
            return n;
        }
        int[] member = new int[n + 1];
        member[1] = 1;
        member[2] = 2;
        for(int i=3;i<=n;i++) {
            member[i] = member[i - 1] + member[i - 2];
        }
        return member[n];
    }
}
