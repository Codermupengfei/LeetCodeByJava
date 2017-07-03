import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/7/2.
 */
public class LeetCode199 {
    public static List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        rightView(root, res, 0);
        return res;
    }

    public static void rightView(TreeNode curr, List<Integer> result, int currDepth){
        if (curr == null) {
            return;
        }
        if (currDepth == result.size()) {
            result.add(curr.val);
        }
        rightView(curr.right,result,currDepth+1);
        rightView(curr.left,result,currDepth+1);

    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        node2.left = node3;
        node1.left = node2;
        System.out.println(rightSideView(node1));
    }
}
