import java.util.HashSet;

/**
 * Created by OovEver on 2017/10/11.
 */
public class LeetCode645 {
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[10001];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++) {
            arr[nums[i]]++;
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        int[] res = new int[2];
        boolean isrepeate = false;
        for(int i=1;i<=max;i++) {
            if (arr[i] == 2) {
                res[0] = i;
            }
            else if (arr[i] == 0) {
                res[1] = i;
                isrepeate = true;
            }
        }
        if (!isrepeate&&max!=Integer.MIN_VALUE) {
            if (max == 1) {
                res[1] = 2;
            } else {
                if (arr[max - 1] != 0) {
                    res[1] = max + 1;
                } else {
                    res[1] = max - 1;
                }
            }
        }
        return res;
    }
}
