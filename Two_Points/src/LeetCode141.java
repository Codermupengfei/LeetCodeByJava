/**
 * Created by OovEver on 2017/6/11.
 */


class ListNode {
    int val;
    ListNode next;
     ListNode(int x) {
        val = x;
         next = null;
    }
 }
/**
 * 思路
 * 用两个节点来遍历链表
 * 第一个节点一次走一步
 * 第二个节点一次走两步
 * 如果存在循环则在某一时刻两个节点会相遇
 * */
public class LeetCode141 {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow=head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
