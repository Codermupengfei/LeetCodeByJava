import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.HashMap;

/**
 * Created by OovEver on 2017/7/9.
 */
public class LeetCode551 {
    public static boolean checkRecord(String s) {
        int aLength = 0;
        int lLength = 0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == 'A') {
                aLength++;
                lLength = 0;
            } else if (s.charAt(i) == 'L') {
                lLength++;
            } else {
                lLength = 0;
            }
            if (aLength > 1) {
                return false;
            }
            if (lLength > 2) {
                return false;
            }
        }
        return true;
//        if(s.indexOf("A") != s.lastIndexOf("A") || s.contains("LLL"))
//            return false;
//        return true;
    }

    public static void main(String[] args) {
        String s = "LALLL";
        System.out.println(checkRecord(s));
    }
}
