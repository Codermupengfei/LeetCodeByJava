/**
 * Created by OovEver on 2017/6/11.
 */
public class LeetCode344 {
    /**
     * 思路
     * 倒序遍历string存入到char数组中
     * 将char转化为string
     * */
    public static String reverseString(String s) {
        if(s==null)
            return null;
        if (s.length() == 1) {
            return s;
        }
        char[] sToChar = new char[s.length()];
        for(int i=s.length()-1;i>=0;i--) {
            sToChar[s.length() - 1 - i] = s.charAt(i);
        }
        return new String(sToChar);
    }

    public static void main(String[] args) {
        String s = "hello";
        char []a = {s.charAt(1)};
        String res = new String(a);
        System.out.println(res);
        System.out.println(reverseString(s));
    }
}
