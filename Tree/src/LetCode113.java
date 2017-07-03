import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/7/1.
 */
public class LetCode113 {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> solution = new ArrayList<>();
        findSun(res, solution, root, sum);
        return res;
    }

    void findSun(List<List<Integer>> res, List<Integer> solution, TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        sum -= root.val;
        if (root.left == null && root.right == null) {
            if (sum == 0) {
                solution.add(root.val);
                res.add(new ArrayList<>(solution));
                solution.remove(solution.size() - 1);

            }
            return;
        }
        solution.add(root.val);
        findSun(res,solution,root.left,sum);
        findSun(res,solution,root.right,sum);
        solution.remove(solution.size() - 1);
    }

}
