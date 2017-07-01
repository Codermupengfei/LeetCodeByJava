/**
 * Created by OovEver on 2017/6/30.
 */
public class LetCode606 {
    public String tree2str(TreeNode t) {
        if (t == null) {
            return "";
        }
        String res = t.val + "";
        String left=tree2str(t.left);
        String right=tree2str(t.right);
        if (left == "" && right == "") {
            return res;
        }
        if (left == "") {
            return res + "()" + "(" + right + ")";
        }
        if (right == "") {
            return res + "(" + left + ")";
        }
        return  res+"(" + left + ")" + "(" + right + ")";

    }
}
