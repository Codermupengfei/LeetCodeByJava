/**
 * Created by OovEver on 2017/6/12.
 */
public class LeetCode203 {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode fakeHead = new ListNode(-1);
        fakeHead.next = head;
        ListNode cur = head;
        ListNode preHead = fakeHead;
        while (cur != null) {
            if (cur.val == val) {
                preHead.next = cur.next;
            } else {
                preHead= preHead.next;
            }
            cur = cur.next;
        }
        return fakeHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3= new ListNode(3);
//        l3.next = null;
//        l2.next = l3;
//        l1.next = l2;
        removeElements(l1, 1);


    }
}
