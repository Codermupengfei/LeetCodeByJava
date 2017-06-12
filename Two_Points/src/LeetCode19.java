/**
 * Created by OovEver on 2017/6/12.
 */
public class LeetCode19 {
    /**
     *思路
     * 1.首先判断出链表的长度
     * 2.链表的长度减去n则是要删除的元素的位置
     * 3.将相应元素删除
     * */
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode start = new ListNode(0);
        ListNode slow = start, fast = start;
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
        for(int i=1; i<=n+1; i++)   {
            fast = fast.next;
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
//        ListNode list2 = new ListNode(2);
//        list1.next=list2;
//        list2.next = null;
        removeNthFromEnd(list1, 1);
    }
}
