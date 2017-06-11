/**
 * Created by OovEver on 2017/6/11.
 */
public class LeetCode321 {
    /**
     * 思路
     * 本题算是难题，想了很久，没想出来，看答案也看了很久才有思路
     * 本题主要分为三步
     * 1.首先是找出从一个数组中取出k个元素得到的最大值
     * 2.接着考虑将两个数组合并，找出合并方式使合并后的值最大，在合并过程中要考虑值相等的情况，这需要比较其后面的值
     * 3.回归本题，首先处理第一个数组中i个元素的最大值，接着处理第二个数组中k-i个元素的最大值，最后将数组合并，并进行每次比较找出最大值
     */
    public int[] maxArray(int[] nums, int k) {
        int n=nums.length;
        int[] res = new int[k];
        for(int i=0,j=0;i<n;i++) {
            while (n-i+j>k&&j>0&&nums[i]>res[j]) j--;
            if (j < k) {
                res[j++] = nums[i];
            }
        }
        return res;
    }

    public boolean greater(int[] nums1, int i, int[] nums2, int j) {
        while (i < nums1.length && j < nums2.length && nums1[i] == nums2[j]) {
            i++;
            j++;
        }
        return j == nums2.length || (i < nums1.length && nums1[i] > nums2[j]);
    }
    public int []merge(int []nums1,int[]nums2,int k){
        int[] res = new int[k];
        int i=0,j=0;
        for(int r=0;r<k;r++) {
            if (greater(nums1, i, nums2, j)) {
                res[r] = nums1[i++];
            } else {
                res[r] = nums2[j++];
            }
        }
        return res;
    }
    public int[] maxNumber(int[] nums1, int[] nums2, int k) {
        int m=nums1.length;
        int n = nums2.length;
        int[] res = new int[k];
        for(int i=Math.max(0,k-n);i<=k&&i<=m;i++) {
            int[] v1 = maxArray(nums1, i);
            int[] v2 = maxArray(nums2, k - i);
            int[] candiate = merge(v1, v2, k);
            if (greater(candiate, 0, res, 0)) {
                res = candiate;
            }
        }
        return res;
    }
}
