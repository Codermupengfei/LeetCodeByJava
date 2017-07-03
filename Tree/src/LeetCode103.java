import java.util.*;

/**
 * Created by OovEver on 2017/7/2.
 */
public class LeetCode103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        queue.add(root);
        int len=1;
        while (!queue.isEmpty()) {
            List<Integer> subList = new ArrayList<>();
            int size = queue.size();
                for(int i=0;i<size;i++) {
                    if (queue.peek().left != null) {
                        queue.add(queue.peek().left);
                    }
                    if (queue.peek().right != null) {
                        queue.add(queue.peek().right);
                    }
                    subList.add(queue.poll().val);
                }
            if (len % 2 == 0) {
                Collections.reverse(subList);
            }
            len++;
            res.add(subList);

        }
        return res;


    }

}
