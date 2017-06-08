/**
 * Created by OovEver on 2017/6/8.
 */
public class Leetcode50 {
    public double myPow(double x, int n) {
        if (n < 0) return 1 / (x*myPow(x, -(++n)));
        else if (n == 0) return 1;
        else return (n % 2 == 0) ? myPow(x*x, n / 2) : x*myPow(x*x, n / 2);

    }
}
