import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by OovEver on 2017/10/27.
 */
public class LeetCode637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double>    res =new ArrayList<>();
        Queue<TreeNode> q   =new LinkedList<>();
        if(root==null){
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            double sum=0.0;
            for(int i=0;i<n;i++){
                TreeNode node=q.poll();
                sum+=node.val;
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            res.add(sum/n);
        }
        return res;
    }
}
