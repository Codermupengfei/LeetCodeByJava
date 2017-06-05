import java.util.HashSet;
import java.util.Set;

/**
 * Created by OovEver on 2017/5/3.
 */
public class Let409 {
    public int longestPalindrome(String s) {
        int count=0;
        Set<Character> set=new HashSet<Character>();
        for(char c:s.toCharArray()){
            if(set.contains(c)){
                set.remove(c);
                count+=2;
            }else {
                set.add(c);
            }

        }
        count+=set.size()>0?1:0;
        return count;
    }
}
