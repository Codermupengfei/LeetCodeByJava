/**
 * Created by OovEver on 2017/6/25.
 * 二分思路
 * 将二维矩阵看成一个数组
 * 进行二分查找
 * 时间复杂度为o(logN)
 */
public class LeetCode240 {
    public static boolean searchMatrix(int[][] matrix, int target) {

        if (matrix.length == 0 || matrix[0].length == 0||matrix==null) {
            return false;
        }
        boolean flag = false;
        int col = matrix[0].length - 1;
        int row = 0;
        while (col >= 0 && row < matrix.length) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] < target) {
                row++;
            } else if (matrix[row][col] > target) {
                col--;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        int[][] matrix={{1,4},{2,5}};
        System.out.println(searchMatrix(matrix,2));

    }
}
