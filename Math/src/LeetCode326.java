import static java.lang.Math.abs;
import static java.lang.Math.log;
import static java.lang.Math.rint;

/**
 * Created by OovEver on 2017/7/12.
 * 3^N=n
 * log(3^N)=log(n)
 * N*log(3)=log(n)
 * N=log(n)/log(3)
 * 3的19次方是能表示的最大的数
 */
public class LeetCode326 {
    public static boolean isPowerOfThree(int n) {
//        double a = Math.log(n) / Math.log(3);
//        return (Math.abs(a - Math.rint(a))) <= 0.00000000000001;
        return n>0&&Math.pow(3, 19) % n == 0;
    }

    public static void main(String[] args) {
        isPowerOfThree(27);
    }
}
