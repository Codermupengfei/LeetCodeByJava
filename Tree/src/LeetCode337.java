/**
 * Created by OovEver on 2017/7/1.
 */
public class LeetCode337 {
    public int rob(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }

    int[] dfs(TreeNode root) {
        if (root == null) {
            return new int[2];
        }
        int []left=dfs(root.left);
        int []right = dfs(root.right);
        int[] res = new int[2];
        res[0] = left[1] + right[1] + root.val;
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return res;


    }
}
