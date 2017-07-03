/**
 * Created by OovEver on 2017/7/2.
 */
public class LeetCode538 {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        convert(root);
        return root;
    }

    void convert(TreeNode root) {
        if (root == null) {
            return;
        }
        convert(root.right);
        root.val += sum;
        sum = root.val;
        convert(root.left);

    }

}
