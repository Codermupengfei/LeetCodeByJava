/**
 * Created by OovEver on 2017/6/12.
 * 思路
 * 由于是排序好的链表
 * 所以先找到中点，然后在左边和右边分别找重点，如此递归进行，直到完成操作。
 */

public class LeetCode109 {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return toBST(head, null);
    }

    public TreeNode toBST(ListNode head, ListNode tail) {
        ListNode slow = head;
        ListNode fast = head;
        if (head == tail) {
            return null;
        }
        while (fast != tail && fast.next != tail) {
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode treeNode = new TreeNode(slow.val);
        treeNode.left = toBST(head, slow);
        treeNode.right = toBST(slow.next, tail);
        return treeNode;
    }
}
