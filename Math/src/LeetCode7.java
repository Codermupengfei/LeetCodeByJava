/**
 * Created by OovEver on 2017/7/12.
 *
 */
public class LeetCode7 {
    public static int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        int res = 0;
        while (x != 0) {
//            关键部分
            if (Integer.MAX_VALUE / 10 < res ||Integer.MIN_VALUE/10>res) {
                return 0;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
