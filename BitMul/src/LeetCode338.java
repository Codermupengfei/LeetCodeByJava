/**
 * Created by OovEver on 2017/7/7.
 */
public class LeetCode338 {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        res[0] = 0;
        for(int i=1;i<=num;i++) {
            res[i] = res[i / 2] + i % 2;
        }
        return res;
    }
}
