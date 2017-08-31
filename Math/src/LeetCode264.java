import java.util.Arrays;
import java.util.function.IntToDoubleFunction;

/**
 * Created by OovEver on 2017/8/31.
 */
public class LeetCode264 {
//   static   int maxDivided(int a, int b) {
//        while (a % b == 0) {
//            a /= b;
//        }
//        return a;
//    }
//
//   static boolean isUgly(int n) {
//        n = maxDivided(n,2);
//        n = maxDivided(n,3);
//        n = maxDivided(n, 5);
//        return n == 1 ? true : false;
//    }
//   static public int nthUglyNumber(int n) {
//        int i = 1;
//        int count = 1;
//        while (n > count) {
//            i++;
//            if (isUgly(i)) {
//                count++;
//            }
//
//        }
//        return i;
//    }
//    public static int nthUglyNumber(int n) {
//        if (n <= 0) {
//            return 0;
//        }
//        int[] prims = {2, 3, 5};
//        int[] idx = new int[n + 1];
//        int[] ugly = new int[n + 1];
//        ugly[0] = 1;
//        for(int i=1;i<n;i++) {
//            ugly[i] = Integer.MAX_VALUE;
//            for(int j=0;j<prims.length;j++) {
//                ugly[i] = Math.min(ugly[i], prims[j]*ugly[idx[j]]);
//            }
//            for(int j=0;j<prims.length;j++) {
//                while (prims[j] * ugly[idx[j]] <= ugly[i]) {
//                    idx[j]++;
//                }
//            }
//        }
//        return ugly[n - 1];
//
//    }
    public static int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0;
        }
        int[] prims = {2, 3, 5};
        int[] idx = new int[4];
        int[] ugly = new int[n + 1];
        int[] val = new int[4];
        Arrays.fill(val, 1);
        int next = 1;
        for(int i=0;i<n;i++) {

            ugly[i] = next;
            next = Integer.MAX_VALUE;
            for(int j=0;j<prims.length;j++) {
                if (val[j] == ugly[i]) {
                    val[j] = ugly[idx[j]++] * prims[j];
                }
                next = Math.min(next, val[j]);
            }
        }
        return ugly[n - 1];
    }
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(2));
    }
}
