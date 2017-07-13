/**
 * Created by OovEver on 2017/7/12.
 * 思路
 * n-1个数每个数+1相当于一个数减1
 * 只要找到最小的数
 * 然后让所有的数等于最小的数即可
 * 由于每次只能改变一个数字
 * 所以求出所有数字与最小数字的差 即为最终结果
 */
public class LeetCode453 {
    public static int minMoves(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int min = nums[0];
        for (int n : nums) {
            min = Math.min(n, min);
        }
        int sum = 0;
        for(int n:nums) {
            sum += n - min;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(minMoves(nums));

    }
}
