/**
 * Created by OovEver on 2017/9/13.
 * 两个数组分别记录以num[i]结尾的最大连续子数组
 * 以num[i]结尾的最大连续子数组长度
 */
public class LeetCode673 {
    public int findNumberOfLIS(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int max_len = 0;
        int[] len = new int[nums.length];
        int[] count = new int[nums.length];
        int res = 0;
        for(int i=0;i<nums.length;i++) {
            len[i] = 1;
            count[i] = 1;
            for(int j=0;j<i;j++) {
                if (nums[i] > nums[j]) {
                    if (len[i] == len[j] + 1) {
                        count[i] += count[j];
                    } else if (len[j] + 1 > len[i]) {
                        len[i] = len[j] + 1;
                        count[i] = count[j];
                    }
                }

            }
            if (max_len == len[i]) {
                res += count[i];
            } else if (max_len < len[i]) {
                max_len = len[i];
                res = count[i];

            }
        }
        return res;
    }
}
