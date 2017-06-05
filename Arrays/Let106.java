import java.util.HashMap;

/**
 * Created by OovEver on 2017/4/15.
 */
public class Let106 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null||postorder==null||inorder.length!=postorder.length)
            return null;
        HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return buildtree(inorder,0,inorder.length-1,postorder,postorder.length-1,map);
    }
    TreeNode buildtree(int []inorder,int startin,int endin,int[] postorder,int endp,HashMap<Integer,Integer> map){
        if(startin>endin)
            return null;
        TreeNode root=new TreeNode(postorder[endp]);
        int pos=map.get(root.val);
        root.right=buildtree(inorder,pos+1,endin,postorder,endp-1,map);
        root.left=buildtree(inorder,startin,pos-1,postorder,endp-(endin-pos+1),map);
        return root;

    }
}
