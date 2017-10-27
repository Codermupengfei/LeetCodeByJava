import java.util.Set;
import java.util.TreeSet;

/**
 * Created by OovEver on 2017/10/27.
 */
public class LeetCode671 {
    public int findSecondMinimumValue(TreeNode root) {
        if(root==null){
            return -1;
        }
        Set<Integer> set =new TreeSet<Integer>();
        dfs(root,set);
        if(set.size()<2){
            return -1;
        }
        System.out.println(set.size());
        int count=1;
        for (int s : set) {
            if (count == 2) {
                return s;
            }
            count++;
        }
        return -1;
    }
    private void dfs(TreeNode root, Set<Integer> set){
        if(root==null) return;
        set.add(root.val);
        dfs(root.left,set);
        dfs(root.right,set);
    }
}
