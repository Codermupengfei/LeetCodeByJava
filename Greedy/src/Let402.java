import java.util.Stack;

/**
 * Created by OovEver on 2017/6/8.
 */
public class Let402 {

    /**
     * 思路：
     * 1.对于num为空或者num的长度小于k则返回0
     * 2.对于其他情况，寻找出现下降位置的数字，则前一个数字就是需要删除的
     * 3.用栈进行处理
     * 4.删除后的元素即最小元素，对元素中含有0的地方进行删除
     * 5.若果到最后都没有下降的元素，则删除最后一个元素即可
     *
     *
     * */
    public String removeKdigits(String num, int k) {
        String res=null;
//        字符为空或者字符的长度小于要删除的数字
        if (num == null || num.length() < k) {
            return "0";
        }
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0;i<num.length();i++) {
//            获取当前数字
            int cur = num.charAt(i) - '0';
//            当前栈不为空，并且当前元素小于栈顶元素，并且剩余的元素要大于等于num.length-k
            while (!stack.empty() && cur < stack.peek() && num.length() - i - 1 >= num.length() - k - stack.size()) {
                stack.pop();
            }
            if (stack.size() < num.length() - k) {
                stack.push(cur);
            }
        }
        StringBuilder s = new StringBuilder();
//        当栈不为空，则将栈中的数据放到string中
        while (!stack.empty()) {
            s.insert(0, stack.pop());
        }
//        去除含有0的数字
        while (s.length()>0&&s.charAt(0)=='0')
            s.deleteCharAt(0);
        if (s.length() == 0) {
            return "0";
        }
        return s.toString();
    }
}
