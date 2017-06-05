/**
 * Created by OovEver on 2017/5/22.
 */
public class Let392 {
    public static boolean isSubsequence(String s, String t) {
        boolean flag=false;
        int j=0;
        int len=0;
        for(int i=0;i<s.length();i++)
            for(;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    len++;
                    j++;
                    break;
                }
            }
        if(len==s.length())
            flag=true;
        return flag;

    }

    public static void main(String[] args) {
        String s="abc";
        String t="ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
