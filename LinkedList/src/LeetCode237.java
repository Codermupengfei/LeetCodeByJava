/**
 * Created by OovEver on 2017/6/12.
 */
public class LeetCode237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        ListNode temp = node.next;
        node.next = node.next.next;
        temp = null;
    }
}
