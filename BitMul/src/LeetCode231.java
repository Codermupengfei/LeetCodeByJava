/**
 * Created by OovEver on 2017/7/6.
 */
public class LeetCode231 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
