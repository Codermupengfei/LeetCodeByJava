/**
 * Created by OovEver on 2017/7/2.
 */
public class LeetCode129 {
    public int sumNumbers(TreeNode root) {
        return sum(root, 0);
    }
    int sum(TreeNode root,int sum) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return sum * 10 + root.val;
        }
        return sum(root.left, sum * 10 + root.val) + sum(root.right, sum * 10 + root.val);
    }
}
