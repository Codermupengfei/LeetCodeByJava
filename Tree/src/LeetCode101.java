/**
 * Created by OovEver on 2017/7/1.
 */
public class LeetCode101 {
    public boolean isSymmetric(TreeNode root) {
        return root == null || help(root.left, root.right);
    }

    boolean help(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) {
            return false;
        }
        return help(left.left, right.right) && help(left.right, right.left);
    }
}
