/**
 * Created by OovEver on 2017/10/25.
 */
public class LeetCode8 {
    public static int myAtoi(String str) {
        int index = 0, total = 0, sign = 1;
//        �ж��Ƿ�Ϊ��
        if (str.length() == 0) {
            return 0;
        }
//        ȥ��ǰ���"
        while (index < str.length() && str.charAt(index) == ' ') {
            index++;
        }
//        �жϷ���
        if (index < str.length() && (str.charAt(index) == '+' || str.charAt(index) == '-')) {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }
        while (index < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }
            if (Integer.MAX_VALUE / 10 < total || (Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            total = total * 10 + digit;
        }
        return total;

    }

    public static void main(String[] args) {
        String s = "2147483648";
        System.out.println(myAtoi(s));
    }
}
