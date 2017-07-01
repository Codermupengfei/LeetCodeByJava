/**
 * Created by OovEver on 2017/6/30.
 */
public class LeetCode112 {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == sum;
        }
        return  hasPathSum(root.left, sum - root.val)||hasPathSum(root.right, sum - root.val);

    }
}
