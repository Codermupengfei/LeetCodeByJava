import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/6/23.
 * 思路
 * 用map记录各个元素出现的次数
 * 之后判断负的这个元素是否存在，存在的话则总数加1
 */
public class LeetCode454 {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> sums = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i=0;i< A.length;i++) {
            for(int j=0;j<B.length;j++) {
                int sum = A[i] + B[j];
                if (sums.containsKey(sum)) {
                    sums.put(sum, sums.get(sum) + 1);
                } else {
                    sums.put(sum, 1);
                }
            }
        }
        for(int i=0;i<C.length;i++) {
            for(int j=0;j<D.length;j++) {
                int sum = -1 * (C[i] + D[j]);
                if (sums.containsKey(sum)) {
                    count += sums.get(sum);
                }
            }
        }
        return count;

    }
}
