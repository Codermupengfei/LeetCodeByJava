import javax.naming.InsufficientResourcesException;

/**
 * Created by OovEver on 2017/7/12.
 * 思路
 * 分为三步
 * 1.第一步大致确定n的位置 是属于一位两位还是三位
 * 2.根据第一步确定的位置确定具体数字
 * 3.确定具体数字的具体位数
 * 分析可以得出一位有９个数字，二位数有90个数字，三位数有900个数，依次类推．因此可以每次增加一位数字，看n是否还在这个范围内．例如给定n = 150，首先一位有９个数字，所以位数可以＋１，这样n-9 = 141. 然后２位的数字有２＊９０= 180，大于１４１，所以目标数字肯定是２位的．然后求具体落在哪个数字．可以用10+(141-1)/2 = 80求出．再求具体落在哪一位上，可以用(141-1)%2＝０求出为第０位，即８．如此即可．
 */
public class LeetCode400 {
    public static int findNthDigit(int n) {
        int bitLen = 1;
//        int会报错 为了防止越界
        long count = 9;
        int statrt = 1;
        while (n > bitLen * count) {
            n -= bitLen * count;
            bitLen++;
            count *= 10;
            statrt *= 10;
        }
//        判断是哪个数，对于两位的数来说，由于初始的数是10，如果不减1 当n为11的时候
//        statrt的值将为11 判断错误
        statrt += (n - 1) / bitLen;
        String s = Integer.toString(statrt);
        return Character.getNumericValue(s.charAt((n-1)%bitLen));
    }

    public static void main(String[] args) {
        System.out.println(findNthDigit(2147483647));


    }
}
