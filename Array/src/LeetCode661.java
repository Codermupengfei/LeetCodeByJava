import com.sun.org.apache.regexp.internal.RE;

/**
 * Created by OovEver on 2017/9/29.
 */
public class LeetCode661 {
    public static int[][] imageSmoother(int[][] M) {
        if(M==null)
            return null;
        int rows = M.length;
        if (rows == 0) {
            return new int[0][];
        }
        int cols = M[0].length;
        int[][] result = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                int sum = 0;
                int count = 0;
                for (int L : new int[]{-1, 0, 1}) {
                    for (int R : new int[]{-1, 0, 1}) {
                        if (isValid(L+i, R+j, rows, cols)) {
                            count++;
                            sum += M[i + L][R + j];
                        }
                    }
                }
                result[i][j] = Math.round(sum / count);
            }
        }

        return result;
    }

    private static boolean isValid(int L, int R, int rows, int cols) {
        if (L >= 0 && L < rows && R >= 0 && R < cols) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        System.out.println(imageSmoother(nums));
    }

}
