import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by OovEver on 2017/10/1.
 */
public class LeetCode681 {
    public static String nextClosestTime(String time) {
        if (time == null) {
            return null;
        }
        char[] charTime = new char[4];
        charTime[0] = time.charAt(0);
        charTime[1] = time.charAt(1);
        charTime[2] = time.charAt(3);
        charTime[3] = time.charAt(4);
        Arrays.sort(charTime);
        System.out.println(charTime);
        for(int i=0;i<4;i++) {
            if (charTime[i] > time.charAt(4)) {
                charTime[3] = charTime[i];
                System.out.println(charTime[3]);
                return "" + time.charAt(0) + "" + "" + time.charAt(1) + "" + ":" + "" + time.charAt(3) + "" + "" + charTime[3];
            }
        }
        System.out.println(charTime[0] + charTime[1] + ":" + charTime[2] + charTime[3]);
        for(int i=0;i<4;i++) {
            if (charTime[i] > time.charAt(3) && charTime[i] - '0' < 6) {
                charTime[2] = charTime[i];
                charTime[3] = charTime[0];
                return "" + time.charAt(0) + "" + "" + time.charAt(1) + "" + ":" + "" + charTime[2] + "" + "" + charTime[3];
            }
        }
        for(int i=0;i<4;i++) {
            if (charTime[i] > time.charAt(1) && (charTime[i] - '0' < 4 || time.charAt(0) - '0' < 2)) {
                charTime[1] = charTime[i];
                charTime[2] = charTime[0];
                charTime[3] = charTime[0];
                return "" + time.charAt(0) + "" + "" + charTime[1] + "" + ":" + "" + charTime[2] + "" + "" + charTime[3];
            }
        }
        for(int i=0;i<4;i++) {
            if (charTime[i] > time.charAt(0) && charTime[i] < '3') {
                char temp = charTime[i];
                charTime[1] = charTime[0];
                charTime[2] = charTime[0];
                charTime[3] = charTime[0];
                charTime[0] = temp;
                return "" + charTime[0] + "" + "" + charTime[1] + "" + ":" + "" + charTime[2] + "" + "" + charTime[3];

            }
        }
        charTime[1] = charTime[0];
        charTime[2] = charTime[0];
        charTime[3] = charTime[0];
        return "" + charTime[0] + "" + "" + charTime[1] + "" + ":" + "" + charTime[2] + "" + "" + charTime[3];
    }


    public static void main(String[] args) {
        String time = "13:55";
        System.out.println(nextClosestTime(time));

    }

}
