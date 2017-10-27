/**
 * Created by OovEver on 2017/10/27.
 */
public class LeetCode687 {
    int len=0;
    public int longestUnivaluePath(TreeNode root) {
        if(root==null)
            return 0;
        len=0;
        getLen(root,root.val);
        return len;
    }
    private int getLen(TreeNode root,int val){
        if(root==null){
            return 0;
        }
        int left=getLen(root.left,root.val);
        int right=getLen(root.right,root.val);
        len=Math.max(len,left+right);
        if(root.val==val){
            return Math.max(left,right)+1;
        }
        return 0;
    }
}
