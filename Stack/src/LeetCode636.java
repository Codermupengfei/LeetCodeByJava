import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by OovEver on 2017/11/1.
 * http://blog.csdn.net/huanghanqian/article/details/77160234
 */
public class LeetCode636 {
    public static int[] exclusiveTime(int n, List<String> logs) {

        Stack < Integer > stack = new Stack< >();
        int[] res = new int[n];
//        ��һ��ֻ������start
        String[] s = logs.get(0).split(":");
        stack.push(Integer.parseInt(s[0]));
        int i = 1, prev = Integer.parseInt(s[2]);
        while (i < logs.size()) {
            s = logs.get(i).split(":");
            if (s[1].equals("start")) {
                if (!stack.isEmpty())
                    res[stack.peek()] += Integer.parseInt(s[2]) - prev;//����㣬�յ㲻��
                stack.push(Integer.parseInt(s[0]));
                prev = Integer.parseInt(s[2]);
            } else {
                res[stack.peek()] += Integer.parseInt(s[2]) - prev + 1;//����㣬�յ�Ҳ��
                stack.pop();
                prev = Integer.parseInt(s[2]) + 1;//s[2]�Ѿ������˸�function���յ㣬��������Ϊ���(���϶���)
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        List<String> logs = new ArrayList<>();
        logs.add("0:end:10");
//        logs.add("0:end:2");
//        logs.add("1:start:1");
//        logs.add("1:end:3");
        System.out.println(exclusiveTime(1, logs)[0]);
//        System.out.println(exclusiveTime(2, logs)[1]);

    }
}
