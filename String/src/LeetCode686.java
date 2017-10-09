import javax.xml.parsers.FactoryConfigurationError;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;

/**
 * Created by OovEver on 2017/10/2.
 */
public class LeetCode686 {
    public static int repeatedStringMatch(String A, String B) {
        int count = 0;
        StringBuilder sb = new StringBuilder();
        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }
        if (sb.toString().contains(B)) {
            return count;
        }
        if (sb.append(A).toString().contains(B)) {
            return ++count;
        }
        return -1;

    }





}
