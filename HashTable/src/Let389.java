/**
 * Created by OovEver on 2017/4/24.
 */
public class Let389 {
    public char findTheDifference(String s, String t) {
        char c=0;
        for (int i=0;i<s.length();i++){
            c^=s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            c^=t.charAt(j);
        }
        return c;
    }


}
