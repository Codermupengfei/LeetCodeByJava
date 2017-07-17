/**
 * Created by OovEver on 2017/7/16.
 * 主要考察矩阵行列转换
 * 位置/列 为行数
 * 位置/行 为列数
 */
public class LeetCode566 {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int m = nums.length;
        int n = nums[0].length;
        if (r * c != m * n) {
            return nums;
        }
        int[][] res = new int[r][c];
        for(int i=0;i<r*c;i++) {
            res[i / c][i % c] = nums[i / n][i % n];
        }
        return res;
    }
}
