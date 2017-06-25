/**
 * Created by OovEver on 2017/6/8.
 * 求1到n的和
 * 等差数列求和公式
 */
public class Leectcode441 {
    public static int arrangeCoins(int n) {
        if (n == 0) {
            return 0;
        }

        long res=1;
        while ((1*res+res*(res-1)/2)<=n) {
            res++;
        }
        return (int)res - 1;
    }

    public static void main(String[] args) {
        System.out.println(arrangeCoins(100));
    }
}
