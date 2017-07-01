/**
 * Created by OovEver on 2017/6/29.
 * 思路
 * 分治法
 * 如果左子树与右子树相差大于1则返回-1
 *
 */


class TreeNode {
      int val;
     TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
public class LeetCode110 {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return depeth(root) == -1 ? false : true;
    }

    public int depeth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = depeth(root.left);
        int rigth = depeth(root.right);
        if(left==-1||rigth==-1||Math.abs(left-rigth)>1){
            return -1;
        }
        return Math.max(left,rigth)+1;
    }
}
