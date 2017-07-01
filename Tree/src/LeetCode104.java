/**
 * Created by OovEver on 2017/6/29.
 */
public class LeetCode104 {
    int max = 0;
    public int maxDepth(TreeNode root) {
        findMaxDepth(root,1);
        return max;
    }

    void findMaxDepth(TreeNode root,int curDepth) {
        if (root == null) {
            return ;
        }
        if (curDepth > max) {
            max = curDepth;
        }
        findMaxDepth(root.left, curDepth + 1);
        findMaxDepth(root.right, curDepth + 1);


    }
}
