/**
 * Created by OovEver on 2017/6/11.
 */
public class LeetCode86 {
    /**
     * 思路
     * 建立两个链表，一个存储大于等于k的一个存储小于k的
     * 之后对建立的两个链表连接，即得到需要的结果
     * */
    public static ListNode partition(ListNode head, int x) {
        ListNode duum1 = new ListNode(0);
        ListNode duum2 = new ListNode(0);
//        存储小于x的节点
        ListNode cur1 = duum1;
//        存储大于x的节点
        ListNode cur2 = duum2;
        while (head != null) {
            if (head.val < x) {
                cur1.next = head;
                cur1 = head;
            }else {
                cur2.next = head;
                cur2 = head;
            }
            head = head.next;
        }
        cur2.next = null;
        cur1.next = duum2.next;
        return duum1.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(4);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(2);
        l6.next = null;
        l5.next = l6;
        l4.next = l5;
        l3.next = l4;
        l2.next = l3;
        l1.next = l2;
        partition(l1, 3);
    }
}
