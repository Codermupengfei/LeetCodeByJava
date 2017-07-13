/**
 * Created by OovEver on 2017/7/12.
 * 2和5相乘才能有0
 * 由于2的次数比5多
 * 所以判断有几个5就有几个0
 * 但是对于25这样的数有两个5 所以要递归处理看有多少个5的情况
 */
public class LeetCode172 {
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}
