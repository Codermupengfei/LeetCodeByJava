/**
 * Created by OovEver on 2017/6/11.
 */
public class LeetCode234 {


    class ListNode {
          int val;
          ListNode next;
         ListNode(int x) { val = x; }
      }
/**
 * 思路
 * 找到中间位置
 * 1.对后半部分位置进行反转
 * 2.对比前后两部分是否一致
 * 3.一旦出现不一致则返回false
 * */
    public  boolean isPalindrome(ListNode head) {
        ListNode fast,slow;
        fast = head;
        slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        if (fast != null) {
            slow = slow.next;
        }
        slow = reverse(slow);
        fast = head;
        while (slow != null) {
            if (slow.val != fast.val) {
                return false;
            }
           fast=fast.next;
            slow = slow.next;
        }
        return true;

    }

    public  ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next=head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }

    public static void main(String[] args) {

    }
}
