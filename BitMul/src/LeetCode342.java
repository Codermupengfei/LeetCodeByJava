/**
 * Created by OovEver on 2017/7/6.
 * 如果一个数是2的倍数 则其二进制智能有一位为1
 * 如果一个数是4的倍数 则其二进制只能试奇数位为1
 * 与0x55555555可以判断奇数位是否为1
 * num&num-1判断是否为2的n次方
 *
 */
public class LeetCode342 {
    public static boolean isPowerOfFour(int num) {
        if (num <= 0) {
            return false;
        }
        return (num & num - 1)==0 && (num & 0x55555555) == num;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(1));
    }
}
