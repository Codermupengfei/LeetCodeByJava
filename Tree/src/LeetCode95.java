import java.util.LinkedList;
import java.util.List;

/**
 * Created by OovEver on 2017/7/1.
 */
public class LeetCode95 {
    public static List<TreeNode> generateTrees(int n) {
        if (n == 0) {
            return new LinkedList<TreeNode>();
        }
        return generateSubtrees(1, n);
    }

    private static List<TreeNode> generateSubtrees(int s, int e) {
        List<TreeNode> res = new LinkedList<TreeNode>();
        if (s > e) {
            res.add(null);
            return res;
        }
        for(int i=s;i<=e;i++) {
            List<TreeNode>  leftSubtree = generateSubtrees(s, i-1);
            List<TreeNode> rightSubtree = generateSubtrees(i + 1, e);
            for (TreeNode left : leftSubtree) {
                for (TreeNode righr : rightSubtree) {
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = righr;
                    res.add(root);
                }
            }

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(generateTrees(3));
    }
}
