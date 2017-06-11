/**
 * Created by OovEver on 2017/6/11.
 */


  class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
/**
 * 思路：
 * 链表的插入排序
 * 首先声明一个要插入的节点headHelper
 * 声明当前要插入的节点cur
 * 在pre与pre.next之间插入节点
 * 声明下一个要插入的节点Next
 * */
public class LeetCode147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode headHelper=new ListNode(-1);
        ListNode cur;
        ListNode pre=headHelper;
        ListNode next;
        cur=head;
        while (cur != null) {
            next = cur.next;
            while (pre.next != null && pre.next.val < cur.val) {
                pre = pre.next;
            }
            cur.next=pre.next;
            pre.next=cur;
            pre = headHelper;
            cur = next;
        }
        return headHelper.next;

    }
}
