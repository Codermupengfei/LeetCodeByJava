/**
 * Created by OovEver on 2017/7/8.
 */
public class LeetCode357 {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int base = 9;
        int sum = 10;
        for(int i=2;i<=n&&i<=10;i++) {
            base *= (9 - i + 2);
            sum += base;
        }
        return sum;
    }
}
