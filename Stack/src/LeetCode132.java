import java.util.Stack;

/**
 * Created by OovEver on 2017/11/1.
 * 最左侧的数最小
 */
public class LeetCode132 {
    public static boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>(); // push aj before ai (i < j, ai < aj)
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else {
//                while循环 看例子35034，处理不连续132模式
                while (!stack.empty()) {
                    if (stack.peek() >= num) break;
                    stack.pop();
                    if (stack.pop() > num) return true;
                }
                stack.push(num);
                stack.push(min);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,0,3,4};
        System.out.println(find132pattern(nums));

    }
}
