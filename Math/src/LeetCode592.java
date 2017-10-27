import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/7/13.
 */
public class LeetCode592 {
    public String fractionAddition(String expression) {
        List<String> nums = new ArrayList<>();
        int i = 0, j = 0;
        while (j <= expression.length()) {
            if (j == expression.length() || j != i && (expression.charAt(j) == '+' || expression.charAt(j) == '-')) {
                if (expression.charAt(i) == '+') {
                    nums.add(expression.substring(i + 1, j));
                } else {
                    nums.add(expression.substring(i, j));
                }
                i = j;
            }
            j++;
        }
        String result = "0/1";

        for (String num : nums) {
            result = add(result, num);
        }

        return result;
    }

    private String add(String s1, String s2) {
        String[] sa1 = s1.split("/");
        String[] sa2 = s2.split("/");
        int m1 = Integer.parseInt(sa1[0]);
        int d1 = Integer.parseInt(sa1[1]);
        int m2 = Integer.parseInt(sa2[0]);
        int d2 = Integer.parseInt(sa2[1]);
        int calM=m1*d2+m2*d1;
        int calD = d1 * d2;
        if (calM == 0) {
            return "0/1";
        }
        boolean isNegative = false;
        isNegative = calM*calD < 0 ? true : false;
        calM = Math.abs(calM);
        calD = Math.abs(calD);
        int gc = gcd(calM, calD);
        return (isNegative ? "-" : "") + calM / gc + "/" + calD / gc;
    }

    private int gcd(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        return  gcd(b, a % b);
    }
}
