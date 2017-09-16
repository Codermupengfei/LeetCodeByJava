/**
 * Created by OovEver on 2017/9/16.
 */
public class LeetCode467 {
    public static int findSubstringInWraproundString(String p) {
        int[] count = new int[26];
        int maxCur = 0;
        for(int i=0;i<p.length();i++) {
            if (i > 0 && (p.charAt(i) - p.charAt(i - 1) == 1 || p.charAt(i-1) - p.charAt(i) == 25)) {
                maxCur++;

            } else {
                maxCur = 1;
            }
            int index = p.charAt(i) - 'a';
            count[index] = Math.max(count[index], maxCur);

        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum += count[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        findSubstringInWraproundString("a");
    }
}
