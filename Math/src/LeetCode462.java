import java.util.Arrays;

/**
 * Created by OovEver on 2017/7/13.
 * 第一种思路
 * 先排序 找到中间的数
 * 遍历数组
 * 找到每个数与中间数的差，相加即为结果
 * 第二种思路
 * 先排序
 * 由于 i-mid+mid-j=i-j
 * 利用这个规律 减少一半的时间复杂度
 *
 */
public class LeetCode462 {
    public static int minMoves2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
//        int len = nums.length / 2;
//        int mid = nums[len];
//        int count = 0;
//        for(int i=0;i<nums.length;i++) {
//            System.out.println(mid);
//            System.out.println(nums[i]);
//            count += nums[i] > mid ? nums[i] - mid : mid - nums[i];
//        }
//        第二种解法
        int count = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            count += nums[j] - nums[i];
            i++;
            j--;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(minMoves2(nums));

    }
}
