import com.sun.org.apache.bcel.internal.generic.POP2;

/**
 * Created by OovEver on 2017/10/1.
 */
public class LeetCode43 {
    public static String multiply(String num1, String num2) {
        int mLength1 = num1.length();
        int mLength2 = num2.length();
        int[] pos = new int[mLength1 + mLength2];
        for(int m=mLength1-1;m>=0;m--) {
            for(int n=mLength2-1;n>=0;n--) {
                int mul = (num1.charAt(m)-'0') * (num2.charAt(n)-'0');
                int sum;
                int p1 = m + n;
                int p2 = m + n + 1;
                sum = mul + pos[p2];
                pos[p1] += sum / 10;
                pos[p2] = sum % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int p : pos) {
            if (!(sb.length() == 0 && p == 0)) {
                sb.append(p);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        String num1 = "123";
        String num2 = "45";
        System.out.println(multiply(num1, num2));
    }
}
