import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/7/2.
 */
public class LeetCode94 {
    List<Integer> res = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return res;
        }
        inorderTraversal(root.left);
        res.add(root.val);
        inorderTraversal(root.right);
        return res;

    }
}
