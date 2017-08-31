import com.sun.deploy.panel.ITreeNode;

import java.util.Arrays;

/**
 * Created by OovEver on 2017/7/13.
 */
public class LeetCode313 {
//  static   int maxDivide(int a, int b) {
//        while (a % b == 0) {
//            a /= b;
//        }
//        return a;
//    }
//  static   boolean isUgly(int num,int []primes) {
//        int len = primes.length;
//        for(int i=0;i<primes.length;i++) {
//            num = maxDivide(num, primes[i]);
//        }
//        return num == 1 ? true : false;
//    }
//    public static int nthSuperUglyNumber(int n, int[] primes) {
//        int count = 1;
//        int i = 1;
//        while (count < n) {
//            i++;
//            if (isUgly(i,primes)) {
//                count++;
//            }
//        }
//        return i;
//    }
    public static int nthSuperUglyNumber(int n, int[] primes) {
        if (n <= 0) {
            return 0;
        }
        if (primes.length <= 0) {
            return 0;
        }
        int[] ugly = new int[n];
        int[] idx = new int[primes.length];
        ugly[0] = 1;
        for(int i=1;i<n;i++) {
            ugly[i] = Integer.MAX_VALUE;
            for(int j=0;j<primes.length;j++) {
                ugly[i] = Math.min(ugly[i], primes[j] * ugly[idx[j]]);
            }
            for(int j=0;j<primes.length;j++) {
                while (primes[j] * ugly[idx[j]] <= ugly[i]) {
                    idx[j]++;
                }
            }
        }
        return ugly[n - 1];
    }
    public static void main(String[] args) {
        int[] prims = {2,7,13,19};
        System.out.println(nthSuperUglyNumber(12,prims));
    }
}
