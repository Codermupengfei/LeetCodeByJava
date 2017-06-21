/**
 * Created by OovEver on 2017/6/12.
 */
public class LeetCode92 {
    /**
    * 思路
    * 一共四个节点
    * 一个是pre节点
    * 一个start节点
    * 一个then节点，start后的节点
    **/
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null) {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i=0;i<m-1;i++) {
            pre = pre.next;
        }
        ListNode  start = pre.next;
        ListNode then = start.next;
        for(int i=0;i<n-m;i++) {
            start.next = then.next;
            then.next = pre.next;
            pre.next = then;
            then = start.next;
        }
        return dummy.next;


    }
}
