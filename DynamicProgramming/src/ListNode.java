import java.util.Stack;

public class ListNode {
    int val;
     ListNode next;
      ListNode(int x) { val = x; }

  }

class solve {
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        Stack<Integer> st = new Stack();
        ListNode tail = head;
        while (tail != null) {
            st.push(tail.val);
            tail = tail.next;
        }
        while (head != null) {
            if (head.val != st.pop()) return false;
            head = head.next;
        }
        return true;
    }
}