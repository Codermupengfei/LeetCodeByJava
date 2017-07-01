import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by OovEver on 2017/6/30.
 */
public class LeetCode107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (root == null) {
            return res;
        }
        queue.offer(root);
        while (!queue.isEmpty()) {
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<>();
            for(int i=0;i<levelNum;i++) {
                if(queue.peek().left!=null) queue.add(queue.peek().left);
                if (queue.peek().right!=null) queue.add(queue.peek().right);
                subList.add(queue.poll().val);
            }
            res.add(0, subList);

        }
        return res;

    }
}
