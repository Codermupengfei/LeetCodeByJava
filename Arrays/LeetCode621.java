import java.util.Arrays;

/**
 * Created by admin on 2017/8/10.
 */
public class LeetCode621 {
    public static int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(int i=0;i<tasks.length;i++) {
            count[tasks[i] - 'A']++;
        }
        Arrays.sort(count);
        int i = 25;
        while (i >= 0 && count[i] == count[25]) {
            i--;
        }
        return Math.max((count[25] - 1) * (n + 1) + (25 - i), tasks.length);
    }

    public static void main(String[] args) {
        char[] tasks = {'A', 'A', 'A', 'B', 'B', 'C','C'};
        System.out.println(leastInterval(tasks,2));
    }
}
