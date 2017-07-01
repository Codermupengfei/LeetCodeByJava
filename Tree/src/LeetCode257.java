import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/6/29.
 */
public class LeetCode257 {
    List<String> res = new ArrayList<>();
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return res;
        }
        helper(root, String.valueOf(root.val), res);
        return res;
    }

    public void helper(TreeNode root,String path,List<String> res) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            res.add(path);
        }
        if (root.left != null) {
            helper(root.left, path + "->" + String.valueOf(root.left.val), res);
        }
        if (root.right != null) {
            helper(root.right,path+"->"+String.valueOf(root.right.val),res);
        }
    }


}
