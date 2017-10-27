import java.util.HashSet;

/**
 * Created by OovEver on 2017/10/27.
 */
public class LeetCode653 {
    public boolean findTarget(TreeNode root, int k) {
        HashSet<Integer> hashset=new HashSet<Integer>();
        return dfs(root,hashset,k);
    }
    private boolean dfs(TreeNode root, HashSet<Integer> set,int k){
        if(root==null){
            return false;
        }
        if(set.contains(k-root.val)==true){
            return true;
        }
        set.add(root.val);
        return dfs(root.left,set,k)||dfs(root.right,set,k);
    }
}
