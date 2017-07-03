/**
 * Created by OovEver on 2017/7/1.
 */
public class LeetCode114 {
    private TreeNode lastNode = null;
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
//        如果最后一个节点不为空
        if (lastNode != null) {
            lastNode.left = null;
            lastNode.right = root;
        }
        lastNode = root;
//        保存right节点
        TreeNode right = root.right;
//      遍历左节点
        flatten(root.left);
        flatten(right);

    }
}
