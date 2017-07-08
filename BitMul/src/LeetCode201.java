/**
 * Created by OovEver on 2017/7/7.
 * 找到m与n公共的左部分
 * 就是要的结果
 */
public class LeetCode201 {
    public int rangeBitwiseAnd(int m, int n) {
        int count = 0;
        while (m != n) {
            m =m >> 1;
            n = n >> 1;
            count++;
        }
        return m << count;
    }
}
