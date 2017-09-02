import java.awt.event.ItemListener;
import java.util.Arrays;

/**
 * Created by OovEver on 2017/9/2.
 * 第一种方法动态规划
 * 第二种方法，找两个比最小的数，再找一个比他大的数
 */
public class LeetCode334 {
//    public boolean increasingTriplet(int[] nums) {
//        if (nums.length == 0) {
//            return false;
//        }
//        int len = nums.length;
//        int[] list = new int[len];
//        Arrays.fill(list, 1);
//        for(int i=1;i<len;i++) {
//            for(int j=0;j<i;j++) {
//                if (nums[j] < nums[i] && list[i] < list[j] + 1) {
//                    list[i] = list[j] + 1;
//                    if (list[i] >= 3) {
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }
public boolean increasingTriplet(int[] nums) {
    int smller = Integer.MAX_VALUE;
    int bigger = Integer.MAX_VALUE;
    for (int n : nums) {
        if (n <= smller) {
            smller = n;
        } else if (n <= bigger) {
            bigger = n;
        } else return true;
    }
    return false;
}
}
