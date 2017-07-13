import sun.plugin.WJcovUtil;

import java.util.PriorityQueue;

/**
 * Created by OovEver on 2017/7/12.
 * 思路
 * 如果能被2整除 就一直除2 直到不能整除为止
 * 3和5类似
 * 最后返回==1
 */
public class LeetCode263 {
    public static boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        if (num == 1) {
            return true;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;


    }

    public static void main(String[] args) {
        int num = 4;
        System.out.println(isUgly(num));

    }
}
