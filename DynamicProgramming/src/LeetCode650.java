import com.sun.xml.internal.bind.v2.model.core.ID;
import sun.misc.FpUtils;

/**
 * Created by OovEver on 2017/8/15.
 */
public class LeetCode650 {
    public int minSteps(int n) {
        int[] dp = new int[n + 1];
        for(int i=2;i<=n;i++) {
            dp[i] = i;
            for(int j=i-1;j>1;j--) {
//                判断j是否能被i整除
                if (i % j == 0) {
                    dp[i] = dp[j] + i / j;
                    break;
                }
            }
        }
        return dp[n];
    }
}
