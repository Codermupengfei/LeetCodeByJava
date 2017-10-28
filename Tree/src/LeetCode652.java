import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * Created by OovEver on 2017/10/27.
 */
public class LeetCode652 {
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res=new LinkedList<>();
        postorder(root, new HashMap<>(), res);
        return res;

    }
    private String postorder(TreeNode cur, Map<String,Integer> map, List<TreeNode> res){
        if(cur==null) return "#";
        String serial=cur.val+","+postorder(cur.left,map,res)+","+postorder(cur.right,map,res);
        if(map.getOrDefault(serial,0)==1) res.add(cur);
        map.put(serial,map.getOrDefault(serial,0)+1);
        return serial;
    }
}
