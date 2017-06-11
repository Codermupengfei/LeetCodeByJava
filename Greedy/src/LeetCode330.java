/**
 * Created by OovEver on 2017/6/10.
 */
public class LeetCode330 {
    /**
     * 思路：
     * 这道题首先要找规律
     * 对于0到n的连续的数，他们相加的和可以表示0-2*n-1连续的数
     * 所以本题可以应用此规律
     * 1.用一个中间变量初始值为1记录当前表示的数的最大的范围
     * 2.当此中间变量的值大于nums[i]时，此时可以表示的范围为0-nums[i]+中间变量
     * 3.当此中间变量的值小于nums[i]时，此时为了防止表示的变量出现缺口，此时表示的范围为0-2*nums[i]
     * */
    public static int minPatches(int[] nums, int n) {
//        要用long int会超限
        long tempRange=1;
        int res=0;
        int i=0;
        while (tempRange <= n) {
            if (i < nums.length && tempRange >= nums[i]) {
                tempRange += nums[i++];
            }else {
                tempRange += tempRange;
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 31, 33};
        int n = 2147483647;
        System.out.println(minPatches(nums,n));
    }
}
