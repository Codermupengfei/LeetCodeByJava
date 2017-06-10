/**
 * Created by OovEver on 2017/6/9.
 */
public class Leetcode44 {
    /**
     * 思路
     * 1.首先判断当前单一的(?或者匹配)p字符与s字符是否匹配
     * 2.然后判断是否有*匹配支付
     * 3.然后判断之前是否有*字符
     * 4.如果都没有就是第一个字符不匹配则返回False
     * 5.之后判断*之后是否还有*
     * 如果初始的p的值和p的长度相等，则匹配成功，否则匹配失败
     *
     * */
    public static boolean isMatch(String s, String p) {
        boolean res = false;
        if(s==null)
            return res;
        int sLength=0;
        int pLength=0;
//        *的起始位置
//        匹配的字符数
        int match=0;
        int startI=-1;
        while (sLength < s.length()) {
//            判断第一个字符是否匹配
            if (pLength < p.length() && (p.charAt(pLength) == '?' || p.charAt(pLength) == s.charAt(sLength))) {
                pLength++;
                sLength++;
            }
//            判断是否有通配符
            else if (pLength < p.length() && (p.charAt(pLength) == '*')) {
                startI=pLength;
                match=sLength;
                pLength++;
            }
            //出现*字符串
            else if (startI != -1) {
            pLength=startI+1;
                match++;
                sLength = match;

            }
            else
                return false;
        }
        while ( pLength < p.length() &&p.charAt(pLength) == '*') {
            pLength++;
        }
        return pLength==p.length();
    }

    public static void main(String[] args) {
        String s="a";
        String p = "*b";
        System.out.println(isMatch(s,p));
    }
}
