/**
 * Created by OovEver on 2017/7/12.
 * 思路
 * 由于ops给出的是ii-jj之间的数加1
 * 所以找出ops的最小范围并返回他们的乘积即可
 */
public class LeetCode598 {
    public int maxCount(int m, int n, int[][] ops) {
        if (ops == null||ops.length==0) {
            return m * n;
        }
        int colMin = Integer.MAX_VALUE;
        int rowMin = Integer.MAX_VALUE;
        for(int i=0;i<ops.length;i++) {
            colMin = Math.min(ops[i][0], colMin);
            rowMin = Math.min(ops[i][1], rowMin);
        }
        return colMin * rowMin;
    }
}
