/**
 * Created by OovEver on 2017/7/6.
 * 求位的相加的和
 * 求进位 左移12
 * 进位与原位之和相加
 */
public class LeetCode371 {
    public int getSum(int a, int b) {
        while (b!=0) {
            int c = a ^ b;
            b = (a & b) << 1;
            a = c;
        }
        return a;
    }
}
