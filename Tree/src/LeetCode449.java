import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by OovEver on 2017/7/2.
 */
public class LeetCode449 {
    private static final String SEP = ",";
    private static final String NULL = null;

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) {
            return NULL;
        }
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.empty()) {
            root = st.pop();
            sb.append(root.val).append(SEP);
            if(root.right!=null) st.push(root.right);
            if(root.left!=null) st.push(root.left);

        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data==null||data.equals(null)||data.length()==0){
            return null;
        }
        String[] strs = data.split(SEP);
        Queue<Integer> q = new LinkedList<>();
        for (String e : strs) {
            q.offer(Integer.valueOf(e));
        }
        return getNode(q);
    }

    private TreeNode getNode(Queue<Integer> q) {
        if (q.isEmpty()) {
            return null;
        }
        TreeNode root = new TreeNode(q.poll());
        Queue<Integer> samllerQueue = new LinkedList<>();
        while (!q.isEmpty() && q.peek() < root.val) {
            samllerQueue.offer(q.poll());
        }
        root.left = getNode(samllerQueue);
        root.right = getNode(q);
        return root;
    }
}
