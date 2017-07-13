/**
 * Created by OovEver on 2017/7/12.
 * 思路
 * 对于小于0的数直接返回false
 * 否则翻转整数
 * 翻转后的数和原来的数相等的话 则为回文数
 * 翻转数字方法
 * 新建一个y==x
 * 模y与res*10相加
 * 再y/10
 */
public class LeetCode9 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = x;
        int res = 0;
        while (y != 0) {
            res = res * 10 + y % 10;
            y /= 10;
        }
        return x == res;
    }
}
