/**
 * Created by OovEver on 2017/6/12.
 */
public class LeetCode328 {
    /**
     * 思路
     * 建立两个节点分别存储奇数节点与偶数节点
     * 最后将两个节点进行连接
     *
     * */
    public static ListNode oddEvenList(ListNode head) {
        if (head != null) {
            ListNode oddHead;
            ListNode even;
            ListNode evenHead;
            oddHead = head;
            even = head.next;
            evenHead = even;
            while (even != null && even.next != null) {
                oddHead.next = oddHead.next.next;
                even.next = even.next.next;
                oddHead = oddHead.next;
                even = even.next;
            }
            oddHead.next = evenHead;

        }
        return head;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(0);
        oddEvenList(list1);
    }
}
