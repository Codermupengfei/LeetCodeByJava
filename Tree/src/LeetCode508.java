import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by OovEver on 2017/7/2.
 */
public class LeetCode508 {
    int maxCount = 0;
    Map<Integer, Integer> sumToCount;
    public int[] findFrequentTreeSum(TreeNode root) {
        sumToCount = new HashMap<>();
        postOrder(root);
        List<Integer> res = new ArrayList<>();
        for (int key : sumToCount.keySet()) {
            if (sumToCount.get(key) == maxCount) {
                res.add(key);
            }
        }
        int[] result = new int[res.size()];
        for(int i=0;i<res.size();i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left=postOrder(root.left);
        int right=postOrder(root.right);
        int sum = left + right + root.val;
        int count = sumToCount.getOrDefault(sum,0)+1;
        sumToCount.put(sum,count);
        maxCount = Math.max(maxCount, count);
        return sum;
    }
}
