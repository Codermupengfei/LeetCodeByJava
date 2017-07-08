/**
 * Created by OovEver on 2017/7/6.
 */
public class LeetCode397 {
    public int integerReplacement(int n) {
        int count = 0;
        while (n != 1) {
//            为int的最大值
            if (n == Integer.MAX_VALUE) {
                return 32;
            }
//            n为偶数
            else if (n % 2 == 0) {
                n = n >> 1;
            } else {
                //n为奇数
                if (n == 3) {
                    count += 2;
                    return count;
                }
//                最低位为01时取n-1最低位为11时取n+1
                n = (n & 2) == 2 ? n + 1 : n - 1;

            }
            count++;
        }
        return count;
    }

}
