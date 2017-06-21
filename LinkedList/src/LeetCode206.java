/**
 * Created by OovEver on 2017/6/12.
 */
public class LeetCode206 {
    public ListNode reverseList(ListNode head) {
        //迭代
        ListNode newHead = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = newHead;
            newHead = head;
            head = next;
        }
        return newHead;
    }
}
