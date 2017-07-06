import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by OovEver on 2017/7/5.
 */
public class LeetCode225 {
    class MyStack {
        Queue<Integer> queue;

        /**
         * Initialize your data structure here.
         */
        public MyStack() {
            queue = new LinkedList<>();
        }

        /**
         * Push element x onto stack.
         */
        public void push(int x) {
            queue.add(x);
            for(int i=0;i<queue.size()-1;i++) {
                queue.add(queue.poll());
            }
        }

        /**
         * Removes the element on top of the stack and returns that element.
         */
        public int pop() {
          return  queue.poll();
        }

        /**
         * Get the top element.
         */
        public int top() {
            return queue.peek();
        }

        /**
         * Returns whether the stack is empty.
         */
        public boolean empty() {
            return queue.isEmpty();
        }
    }
    public static void main(String[] args) {
        Queue<Integer> test = new LinkedList<>();
        test.add(1);
        test.add(2);
        System.out.println(test.peek());
        Stack<Integer> testS = new Stack<>();
        testS.push(1);
        testS.push(2);
        System.out.println(testS.peek());

    }
}
