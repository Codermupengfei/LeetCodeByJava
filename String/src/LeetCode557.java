




/**
 * Created by OovEver on 2017/7/9.
 */
public class LeetCode557 {
    public static String reverseWords(String s) {
        if (s.length() < 1) {
            return s;
        }
        String result = "";
        String[] sToArr = s.split(" ");
       for(int i=0;i<sToArr.length-1;i++) {
           result = result + reverse(sToArr[i])+" ";
       }
        result = result + reverse(sToArr[sToArr.length - 1]);
        return result;
    }
    private static java.lang.String reverse(java.lang.String s) {
        if (s.length() < 1) {
            return s;
        }
        java.lang.String result = "";
        for(int i=s.length()-1;i>=0;i--) {
            result =result+s.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

}
