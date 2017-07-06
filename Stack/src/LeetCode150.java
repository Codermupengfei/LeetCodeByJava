import java.util.Stack;

/**
 * Created by OovEver on 2017/7/5.
 */
public class LeetCode150 {
    public int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return 0;
        }
        int a,b;
        Stack<Integer> stack = new Stack<>();
        for (String s : tokens) {
            if (s.equals("+")) {
                a = stack.pop();
                b = stack.pop();
                stack.add(a + b);
            } else if (s.equals("-")) {
                a = stack.pop();
                b = stack.pop();
                stack.add(b - a);
            } else if (s.equals("/")) {
                a = stack.pop();
                b = stack.pop();
                stack.add(b/a);
            } else if (s.equals("*")) {
                a = stack.pop();
                b = stack.pop();
                stack.add(b * a);
            } else {
                stack.add(Integer.parseInt(s));
            }
        }
        return stack.pop();

    }
}
