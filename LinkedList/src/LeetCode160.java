/**
 * Created by OovEver on 2017/6/12.
 */
public class LeetCode160 {
    /**
     * 思路
     * 由于两个链表相交后的部分是一样的
     * 所以可以首先判断两个链表的长度
     * 对链表长度做处理
     * 使两个链表程度相同时再进行比较
     *
     * */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = getLength(headA);
        int lenB = getLength(headB);
        while (lenA > lenB) {
            lenA--;
            headA = headA.next;
        }
        while (lenB > lenA) {
            lenB--;
            headB = headB.next;
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }

    int getLength(ListNode node) {
        int length=0;
        if (node == null) {
            return 0;
        }
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
}
