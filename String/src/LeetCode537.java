/**
 * Created by OovEver on 2017/7/10.
 * 运用数学公式
 * 复数乘法公式：(a1+b1i)*(a2+b2i) = (a1a2 - b1b2) + (a1b2+a2b1)i
 */
public class LeetCode537 {
    public static String complexNumberMultiply(String a, String b) {
        if (a.length() == 0) {
            return "0";
        }
        if (b.length() == 0) {
            return "0";
        }
        String[] A = a.split("\\+");
        String[] B = b.split("\\+");
        int a1 = Integer.parseInt(A[0]);
        int a2 = Integer.parseInt(A[1].replace("i",""));
        int b1 = Integer.parseInt(B[0]);
        int b2 = Integer.parseInt(B[1].replace("i", ""));
        String res = "";
        res = a1 * b1 - a2 * b2 + "+" + (a1 * b2 + a2 * b1) + "i";
        return res;
    }

    public static void main(String[] args) {
        String s1 = "1+0i";
        String s2 = "1+0i";
        System.out.println(complexNumberMultiply(s1, s2));
    }
}
