/**
 * Created by OovEver on 2017/6/11.
 */
public class LeetCode61 {
    /**
     * 思路
     * 将节点链接成循环模式
     * 在k处断开
     * k可能超过head长度
     *
     * */
    public static ListNode rotateRight(ListNode head, int k) {
        if (k == 0) {
            return head;
        }
        if (head == null || head.next == null) {
            return head;
        }
        int length=1;
        ListNode node = head;
        while (node.next != null) {
            length++;
            node = node.next;
        }
        node.next = head;
        int m = k % length;
        for(int i=0;i<length-m;i++) {
            node = node.next;
        }
        head=node.next;
        node.next = null;
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        l4.next = null;
        l3.next = l4;
        l2.next = l3;
        l1.next = l2;
        rotateRight(l1, 2);
    }
}
