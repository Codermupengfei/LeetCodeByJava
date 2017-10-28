import sun.reflect.generics.tree.Tree;

import java.util.ArrayDeque;

/**
 * Created by OovEver on 2017/10/27.
 */
public class LeetCode662 {
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        ArrayDeque<Integer> count = new ArrayDeque<>();
        queue.add(root);
        count.add(0);
        int max = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int left = 0;
            int right = 0;
            for(int i=0;i<size;i++) {
                TreeNode node = queue.poll();
                int index = count.poll();
                if (i == 0) {
                    left = index;
                }
                if (i == size - 1) {
                    right = index;
                }
                if (node.left != null) {
                    queue.add(node.left);
                    count.add(2 * index);
                }
                if (node.right != null) {
                    queue.add(node.right);
                    count.add(2 * index + 1);
                }

            }
            max = Math.max(max, right - left + 1);
        }
        return max;

    }
}
