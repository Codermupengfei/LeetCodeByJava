import java.util.Stack;

/**
 * Created by OovEver on 2017/7/5.
 */
public class LeetCode155 {
  static  class MinStack {

        /**
         * initialize your data structure here.
         */
        Stack<Integer> stack;
        int min = Integer.MAX_VALUE;

        public MinStack() {
            stack = new Stack<Integer>();
        }

        public void push(int x) {
            if (x <= min) {
                stack.push(min);
                min = x;
            }
            stack.push(x);
        }

        public void pop() {
            if(stack.pop()==min) min=stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new LeetCode155.MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(1);
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.top());
    }
}
