import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by OovEver on 2017/10/26.
 */
public class LeetCode60 {
    public static String getPermutation(int n, int k) {
        ArrayList<Integer> list = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int factorial = 1;
        for(int i = 2; i <= n - 1; i ++)
            factorial *= i;
        for(int i = 1; i <= n; i ++)
            list.add(i);
        k --;
        int round = n - 1;
        while(round >= 0) {
            int num = list.get(k / factorial);
            sb.append(num);
            list.remove(k / factorial);
            if(round > 0) {
                k = k % factorial;
                factorial /= round;
            }
            round --;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(getPermutation(3, 2));
    }
}
