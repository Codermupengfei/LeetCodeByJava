import java.util.Arrays;

/**
 * Created by OovEver on 2017/7/16.
 * 用temp数组保存原数组
 * 之后对数组排序
 * 对比两个数组
 * 找出第一个和最后一个不同的地方，想减并返回结果
 */
public class LeetCode581 {
    public static int findUnsortedSubarray(int[] nums) {
        int[] temps = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            temps[i] = nums[i];
        }
        Arrays.sort(temps);
        int start = 0;
        int end = nums.length - 1;
        while (start < nums.length && nums[start] == temps[start]) {
            start++;
        }
        while (end > start && nums[end] == temps[end]) {
            end--;
        }
        return end - start + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
}
