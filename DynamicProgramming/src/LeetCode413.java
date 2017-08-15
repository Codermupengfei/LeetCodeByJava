/**
 * Created by OovEver on 2017/7/15.
 *  dp[i]=dp[i-1]+1;
 */
public class LeetCode413 {
    public static int numberOfArithmeticSlices(int[] A) {
        int cur = 0;
        int sum = 0;
        for(int i=2;i<A.length;i++) {
            if (A[i] - A[i - 1] == A[i - 1] - A[i - 2]) {
                cur++;
                sum += cur;
            } else {
                cur = 0;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 9};
        System.out.println(numberOfArithmeticSlices(nums));

    }
}
