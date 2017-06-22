/**
 * Created by OovEver on 2017/6/22.
 * 思路：
 * 将链表分为两部分
 * 将后面部分进行反转
 * 反转后与前面部分进行合并
 */
public class LeetCode143 {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null) {
            return;
        }
        ListNode prev = null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode l1 = head;
        while (fast != null&&fast.next!=null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode l2 = reverse(slow);
        merge(l1, l2);

    }

    public ListNode reverse(ListNode head) {
        ListNode cur=head, next=null,prev=null;
        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;

        }

        return prev;

    }

    public void merge(ListNode l1, ListNode l2) {
        while (l1 != null) {
            ListNode n1 = l1.next;
            ListNode n2 = l2.next;
            l1.next=l2;
            if (n1 == null) {
                break;
            }

            l2.next = n1;
            l1 = n1;
            l2 = n2;
        }

    }

}
