import sun.text.resources.cldr.es.FormatData_es_419;

import java.util.HashSet;
import java.util.function.IntToDoubleFunction;

/**
 * Created by OovEver on 2017/7/12.
 * 思路
 * 两点法处理
 * 初始时取两个数一个为0一个为c开方后的数
 * 判断两数平方大于还是小于C
 * 等于返回true
 * 遍历完返回false
 * 时间复杂度为O（sqrt(c)）
 */
public class LeetCode633 {
    public static boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }
        int left = 0;
        int right = (int) Math.sqrt(c);
        while (left <= right) {
            int cur = left * left + right * right;
            if (cur > c) {
                right--;
            } else if (cur < c) {
                left++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(judgeSquareSum(3));
    }
}
