/**
 * Created by OovEver on 2017/6/29.
 */
public class LeetCode572 {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null) {
            return true;
        }
        if (s == null) {
            return false;
        }
        if (isequal(s, t)) {
            return true;
        }
        if (isSubtree(s.left, t)||isSubtree(s.right, t)) {
            return true;
        }
//        if (isSubtree(s.right, t)) {
//            return true;
//        }
        return false;
    }
    public boolean isequal(TreeNode s, TreeNode t) {
        if (s == null || t == null) {
            return s == t;
        }
        if (s.val != t.val) {
            return false;
        }
        return isequal(s.left, t.left) && isequal(s.right, t.right);
    }
}
