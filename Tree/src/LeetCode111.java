/**
 * Created by OovEver on 2017/6/30.
 */
public class LeetCode111 {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return minDepth(root);
    }
    int findMinPath(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.min(findMinPath(root.left), findMinPath(root.right)) + 1;


    }

}
