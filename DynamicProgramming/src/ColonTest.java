import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by OovEver on 2017/5/25.
 */
public class ColonTest {

    /**
     * 考虑顺序，即顺序不一样，对象就不一样
     * @param candidate
     * @param prefix
     */
    private static void withSequenceCompose(List<String> candidate,String prefix){
        System.out.println(prefix);
        for(int i=0;i<candidate.size();i++){
            List<String> temp = new ArrayList<String>(candidate);
            withSequenceCompose(temp,prefix+temp.remove(i));
        }
    }

    /**
     * 不考虑顺序，只生产包含不一样元素的数组
     * @param candidate
     * @param prefix
     * @param index
     */
    public static void noSequenceCompose(List<String> candidate, String prefix, int index) {
        System.out.println(prefix);

        for(int i=index;i<candidate.size();i++) {
            List<String> tmp = new ArrayList<String>(candidate);
            noSequenceCompose(tmp, prefix + tmp.remove(i),i);
        }
    }

    public static void main(String[] args){
        String[] strArray = {"a","b","c"};
        List<String> strList = Arrays.asList(strArray);

        System.out.println("忽略顺序 ====================");
        noSequenceCompose(strList,"",0);
        System.out.println("\n\n考虑顺序 ====================");
        withSequenceCompose(strList,"");
    }
}
