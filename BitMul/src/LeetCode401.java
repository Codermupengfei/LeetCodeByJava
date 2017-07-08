import java.util.ArrayList;
import java.util.List;

/**
 * Created by OovEver on 2017/7/6.
 */
public class LeetCode401 {
    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        for(int i=0;i<12;i++) {
            for(int j=0;j<60;j++) {
//                乘64的原因是表示分数的有6位最大能表示的数是64
                if (Integer.bitCount(i * 64 + j) == num) {
                    result.add(String.format("%d:%02d", i, j));
                }
            }
        }
        return result;
    }
}
