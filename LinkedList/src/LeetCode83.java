/**
 * Created by OovEver on 2017/6/12.
 */
public class LeetCode83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = head;

        while (list != null) {
            if (list.next == null) {
                break;
            }
            if (list.val == list.next.val) {
                list.next = list.next.next;
            }else {
                list = list.next;
            }
        }

        return head;
    }
}
