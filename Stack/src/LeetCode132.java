import java.util.Stack;

/**
 * Created by OovEver on 2017/11/1.
 * ����������С
 */
public class LeetCode132 {
    public static boolean find132pattern(int[] nums) {
        Stack<Integer> stack = new Stack<>(); // push aj before ai (i < j, ai < aj)
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= min) {
                min = num;
            } else {
//                whileѭ�� ������35034����������132ģʽ
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
