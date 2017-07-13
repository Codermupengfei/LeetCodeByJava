import javax.naming.InsufficientResourcesException;

/**
 * Created by OovEver on 2017/7/13.
 * step1:
 * F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]
 F(k-1) = 0 * Bk-1[0] + 1 * Bk-1[1] + ... + (n-1) * Bk-1[n-1]
 = 0 * Bk[1] + 1 * Bk[2] + ... + (n-2) * Bk[n-1] + (n-1) * Bk[0]
 step 2
 F(k) - F(k-1) = Bk[1] + Bk[2] + ... + Bk[n-1] + (1-n)Bk[0]
 = (Bk[0] + ... + Bk[n-1]) - nBk[0]
 = sum - nBk[0]
 step 3
 F(k) = F(k-1) + sum - nBk[0]
 step4
 k = 0; B[0] = A[0];
 k = 1; B[0] = A[len-1];
 k = 2; B[0] = A[len-2];
 */
public class LeetCode396 {
    public int maxRotateFunction(int[] A) {
        int allSum = 0;
        int F = 0;
        for(int i=0;i<A.length;i++) {
            allSum += A[i];
            F += i * A[i];
        }
        int len = A.length;
        int max = F;
        for(int i=len-1;i>=1;i--) {
            F = F + allSum - len * A[i];
            max = Math.max(F, max);
        }
        return max;
    }
}
