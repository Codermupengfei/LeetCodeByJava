import java.util.HashSet;
import java.util.Set;

/**
 * Created by OovEver on 2017/5/15.
 */
public class Let575 {
    public int distributeCandies(int[] candies) {
        int total=candies.length;
        Set<Integer> kinds=new HashSet<>();
        for(int kind:candies)
            kinds.add(kind);
        if(kinds.size()>total/2)
            return total/2;
        else
            return kinds.size();
    }


}
