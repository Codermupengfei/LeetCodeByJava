import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/7/8.
 * 递归处理左边部分
 * 再处理右边部分
 *
 */
public class LeetCode22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if (n <= 0) {
            return res;
        }
        generate(res, "", n, n);
        return res;
    }

    void generate(List res, String cur, int left, int right) {
        if (left == 0 && right == 0) {
            res.add(cur);
            return;
        }
        if (left > 0) {
            generate(res, cur + "(", left - 1, right);
        }
        if (right > 0 && right > left) {
            generate(res, cur + ")", left, right-1);
        }
    }
}
