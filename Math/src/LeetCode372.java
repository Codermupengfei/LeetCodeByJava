/**
 * Created by OovEver on 2017/10/26.
 *  (a*b)%c = (a%c)*(b%c)%c
 *  ��a/c=m,��mc+a%c =a;��b/c=n,��nc+b%c =b;����
 (a*b)%c
 = { (mc+a%c)*(nc+b%c ) }%c
 = {mcnc+(nc)*(a%c)+(mc)*(b%c)+(a%c)*(b%c)} % c (���� mcnc+(nc)*(a%c)+(mc)*(b%c)��������c)
 = (a%c)*(b%c)%c
 */
public class LeetCode372 {
    public static int superPow(int a, int[] b) {
        int res = 1;
       for(int i=0;i<b.length;i++) {
           res = pow(res, 10) * pow(a, b[i]) % 1337;
       }
        return res;
    }

    public static int pow(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a % 1337;
        }
        return pow(a % 1337, b / 2) * pow(a % 1337, b - b / 2) % 1337;
    }

    public static void main(String[] args) {
        int[] b = {1,0};
        System.out.println(superPow(2, b));
    }
}
