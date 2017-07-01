/**
 * Created by OovEver on 2017/6/29.
 */
public class LeetCode563 {
    int res = 0;
    public int findTilt(TreeNode root) {
        postOrder(root);
        return res;


    }

    int postOrder(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftSum = postOrder(root.left);
        int rightSum = postOrder(root.right);
        res += Math.abs(rightSum - leftSum);
        return leftSum + rightSum + root.val;
    }
}
