/**
 * Created by OovEver on 2017/7/9.
 */
public class LeetCode434 {
    public static int countSegments(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int res = 0;
        for(int i=0;i<s.length();i++) {
//            判断当前字符不为空 且前一个字符为空 就加1
            if (s.charAt(i) != ' ' && (i == 0 || s.charAt(i - 1) == ' ')) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        String s = ", , , ,        a, eaefa";
        System.out.println(countSegments(s));
    }
}
