/**
 * Created by OovEver on 2017/7/9.
 */
public class LeetCode58 {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        String []sToChar = s.split(" ");
        if (sToChar.length == 0) {
            return 0;
        }
        return sToChar[sToChar.length - 1].length();
//        return s.trim().length()-s.trim().lastIndexOf(" ")-1;
    }

    public static void main(String[] args) {
        String a = "aa bb c" ;
        System.out.println(a.trim().length());
        System.out.println(a.trim().lastIndexOf(" "));

    }
}
