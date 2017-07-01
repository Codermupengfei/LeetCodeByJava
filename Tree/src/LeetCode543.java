/**
 * Created by OovEver on 2017/6/29.
 */
public class LeetCode543 {
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        findMaxPath(root);
        return max;
    }

    int findMaxPath(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = findMaxPath(root.left);
        int right = findMaxPath(root.right);
        max = Math.max(left + right, max);
        return Math.max(left, right) + 1;

    }

}
