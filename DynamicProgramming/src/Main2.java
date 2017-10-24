import java.util.Scanner;

/**
 * Created by OovEver on 2017/9/18.
 */
public class Main2 {
    public static int climbStairs(int n) {
        if (n == 0) {
            return 1;
        }
        if ( n == 1 || n == 2) {
            return n;
        }
        int[] number = new int[n + 1];
        number[1]=1;
        number[2]=2;
        for(int i=3;i<=n;i++) {
            number[i] = number[i - 1] + number[i - 2];
        }
        return number[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            System.out.println(climbStairs(n));
        }
    }
}
