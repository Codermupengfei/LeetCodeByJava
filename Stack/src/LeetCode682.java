import java.beans.beancontext.BeanContext;
import java.util.Stack;

/**
 * Created by OovEver on 2017/10/31.
 */
public class LeetCode682 {
    public int calPoints(String[] ops) {
        if (ops == null || ops.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int total = 0, temp = 0, new_ops = 0;
        for(int i=0;i<ops.length;i++) {
            switch (ops[i]) {
                case "+":
                    if (stack.size() > 1) {
                        temp = stack.pop();
                        new_ops = stack.peek() + temp;
                        stack.push(temp);
                        stack.push(new_ops);
                        total += new_ops;
                    }
                    break;
                case "C":
                    if (!stack.isEmpty()) {
                        total -= stack.pop();
                    }
                    break;
                case "D":
                    if (!stack.isEmpty()) {
                        total += stack.peek() << 1;
                        stack.push(stack.peek() << 1);
                    }
                    break;
                default:
                    temp = Integer.parseInt(ops[i]);
                    stack.push(temp);
                    total += temp;
            }
        }
        return total;
    }
}
