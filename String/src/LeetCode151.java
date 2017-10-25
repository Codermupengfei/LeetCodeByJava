/**
 * Created by OovEver on 2017/10/25.
 */
public class LeetCode151 {
    public static String reverseWords(String s) {
        String[] par = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=par.length-1;i>0;i--) {
            sb.append(par[i] + " ");
        }
        return sb.append(par[0]).toString();
    }
    public static String test( String s) {
        String[] parts = s.trim().split("\\s+");
        String out = "";
        for (int i = parts.length - 1; i > 0; i--) {
            out += parts[i] + " ";
        }
        return out + parts[0];
    }

    public static void main(String[] args) {
        System.out.println(test(" "));
        System.out.println(reverseWords(" "));
    }

}
