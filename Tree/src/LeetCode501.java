import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/7/1.
 */
public class LeetCode501 {
    int maxCount = 0;
    int count = 1;
    Integer prev = null;

    public int[] findMode(TreeNode root) {
        if (root == null) {
            return new int[0];
        }
        List<Integer> res = new ArrayList<>();
        traverse(root, res);
        int[] resInt = new int[res.size()];
        for(int i=0;i<res.size();i++) {
            resInt[i] = res.get(i);
        }
        return resInt;

    }

    void traverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        traverse(root.left, list);
        if (prev != null) {
            if (root.val == prev) {
                count++;
            } else {
                count = 1;
            }
        }
        if (count > maxCount) {
            maxCount = count;
            list.clear();
            list.add(root.val);
        } else if (count == maxCount) {
            list.add(root.val);
        }
        prev = root.val;
        traverse(root.right,list);
    }

}
