import java.util.Stack;

/**
 * Created by OovEver on 2017/6/12.
 */
public class LeetCode445 {
    /**
     * 思路
     * 用栈来处理
     * 首先将两个链表的所有数入栈
     * 然后对栈中的元素求和
     * 取模放到新的栈中
     * */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> l1Stack = new Stack<>();
        Stack<Integer> l2Stack = new Stack<>();
        while (l1 != null) {
            l1Stack.add(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            l2Stack.add(l2.val);
            l2 = l2.next;
        }
        int sum=0;
        ListNode list = new ListNode(0);
        while (!l1Stack.empty() || !l2Stack.empty()) {
            if(!l1Stack.empty()) sum += l1Stack.pop();
            if(!l2Stack.empty()) sum += l2Stack.pop();
            list.val = sum % 10;
            ListNode head = new ListNode(sum/10);
            head.next = list;
            list = head;
            sum /= 10;
        }
        return list.val == 0 ? list.next : list;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(4);
        ListNode list2 = new ListNode(6);
        ListNode list3 = new ListNode(5);
        ListNode list4 = new ListNode(3);
        list1.next = list2;
        list3.next = list4;
        addTwoNumbers(list1, list3);
    }
}
