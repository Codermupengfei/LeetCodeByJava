/**
 * Created by OovEver on 2017/6/8.
 */
public class Leetcode367 {
    public static boolean isPerfectSquare(int num) {
        boolean res = false;
        if (num == 0) {
            return res;
        }
        if(num==1)
            return true;
        long left=0;
        long right=num/2;
        while (left <= right) {
            long middle = (left + right) / 2;
            long val = middle * middle;
            if (val == num) {
                return true;
            } else if (val < num) {
                left=middle+1;
            } else if (val > num) {
                right=middle-1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int num=4;
        System.out.println(isPerfectSquare(808201));
        isPerfectSquare(4);
    }
}
