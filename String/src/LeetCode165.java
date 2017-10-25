/**
 * Created by OovEver on 2017/10/24.
 */
public class LeetCode165 {
    public int compareVersion(String version1, String version2) {
        String[] levels1 = version1.split("\\.");
        String[] levels2 = version2.split("\\.");
        int length = Math.max(levels1.length, levels2.length);
        for(int i=0;i<length;i++) {
            int v1 = i < levels1.length ? Integer.parseInt(levels1[i]) : 0;
            int v2 = i < levels2.length ? Integer.parseInt(levels2[i]) : 0;
            if (v1 != v2) {
                return v1 > v2 ? 1 : -1;
            }
        }
        return 0;
    }
}
