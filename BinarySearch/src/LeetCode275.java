/**
 * Created by OovEver on 2017/6/25.
 * 思路
 * 二分查找到当前的位置
 */
public class LeetCode275 {
    public static int hIndex(int[] citations) {
        int len = citations.length;
        int right = citations.length - 1;
        int left = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (citations[mid] == len - mid) {
                return len - mid;
            } else if (citations[mid] < len - mid) {
                left = mid + 1;
            } else {
                right = mid-1;
            }
        }
        return len-left;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4};
        System.out.println(hIndex(nums));

    }
}
