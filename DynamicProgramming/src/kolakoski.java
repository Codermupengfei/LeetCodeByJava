import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.naming.InsufficientResourcesException;
import java.util.Scanner;

/**
 * Created by OovEver on 2017/8/28.
 */
public class kolakoski {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        if (n == 0 || m == 0) {
            System.out.println(0);
        } else {
            int[] a = new int[100000];
            int[] res = new int[n + 1];
            for (int i = 0; i < m; i++) {
                a[i] = sc.nextInt();
            }
            int sum = 0;
            for (int i = 0; i < a[0]&&sum<n; i++) {
                res[i] = a[0];
                sum++;
            }
            int mod = 1;
            for (int i = 1; i < n && sum < n; i++) {
                if (res[i] == 0) {
                    res[i] = a[mod];
                }
                for (int j = 0; j < res[i]&&sum<n; j++) {
                    res[sum++] = a[mod];
                }
                mod++;
                mod %= m;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(res[i]);
            }

        }
    }
}
