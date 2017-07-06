import java.util.*;

/**
 * Created by OovEver on 2017/7/6.
 */
public class LeetCode71 {

    public String simplifyPath(String path) {
        Set<String> set = new HashSet<>(Arrays.asList(".","..",""));
        Stack<String> stack = new Stack<>();
        for (String dir : path.split("/")) {
            if (!stack.isEmpty() && dir.equals("..")) {
                stack.pop();
            } else {
                if (!set.contains(dir)) {
                    stack.push(dir);
                }
            }
        }
        String res = "";
        while (!stack.empty()) {
            res = "/" + stack.pop() + res;
        }
        return res.isEmpty() ? "/" : res;
    }
}
