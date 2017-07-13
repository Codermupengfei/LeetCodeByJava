import java.util.function.IntToDoubleFunction;

/**
 * Created by OovEver on 2017/7/12.
 * 思路
 * 将每个string的每位转化为int
 * 两个int相加并与carry相加
 * carry是两个int相加除10
 */
public class LeetCode415 {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0 || carry == 1) {
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            int sum = x + y + carry;
            stringBuilder.insert(0, String.valueOf(sum%10));
            carry = sum / 10;
            i--;
            j--;


        }
        return stringBuilder.toString();
    }
}
