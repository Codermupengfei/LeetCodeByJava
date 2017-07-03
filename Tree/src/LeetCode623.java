/**
 * Created by OovEver on 2017/7/1.
 */
public class LeetCode623 {
    public TreeNode addOneRow(TreeNode root, int v, int d) {
        if (d == 1) {
            TreeNode newRoot = new TreeNode(v);
            newRoot.left = root;
            return newRoot;
        }
        add(root,v,d,1);
        return root;
    }

    void add(TreeNode root, int v, int d, int curdepth) {
        if (root == null) {
            return;
        }
        if (curdepth == d - 1) {
            TreeNode temp = root.left;
            root.left = new TreeNode(v);
            root.left.left = temp;

             temp = root.right;
            root.right = new TreeNode(v);
            root.right.right = temp;
            return;

        }
        add(root.left, v, d, curdepth + 1);
        add(root.right, v, d, curdepth + 1);
    }
}
