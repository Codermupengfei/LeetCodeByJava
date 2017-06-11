/**
 * Created by OovEver on 2017/6/11.
 */



public class LeetCode142 {
    /**
     * 与141题类似
     *
     */
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode fast;
        ListNode slow;
        fast=head;
        slow=head;
        while (fast.next != null && fast.next.next != null) {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                ListNode slow2 = head;
                while (slow2 != slow){
                    slow = slow.next;
                    slow2 = slow2.next;
                }
                return slow;
            }


        }
        return null;
    }

}
