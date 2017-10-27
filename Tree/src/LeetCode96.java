/**
 * Created by OovEver on 2017/7/2.
 * http://blog.csdn.net/u012501459/article/details/46622501
 */
public class LeetCode96 {
    public int numTrees(int n) {
        int G[] = new int[n + 1];
        G[0] = G[1] = 1;
        for(int i=0;i<=n;i++) {
            for(int j=i;j<=i;j++) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }
}
