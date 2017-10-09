import java.util.List;

/**
 * Created by OovEver on 2017/10/2.
 */
public class LeetCode539 {
    public int findMinDifference(List<String> timePoints) {
        boolean[] marks = new boolean[24 * 60];
        for (String times : timePoints) {
            String[] t = times.split(":");
            int h = Integer.parseInt(t[0]);
            int m = Integer.parseInt(t[1]);
            if (marks[h * 60 + m]) {
                return 0;
            }
            marks[h * 60 + m] = true;
        }
        int prev = 0;
        int min = Integer.MAX_VALUE;
        int first = Integer.MAX_VALUE;
        int last = Integer.MIN_VALUE;
        for(int i=0;i<24*60;i++) {
            if (marks[i]) {
                if (first != Integer.MAX_VALUE) {
                    min = Math.min(i - prev, min);
                }
                first = Math.min(first, i);
                last = Math.max(last, i);
                prev = i;
            }
        }
        return Math.min(min, (24 * 60 - last + first));
    }
}
