import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by OovEver on 2017/7/2.
 */
public class LeetCode515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int max = queue.peek().val;
            int size = queue.size();
            for(int i=0;i<size;i++) {
                TreeNode temp = queue.poll();
                max = Math.max(max, temp.val);
                if(temp.left!=null) queue.add(temp.left);
                if(temp.right!=null) queue.add(temp.right);
            }
            res.add(max);

        }
            return res;

    }
}
