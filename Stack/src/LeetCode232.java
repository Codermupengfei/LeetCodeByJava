import java.util.Stack;

/**
 * Created by OovEver on 2017/7/5.
 */
public class LeetCode232 {
   static class MyQueue {
        Stack<Integer> stack=new Stack<Integer>();
        /** Initialize your data structure here. */
        public MyQueue() {
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            Stack<Integer> temp = new Stack<>();
            while (!stack.isEmpty()) {
                temp.add(stack.pop());
            }
            stack.add(x);
            while (!temp.isEmpty()) {
                stack.add(temp.pop());
            }

        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return stack.pop();
        }

        /** Get the front element. */
        public int peek() {
            return stack.peek();
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return stack.empty();
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        System.out.println(myQueue.peek());
    }
}
