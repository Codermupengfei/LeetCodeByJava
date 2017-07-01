/**
 * Created by OovEver on 2017/7/1.
 */
public class LeetCode437 {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return parhFromSum(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    int parhFromSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return (root.val == sum ? 1 : 0) + parhFromSum(root.left, sum - root.val) + parhFromSum(root.right, sum - root.val);

    }
}
