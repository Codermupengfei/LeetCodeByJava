import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/10/25.
 */
public class LeetCode166 {
    public static String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder res = new StringBuilder();
        res.append((numerator > 0) ^ (denominator >0) ? "-" : "");
        long num = Math.abs((long) numerator);
        long den = Math.abs((long) denominator);
        res.append(num / den);
        num %= den;
        if (num == 0) {
            return res.toString();
        }
        Map<Long, Integer> map = new HashMap<>();
        res.append(".");
        map.put(num, res.length());
        while (num != 0) {
            num *= 10;
            res.append(num / den);
            num %= den;
            if (map.containsKey(num)) {
                int index = map.get(num);
                res.insert(index, '(');
                res.append(')');
                return res.toString();
            } else {
                map.put(num, res.length());
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(fractionToDecimal(22, 7));
    }
}
