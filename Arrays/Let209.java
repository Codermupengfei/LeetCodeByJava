/**
 * Created by OovEver on 2017/4/15.
 */
public class Let209 {
    public static int minSubArrayLen(int s, int[] nums) {
      int start=0;
        int end=0;
        int min=Integer.MAX_VALUE;
        int sum=0;
        while (start<nums.length&&end<nums.length){
            while (sum<s&&end<nums.length){
                sum+=nums[end++];
            }
            while (sum>=s&&start<=end){
                min=Math.min(min,end-start);
                sum-=nums[start++];
            }
        }
      return min==Integer.MAX_VALUE?0:min;
    }

    public static void main(String[] args) {
    }
}
