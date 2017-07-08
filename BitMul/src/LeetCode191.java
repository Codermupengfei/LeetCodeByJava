/**
 * Created by OovEver on 2017/7/6.
 * 与1进行&返回个数
 */
public class LeetCode191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int ones = 0;
        while (n != 0) {
            ones = ones + (n & 1);
           n=n >>> 1;
        }
        return ones;
    }

    public static void main(String[] args) {
        int n = -4;
        n=n >> 1;
        System.out.println(n);
    }
}
