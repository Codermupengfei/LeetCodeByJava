/**
 * Created by OovEver on 2017/7/2.
 */
public class LeetCode98 {
    static TreeNode pre = null;
    public static boolean isValidBST(TreeNode root) {
        if (root != null) {
            if(!isValidBST(root.left)) return false;
            if(pre!=null&&pre.val>=root.val) return false;
            pre = root;
            return  isValidBST(root.right);
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(0);
        node1.left = node2;
        node1.right = node3;
        System.out.println(isValidBST(node4));

    }
}
