/**
 * Created by OovEver on 2017/6/25.
 * 思路
 * 构建升序序列
 */
public class LeetCode300 {
    public static int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] tail = new int[len];
        int size=0;
        for (int x : nums) {
            int i=0;
            int j = size;
            while (i <j) {
                int mid = i + (j - i) / 2;
                if (tail[mid] < x) {
                    i = mid + 1;
                }else {
                    j = mid;
                }
            }
            tail[i] = x;
            if(i==size) size++;
        }
        return size;

    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println(lengthOfLIS(nums));
    }
}
