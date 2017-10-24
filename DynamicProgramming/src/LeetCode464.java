import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by OovEver on 2017/10/24.
 */
public class LeetCode464 {
   static Map<String, Boolean> map;
   static boolean[]            used;

    public static boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        int sum = (1 + maxChoosableInteger) * maxChoosableInteger / 2;
        if (sum < desiredTotal) return false;
        if (desiredTotal <= 0) return true;

        map = new HashMap<>();
        used = new boolean[maxChoosableInteger + 1];
        return helper(desiredTotal);
    }

    private static boolean helper(int desiredTotal) {
        if (desiredTotal <= 0) return false;
        String key = Arrays.toString(used);
        if (!map.containsKey(key)) {
            for (int i = 1; i < used.length; i++) {
                if (!used[i]) {
                    used[i] = true;
                    if (!helper(desiredTotal - i)) {
                        map.put(key, true);
                        used[i] = false;
                        return true;
                    }
                    used[i] = false;
                }
            }
            map.put(key, false);
        }
        return map.get(key);
    }

    public static void main(String[] args) {
        System.out.println(canIWin(2, 2));
    }
}
