/**
 * Created by OovEver on 2017/7/7.
 * 1的个数乘以0的个数就是总的汉密尔顿距离
 */
public class LeetCode477 {
    public int totalHammingDistance(int[] nums) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<32;i++) {
            int bitCount = 0;
            for(int j=0;j<n;j++) {
                bitCount += (nums[j] >> i) & 1;
            }
            count += bitCount * (n - bitCount);
        }
        return count;
    }

}
